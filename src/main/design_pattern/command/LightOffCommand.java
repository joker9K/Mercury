package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:26.
 * Copyright © mizhuanglicai
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
