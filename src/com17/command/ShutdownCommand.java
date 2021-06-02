package com17.command;


public class ShutdownCommand implements Command {//关机命令
    private Receiver receiver;//接受者

    //具体命令里放接受者
    public ShutdownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令角色执行关机命令");
        receiver.action();//调用接受者
    }
}
