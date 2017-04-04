package main.design_pattern.FactoryMethod;

/**
 * @author supo
 * @Date 2016/11/15 9:45.
 * Copyright © mizhuanglicai
 */
public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
