package com12.delegate;

//用户只需要new委派者，即可完成工作，而不关心流程
//是代理模式的体现

//但总的来说是策略模式和代理模式的综合
public class DelTest {
    public static void main(String[] args) {
        new TaskDelegate().doTask();
    }
}
