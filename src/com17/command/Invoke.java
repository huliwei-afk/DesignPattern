package com17.command;

public class Invoke {//调用者
    private Command command;

    //调用者里放具体命令
    public Invoke(Command command) {
        this.command = command;
    }

    public void action() {
        System.out.println("调用者执行命令");
        command.execute();
    }
}