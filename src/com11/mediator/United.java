package com11.mediator;

//抽象同事，定义了中介者对象接口，它只知道中介者而不知道其他同事对象

public abstract class United {
    protected WuLinAlliance wulinAlliance;
    //抽象同事类 会在构造方法中得到 抽象中介者类
    public United(WuLinAlliance wulinAlliance){
        this.wulinAlliance=wulinAlliance;
    }
}