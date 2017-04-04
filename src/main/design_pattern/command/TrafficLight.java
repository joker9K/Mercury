package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:30.
 * Copyright © mizhuanglicai
 */
public class TrafficLight implements Light{

    @Override
    public void on() {
        System.out.println("TrafficLight is on");
    }

    @Override
    public void off() {
        System.out.println("TrafficLight is off");
    }
}
