package main.design_pattern.FactoryMethod;

/**
 * @author supo
 * @Date 2016/11/15 9:42.
 * Copyright © mizhuanglicai
 */
public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
