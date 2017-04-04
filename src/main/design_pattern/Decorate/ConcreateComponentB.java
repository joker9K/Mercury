package main.design_pattern.Decorate;

/**
 * @author supo
 * @Date 2016/11/9 21:14.
 * Copyright © mizhuanglicai
 */
public class ConcreateComponentB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){

    }
}
