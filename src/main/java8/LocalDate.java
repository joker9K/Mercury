package main.java8;

import java.time.temporal.ChronoUnit;

/**
 * @author supo
 * @Date 2017/3/30 16:19.
 * Copyright © mizhuanglicai
 */
public class LocalDate {

    public static void main(String[] args) {
        //Create date LocalDate
        java.time.LocalDate localDate = java.time.LocalDate.now();
        System.out.println("The local date is :: " + localDate);
        //Find the length of the month. That is, how many days are there for this month.
        System.out.println("The number of days available for this month:: " + localDate.lengthOfMonth());
        //Know the month name
        System.out.println("What is the month name? :: " + localDate.getMonth().name());
        //add 2 days to the today's date.
        System.out.println(localDate.plus(2, ChronoUnit.DAYS));
        //substract 2 days from today
        System.out.println(localDate.minus(2, ChronoUnit.DAYS));
        //Convert the string to date
        System.out.println(localDate.parse("2017-04-07"));
    }
}
