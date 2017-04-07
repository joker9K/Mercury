package main.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author supo
 * @Date 2017/3/31 14:56.
 * Copyright © mizhuanglicai
 */
public class StreamTest {

    public static List<Integer> getList(int i) {
        if (i > 7) {
            return Arrays.asList(1, 3, 4, 6);
        } else {
            return Arrays.asList(7, 8, 9, 0);
        }
    }

    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<Integer>();
//        for(int i=0;i<100;i++){
//            list.add(Integer.valueOf(i));
//        }
//
//        System.out.println(list.stream().reduce(
//                new StringBuilder(),
//                (result,element)-> result=result.append(element),(u,t) -> u=u.append(t))); //这个地方 返回 u或者t也是可以的 运行没错

//        List<Integer> nums = Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10);
//        System.out.println("sum is:"+nums.stream().filter(num -> num != null).
//        distinct().mapToInt(num -> num * 2).
//        peek(System.out::println).skip(2).limit(4).sum());

        System.out.println("sum is:"+Arrays.asList(1,1,null,2,3,4,null,5,6,7,8,9,10).stream().filter(num -> num != null).
                distinct().mapToInt(num -> num * 2).
                peek(System.out::println).skip(2).limit(4).sum());
//        List<Integer> nums = Arrays.asList(1, 6, 10);
//        List<Integer> result = nums.stream().collect(ArrayList::new, (list1, item) -> list1.addAll(getList(item)), ArrayList::addAll);
//        result.forEach(System.out::println);
//
//        System.out.println(IntStream.of(new int[]{1, 2, 3, 4, 3}).distinct().average().getAsDouble());
    }
}
