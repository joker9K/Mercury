package main.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangwt on 2017/4/11.
 * 线程优先级
 */
public class SimplePriorities implements Runnable{

    private int countDown = 5;
    private volatile double d;//确保指令不被重排序
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread()+": "+countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while(true){
            for(int i= 1;i<10000000;i++){
                d += (Math.PI + Math.E)/(double)i;
                if(i%100000 == 0){
                    Thread.yield();//线程让步
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return ;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executorService.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        executorService.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        executorService.shutdown();
    }
}
