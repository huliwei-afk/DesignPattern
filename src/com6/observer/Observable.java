package com6.observer;

//抽象被观察者，除了被观察者的一些具体行为外
//还有一个notify通知观察者
public interface Observable {
    /**
     * 增加订阅者
     * @param observer
     */
    void attach(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    void notify(String message);

}
