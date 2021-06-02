package com18.state;

public class SingleState implements PersonState {//单身狗状态

    @Override
    public void movies() {
        System.out.println("一个人罢了");
    }

    @Override
    public void shopping() {
        //单身狗逛条毛街啊
        //空实现
    }
}
