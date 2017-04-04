package main.design_pattern.Strategy;

/**
 * 策略模式
 * @author supo
 * @Date 2016/11/9 20:19.
 * Copyright © mizhuanglicai
 */
public class Main {
    public static void main(String[] args){
        Context context;
        context = new Context(new main.design_pattern.Strategy.ConcreteStrategyA());
        context.contextInterface();
    }
}
