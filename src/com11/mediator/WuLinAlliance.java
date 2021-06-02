package com11.mediator;

//抽象中介者，用于解耦，使得所有同事对象只和中介者交互
public abstract class WuLinAlliance {
    public abstract void notice(String message, United united);
}
