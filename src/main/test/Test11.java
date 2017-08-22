package main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangwt
 * @date 2017/8/14 11:55.
 */
public class Test11 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,7,4,1,8,3));
        list = list.subList(2,6);
        list.forEach(System.out::println);
    }
}
