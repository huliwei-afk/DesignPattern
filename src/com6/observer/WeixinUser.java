package com6.observer;

//具体观察者ConcrereObserver
//实现抽象观察者接口，增加观察后改动的具体逻辑
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;
    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}

