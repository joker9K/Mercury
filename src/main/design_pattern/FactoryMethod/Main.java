package main.design_pattern.FactoryMethod;

/**
 * 工厂方法模式
 * @author supo
 * @Date 2016/11/15 9:46.
 * Copyright © mizhuanglicai
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new main.design_pattern.FactoryMethod.UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();
    }
}
