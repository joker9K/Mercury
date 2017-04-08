package main.think_in_java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangwt on 2017/4/8.
 *
 */

class Fruit{

}
class Apple extends Fruit{

}
class Orange extends Fruit{

}
public class GenericsAndCovariance {
    public static void main(String[] args) {
        //eg1
        List<? extends Fruit> list = new ArrayList<Apple>();
        //Compile Error: can't add any type of object
        //add方法指定了具体类型,所以编译器将直接拒绝对参数列表中涉及通配符的方法的(例如add())调用
//        list.add(new Apple());
//        list.add(new Fruit());
//        list.add(new Orange());
        list.add(null);
        Fruit fruit = list.get(0);


        //eg2
        List<? extends Fruit> list1 = Arrays.asList(new Apple(),new Orange());
        Apple a = (Apple) list1.get(0);
        //contains和indexof,参数类型为object,所以不涉及任何通配符,编译器将允许这个调用
        System.out.println(list1.get(0));
        System.out.println(list1.contains(a));
        System.out.println(list1.indexOf(new Apple()));


        //eg3
        List<?> list2 = new ArrayList<>();
        //Compile Error,the same as eg1
//        list2.add(1);
//        list2.add("s");
    }
}