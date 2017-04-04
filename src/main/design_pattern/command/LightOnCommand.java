package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:17.
 * Copyright © mizhuanglicai
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
