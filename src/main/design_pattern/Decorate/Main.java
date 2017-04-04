package main.design_pattern.Decorate;

/**
 * @author supo
 * @Date 2016/11/9 21:16.
 * Copyright © mizhuanglicai
 */
public class Main {
    public static void main(String[] args){
        ConcreateComponent c = new ConcreateComponent();
        ConcreateComponentA d1 = new ConcreateComponentA();
        ConcreateComponentB d2 = new ConcreateComponentB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }
}
