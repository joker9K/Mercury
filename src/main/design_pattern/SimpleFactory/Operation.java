package main.design_pattern.SimpleFactory;

/**
 * @author supo
 * @Date 2016/11/9 19:24.
 * Copyright © mizhuanglicai
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult(){
        double result = 0;
        return result;
    }
}
