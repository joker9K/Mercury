package main.think_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangwt on 2017/4/7.
 */
interface FactoryI<T>{
    T create();
}
class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.create();
    }
    public T getX(){
        return x;
    }
}
class IntegerFactory implements FactoryI<Integer>{
    public Integer create(){
        return new Integer(6);
    }
}
class Widget {
      public static class Factory  implements FactoryI<Widget> {
          @Override
          public Widget create() {
              return new Widget();
          }
      }
}
public class FactoryConstraint {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(new Foo2<>(new IntegerFactory()).getX());
        new Foo2<>(new Widget.Factory());

    }
}
