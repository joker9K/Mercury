package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:51.
 * Copyright © mizhuanglicai
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return super.getNumberA()-getNumberB();
    }
}
