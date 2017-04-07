package main;


import java.util.Arrays;
import java.util.Collections;
import java.util.Map;



public class Test{

    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.f("");
        test.f(1);
        test.f(1.0);
        test.f(1.0f);
        test.f('c');
        test.f(true);
    }
}