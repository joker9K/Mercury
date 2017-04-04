package main.test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author supo
 * @Date 2017/3/23 22:42.
 * Copyright © mizhuanglicai
 */
public class Test6 {
    public static void main(String[] args) {
        final Executor executors = Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
            executors.execute(new task());
        }
        System.out.println(1);
    }

}
class task implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}