package main.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

/**
 * Created by zhangwt on 2017/4/28.
 */
public class Test8 {

    public static void main(String[] args) throws ParseException {
        java.time.LocalDate localDate1 = java.time.LocalDate.now();
        System.out.println(localDate1);

        java.time.LocalDate localDate2 = java.time.LocalDate.of(2016, 4, 25);

        java.time.LocalDate localDate3 = java.time.LocalDate.of(2016, 4, 26);

        System.out.println(Period.between(localDate2,localDate3).getDays());



//        Date f = new Date(2016, 4, 25, 0, 0, 0);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        Date f = sdf.parse("2016-04-25 00:00:00");
//        System.out.println(sdf.format(f));
//
//
//        Date g = new Date(2016, 4, 26);
//        //System.out.println(DateTimeUtil.getBetweenDay(g, f));
//        System.out.println(new Date().getTime());
//        System.out.println(f.getTime());
//        System.out.println(new Date().getTime() - f.getTime());
    }
}
