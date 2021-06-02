package com.staticProxy;

//客户类，指向接口BuyHouse，实现具体功能
//即客户类想要做什么，以及想要的结果，而不关心中间的复杂流程
public class BuyHouseImpl implements BuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }
}
