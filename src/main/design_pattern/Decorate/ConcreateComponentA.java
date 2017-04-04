package main.design_pattern.Decorate;

/**
 * @author supo
 * @Date 2016/11/9 21:04.
 * Copyright © mizhuanglicai
 */
public class ConcreateComponentA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
