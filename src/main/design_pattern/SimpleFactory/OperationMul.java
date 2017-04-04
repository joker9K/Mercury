package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:49.
 * Copyright © mizhuanglicai
 */
public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return super.getNumberA()*super.getNumberB();
    }
}
