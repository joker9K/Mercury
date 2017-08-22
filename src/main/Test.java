package main;


import main.design_pattern.Decorate.Main;
import main.test.Test5;

import java.math.BigDecimal;
import java.util.*;


public class Test{

//    public <T> void f(T x){
//        System.out.println(x.getClass().getName());
////    }
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.f("");
//        test.f(1);
//        test.f(1.0);
//        test.f(1.0f);
//        test.f('c');
//        test.f(true);
//
//        BigDecimal bigDecimal = new BigDecimal("1.6");
//        System.out.println(bigDecimal.ulp());
//
//    }

    public static void main(String[] args) {
        String string = " ssss ";
        char[] chars = string.toCharArray();

        int len = chars.length;
        int st = 0;
        char[] val = chars;    /* avoid getfield opcode */

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        if((st > 0) || (len < val.length)){
            System.out.println(string.substring(st,len));
        }else {
            System.out.println(string);
        }
    }
}