package main.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author supo
 * @Date 2017/1/19 16:00.
 * Copyright © mizhuanglicai
 */
class C<T> {

}

class A<T> extends C<T> {
}

class B<T> {
    public void ABC() {
        Class<T> entityClass = null;
        Type t = getClass().getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            entityClass = (Class<T>) p[0];
        }
    }
}

public class Test1 {

    public static final String TIME_START = " 00:00:00";
    public static final String TIME_END = " 23:59:59";


    public static Date getStartDateTime(String time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(time + TIME_START);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取日期时间的结束日期
     *
     * @param time 日期时间
     * @return 日期
     */
    public static Date getEndDateTime(String time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(time + TIME_END);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        new Sub();
    }
}

class Parent {

}

class Child extends Parent {

}

class UpperGeneric {
    static class Generic<T, R> {
        T t;
        R r;

        protected Generic(T t, R r) {
            this.t = t;
            this.r = r;
        }

        void foo() {
            System.err.println(t + " " + r);
        }
    }
}

class Sub extends UpperGeneric.Generic<Child, Integer> {

    protected Sub() {
        super(new Child(), 1);
        Class clazz = getClass().getSuperclass();
        System.out.println("super clazz:" + clazz + "\n");

        Type type = getClass().getGenericSuperclass();
        System.out.println("generic super class type:" + type + "\n");

        Type trueType = ((ParameterizedType) type).getActualTypeArguments()[0];
        System.out.println("generic super class type:" + trueType + "\n");

        trueType = ((ParameterizedType) type).getActualTypeArguments()[1];
        System.out.println("type:" + trueType + "\n");

        trueType = ((ParameterizedType) type).getRawType();
        System.out.println("raw type:" + trueType + "\n");

        trueType = ((ParameterizedType) type).getOwnerType();
        System.out.println("owner type:" + trueType + "\n");
    }
}