package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:23.
 * Copyright © mizhuanglicai
 * 命令模式——>即可以通过不同的命令发起者发起不同的命令
 */
public class main {

    public static void main(String[] args) {
        //打开LampLight
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new LampLight();
        Command command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();

        //关闭TrafficLight
        simpleRemoteControl.setCommand(new LightOffCommand(new TrafficLight()));
        simpleRemoteControl.buttonWasPressed();

    }
}
