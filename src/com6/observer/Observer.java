package com6.observer;

//抽象观察者
//观察者只需要提供一些改动的update方法
public interface Observer {
    void update(String message);
}
