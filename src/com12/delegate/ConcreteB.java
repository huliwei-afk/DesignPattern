package com12.delegate;

//具体任务角色
public class ConcreteB implements Task{

    @Override
    public void doTask() {
        System.out.println("B做理财");
    }
}
