package main.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author supo
 * @Date 2017/3/26 19:41.
 * Copyright © mizhuanglicai
 */
public class Test7 implements Runnable{
    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean cancelled;


    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while (!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        cancelled = true;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<>(primes);
    }

    public static void main(String[] args) throws InterruptedException {
        final Executor executor = Executors.newFixedThreadPool(100);
        Test7 task = new Test7();
        executor.execute(task);
        System.out.println(1);
        Thread.sleep(5000);
        List<BigInteger> list = task.get();
        list.forEach(System.out::println);
        task.cancel();
        list = task.get();
        list.forEach(System.out::println);
        System.out.println(2);
    }
}
