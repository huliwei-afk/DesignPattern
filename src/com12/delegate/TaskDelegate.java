package com12.delegate;

import java.util.Random;

//委派者 根据不同情况委派给不同的人
//是策略模式的体现
public class TaskDelegate {
    public void doTask() {
        System.out.println("代理执行开始....");

        Task task = null;
        if (new Random().nextBoolean()){
            task = new ConcreteA();
            task.doTask();
        }else{
            task = new ConcreteB();
            task.doTask();
        }

        System.out.println("代理执行完毕....");
    }
}
