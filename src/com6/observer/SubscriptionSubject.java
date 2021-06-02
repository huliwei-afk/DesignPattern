package com6.observer;

import java.util.ArrayList;
import java.util.List;

//具体被观察者ConcreteSubject
//实现notify需要改动的逻辑
public class SubscriptionSubject implements Observable {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}

