package main.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author supo
 * @Date 2017/3/21 20:27.
 * Copyright © mizhuanglicai
 * 闭锁
 */
public class TestHarness {
    public static long timeTasks(int nThreads,final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i=0;i<nThreads;i++){
            Thread t = new Thread(){
                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                    }
                }
            };
            t.start();
        }
        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }


    public static void main(String[] args) {
        Runnable t = () -> System.out.println(1);
        try {
            System.out.println(timeTasks(10,t));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
