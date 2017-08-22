package main.java8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author zhangwt
 * @date 2017/8/22 22:45.
 * LocalDateTime和Date的相互转化
 */
public class InstantTest {

    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant,zoneId);
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());


        instant = localDateTime.atZone(zoneId).toInstant();
        date = Date.from(instant);
        System.out.println(date);
    }
}
