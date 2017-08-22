package main.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangwt
 * @date 2017/6/23 15:20.
 * 交换器--->允许2个并发任务间相互交换数据
 */
public class ExchangerTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        final Exchanger<String> exchanger = new Exchanger<>();


        service.execute(() -> {
            try {
                String data1 = "IPhone";
                System.out.println("线程"+Thread.currentThread().getName()+"正在把"+data1+"换出去");
                Thread.sleep((long) (Math.random()*1000));
                String data2 = exchanger.exchange(data1);
                System.out.println("线程"+Thread.currentThread().getName()+"换回的东西为"+data2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        service.execute(()->{
            try {
                String data2 = "钱";
                System.out.println("线程"+Thread.currentThread().getName()+"正在把"+data2+"换出去");
                Thread.sleep((long) (Math.random()*1000));
                String data1 = exchanger.exchange(data2);
                System.out.println("线程"+Thread.currentThread().getName()+"换回的东西为"+data1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
