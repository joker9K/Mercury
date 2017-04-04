package main.concurrent;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author supo
 * @Date 2017/3/30 16:45.
 * Copyright © mizhuanglicai
 * timer抛出错误线程中断
 */
public class timerTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new ThrowTask(),1);
        Thread.sleep(1);
        timer.schedule(new ThrowTask(),1);
        Thread.sleep(5);
    }
    static class ThrowTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(1);
            throw new RuntimeException();
        }
    }
}
