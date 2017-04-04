package main.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author supo
 * @Date 2017/3/27 12:51.
 * Copyright © mizhuanglicai
 */
public class FutureTest {
    public static void main(String[] args) {
        Callable<Integer> callable = () -> new Random().nextInt(100);
        FutureTask<Integer> future = new FutureTask<>(callable);
        Thread t = new Thread(future);
        t.start();
        try {
            System.out.println(Runtime.getRuntime().availableProcessors());
            t.join(3000);// 可能做一些事情
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
