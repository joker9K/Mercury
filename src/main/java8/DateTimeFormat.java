package main.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author supo
 * @Date 2017/3/30 16:29.
 * Copyright © mizhuanglicai
 */
public class DateTimeFormat {

    public static void main(String[] args) {
        java.time.LocalDateTime localDateTime = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String landing = localDateTime.format(format);
            System.out.printf("时间日期%s转化后的字符是%s %n",localDateTime,landing);
        } catch (Exception e) {
            System.out.printf("%s格式转换错误%n",localDateTime);
            e.printStackTrace();
        }
    }
}
