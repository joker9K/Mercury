package main.design_pattern.command;

/**
 * @author supo
 * @Date 2017/2/6 20:21.
 * Copyright © mizhuanglicai
 */
public class SimpleRemoteControl {

    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
