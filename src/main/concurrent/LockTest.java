package main.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.IntStream;

/**
 * @author zhangwt
 * @date 2017/6/14 10:09.
 */
public class LockTest {

    private static final int NUM_INCREMENTS = 10000;
    private static ReentrantLock lock = new ReentrantLock();

    private static int count = 0;

    private static void increment(){
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    private static void testLock(){
        count = 0;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        IntStream.range(0,NUM_INCREMENTS).forEach(i->executor.submit(LockTest::increment));
        executor.shutdown();
        System.out.println(count);
    }

    public static void main(String[] args) {
        testLock();
    }

}
