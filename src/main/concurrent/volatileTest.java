package main.concurrent;

/**
 * @author supo
 * @Date 2017/3/30 16:49.
 * Copyright © mizhuanglicai
 * 测试volatile,只保证可见性，不加锁
 */
public class volatileTest {
    public static volatile int race = 0;
    public static void increase(){
        race++;
    }

    private static final int THREADS_COUNT = 20;


    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for(int i=0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        System.out.println(race);
    }
}
