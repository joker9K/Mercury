package main.think_in_java.generics;

import java.util.List;

/**
 * Created by zhangwt on 2017/4/8.
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        this.value = val;
    }

    public void set(T val){
        this.value = val;
    }
    public T get(){
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        //Holder<Apple>不能向上转型为Holder<Fruit>,但可以向上转型为Holder<? extends Fruit>
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        //can't upcast
        //Holder<Fruit> fruit = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
        try {
            Orange c = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruit.equals(d));
    }

    public void writeTo(List<? super Fruit> apples){
        apples.add(new Apple());
        apples.add(new Fruit());
    }
}
