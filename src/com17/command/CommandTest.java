package com17.command;

public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();//创建命令接收者
        Command command = new ShutdownCommand(receiver);//创建一个命令的具体实现对象，并指定命令接收者
        Invoke invoker = new Invoke(command);//创建一个命令调用者，并指定具体命令
        invoker.action();//发起调用命令请求
    }
}
