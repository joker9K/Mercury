package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:50.
 * Copyright © mizhuanglicai
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        return super.getNumberA()/super.getNumberB();
    }
}
