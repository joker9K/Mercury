package main.think_in_java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwt on 2017/4/8.
 * 超类型通配符
 * ? super T 可以声明通配符是由某个特定类的任何类来界定的,即通配符是具体类
 * ? extends T 指通配符没有指定具体类型
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list,T item){
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruit = new ArrayList<>();
    static void f1(){
        writeExact(apples,new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list,T item){
        list.add(item);
    }

    static void f2(){
        writeWithWildcard(apples,new Apple());
        writeWithWildcard(fruit,new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
        apples.forEach(System.out::println);
        fruit.forEach(System.out::println);

    }
}
