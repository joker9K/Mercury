package main.java8;

import java.time.temporal.ChronoUnit;

/**
 * @author supo
 * @Date 2017/3/30 16:20.
 * Copyright © mizhuanglicai
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        //Get local time
        java.time.LocalTime localTime = java.time.LocalTime.now();
        System.out.println(localTime);
        //Get the hour of the day
        System.out.println("The hour of the day:: " + localTime.getHour());
        //add 2 hours to the time.
        System.out.println(localTime.plus(2, ChronoUnit.HOURS));
        //add 6 minutes to the time.
        System.out.println(localTime.plusMinutes(6));
        //substract 2 hours from current time
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
    }
}
