package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:41.
 * Copyright © mizhuanglicai
 */
public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return super.getNumberA()+super.getNumberB();
    }
}
