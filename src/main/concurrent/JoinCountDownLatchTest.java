package main.concurrent;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhangwt on 2017/4/10.
 */
public class JoinCountDownLatchTest {
    private static Random sr = new Random(47);
    private static AtomicInteger result = new AtomicInteger(0);
    private static int threadCount = 10;
    private static class Parser implements Runnable{
        private  String name;

        public Parser(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int sum =0;
            int seed = Math.abs(sr.nextInt());
            Random r = new Random(47);
            for(int i =0;i<100;i++){
                sum += r.nextInt(seed);
            }
            result.addAndGet(sum);
            System.out.println(name + "线程解析结果:"+sum);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[threadCount];
        for(int i =0;i< threadCount;i++){
            threads[i] = new Thread(new Parser("Parse-"+i));
        }
        for(int i=0;i<threadCount;i++){
            threads[i].start();
//            threads[i].join();//等待线程thread[i]执行完毕,有序
        }
        //所有线程同时开始执行,主线程等待所有线程执行完毕,非有序
        for(int i =0;i<threadCount;i++){
            threads[i].join();
        }
        System.out.println("所有线程解析结束!");
        System.out.println("所有线程的解析结果:"+result);
    }
}
