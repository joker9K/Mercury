package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:23.
 * Copyright © mizhuanglicai
 */
public class OperationFactory {
    public static Operation createOperator(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new main.design_pattern.SimpleFactory.OperationSub();
                break;
            case "*":
                oper = new main.design_pattern.SimpleFactory.OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
