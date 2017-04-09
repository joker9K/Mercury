package main.think_in_java.generics;


/**
 * Created by zhangwt on 2017/4/8.
 * 栈的操作
 */
//这样是不能编译的
//interface  Payable<T>{
//
//}
//class Employee implements Payable<Employee>{
//
//}
//class Hourly extends Employee implements Payable<Hourly>{
//
//}

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int index) {
        storage = new Object[index];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    public T pop() {
        return (T) storage[--index];
    }
}

public class GenericCast {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>(SIZE);
        for (java.lang.String string : "A B C D E F G H I J".split(" ")) {
            strings.push(string);
        }
        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.println(s + " ");
        }
    }
}
