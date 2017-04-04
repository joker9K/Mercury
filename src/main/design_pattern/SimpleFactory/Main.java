package main.design_pattern.SimpleFactory;

/**
 * 简单工厂
 * @author supo
 * @Date 2016/11/9 19:57.
 * Copyright © mizhuanglicai
 */
public class Main {
    public static void main(String[] args){
        Operation oper;
        oper = main.design_pattern.SimpleFactory.OperationFactory.createOperator("+");
        oper.setNumberA(4.7);
        oper.setNumberB(9.3);
        System.out.println(oper.getResult());
    }
}
