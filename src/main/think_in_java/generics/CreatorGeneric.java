package main.think_in_java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwt on 2017/4/7.
 */

abstract class GenericWithCreate<T>{
    final T element;

    public GenericWithCreate() {
        element = create();
    }
    abstract T create();
}
class Creator extends GenericWithCreate<List>{
    @Override
    List create() {
        return new ArrayList<>();
    }

    void f(){
        System.out.println(element.getClass().getName());;
    }
}
public class CreatorGeneric {

    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
