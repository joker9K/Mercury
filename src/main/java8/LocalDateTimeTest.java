package main.java8;

import java.time.temporal.ChronoUnit;

/**
 * @author supo
 * @Date 2017/3/30 16:23.
 * Copyright © mizhuanglicai
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        //Get LocalDateTime object
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
        System.out.println(localDateTime);
        //Find the length of month. That is, how many days are there for this month.
        System.out.println("The number of days available for this month:: " + localDateTime.getMonth().length(true));
        //Know the month name
        System.out.println("What is the month name? :: " + localDateTime.getMonth().name());
        //add 2 days to today's date.
        System.out.println(localDateTime.plus(2, ChronoUnit.DAYS));
        //substract 2 days from today
        System.out.println(localDateTime.minus(2, ChronoUnit.DAYS));
    }
}
