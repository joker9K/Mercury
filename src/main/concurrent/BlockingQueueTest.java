package main.concurrent;

import java.util.concurrent.*;

/**
 * Created by zhangwt on 2017/4/28.
 * 模拟基于阻塞队列的生产者和消费者,同时验证了消费者的自旋等待
 */
public class BlockingQueueTest {

    public class Basket{
        //阻塞队列长度为5
        BlockingQueue<String> basket = new LinkedBlockingQueue<>(5);


        //生产者,将水果放入篮子
        public void produce() throws InterruptedException {
            //basket.put("an apple");//自旋等待
            basket.add("an apple");//
        }

        //消费者,将篮子中的水果取出
        public String consume() throws InterruptedException {
            //return basket.take();//自旋等待
            return basket.remove();//抛出异常
        }
    }

    class Producer implements Runnable{

        private String instance;
        private Basket basket;

        public Producer(String instance, Basket basket) {
            this.instance = instance;
            this.basket = basket;
        }

        @Override
        public void run() {
            try {
//                while (true){
                    System.out.println("生产者生产苹果:"+instance);
                    basket.produce();
//                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Consumer implements Runnable{

        private String instance;
        private Basket basket;

        public Consumer(String instance,Basket basket) {
            this.basket = basket;
            this.instance = instance;
        }

        @Override
        public void run() {
            try {
//                while (true){
                    System.out.println("消费者消费苹果:"+instance);
                    System.out.println(basket.consume());
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BlockingQueueTest blockingQueueTest = new BlockingQueueTest();

        Basket basket = blockingQueueTest.new Basket();

        ExecutorService executorService = Executors.newCachedThreadPool();

        Producer producer1 = blockingQueueTest.new Producer("生产者1",basket);
        Consumer consumer1 = blockingQueueTest.new Consumer("消费者1",basket);
        Consumer consumer2 = blockingQueueTest.new Consumer("消费者2",basket);
        Producer producer2 = blockingQueueTest.new Producer("生产者2",basket);



        executorService.submit(consumer1);
        executorService.submit(consumer2);
        System.out.println(basket.basket.size());
        //暂停5秒钟,验证消费者确实在自旋等待
        Thread.sleep(5000);
        executorService.submit(producer1);
        executorService.submit(producer2);

    }

}
