package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:24.
 * Copyright © mizhuanglicai
 */
public class LampLight implements Light{
    @Override
    public void on() {
        System.out.println("LampLight is on");
    }

    @Override
    public void off() {
        System.out.println("LampLight is off");
    }
}
