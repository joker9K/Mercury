package main.design_pattern.Strategy;

/**
 * @author supo
 * @Date 2016/11/9 20:17.
 * Copyright © mizhuanglicai
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
