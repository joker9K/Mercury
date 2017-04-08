package main.think_in_java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by zhangwt on 2017/4/8.
 * 无界通配符<?>
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list){
        list1 = list;
        list2 = list;
        //list3 = list; //Warning: unchecked conversion
        //Found: List,Required: List<? extends Object>
    }

    static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());

        //assign3(new ArrayList());//Warning:Unchecked conversion.Found:ArrayList,Required:List<? extends Object>
        List<?> wildList = new ArrayList();//原生类型编译过程中编译器不会检查,<?>编译过程中编译器会检查
        //Compile Error
        //wildList.add(1);
        List list = new ArrayList();
        list.add(1);
        wildList = Arrays.asList(1,"s",1.2d,2.1f,true);
        wildList.forEach(System.out::println);
        wildList = new ArrayList<String>();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
