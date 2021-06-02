package com12.delegate;

//具体任务角色
public class ConcreteA implements Task{

    @Override
    public void doTask() {
        System.out.println("A做代码");
    }
}
