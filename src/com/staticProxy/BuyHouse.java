package com.staticProxy;

//一个接口 起到连接BuyHouseImpl类和BuyHouseProxy的作用
//接口就是BuyHouseImpl类的功能实现，BuyHouseImpl相当于客户
public interface BuyHouse {
    void buyHouse();
}
