package main.concurrent;

import sun.security.timestamp.TSRequest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author zhangwt
 * @date 2017/5/22 下午9:24.
 * Semaphore当前在多线程环境下被扩放使用，操作系统的信号量是个很重要的概念，在进程控制方面都有应用。
 * Java并发库Semaphore 可以很轻松完成信号量控制，Semaphore可以控制某个资源可被同时访问的个数，
 * 通过 acquire() 获取一个许可，如果没有就等待，而 release() 释放一个许可。比如在Windows下可以设置共享文件的最大客户端访问个数。
 */
public class SemaPhoreTest {

    public static void main(String[] args) {
        //线程池
        ExecutorService service = Executors.newCachedThreadPool();
        //信号量,只允许5个线程同时访问
        final Semaphore semaphore = new Semaphore(5);
        //模拟50个线程同时访问
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            service.submit(() -> {
                // 获取许可
                try {
                    semaphore.acquire();
                    System.out.println("Accessing: " + finalI);
                    Thread.sleep((long) (Math.random() * 6000));
                    // 访问完后，释放
                    semaphore.release();
                    //availablePermits()指的是当前信号灯库中有多少个可以被使用
                    System.out.println("-----------------" + semaphore.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();

    }
}
