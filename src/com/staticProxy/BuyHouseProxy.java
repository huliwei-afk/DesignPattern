package com.staticProxy;

//代理类，指向接口，有自己的构造方法
//实现的功能会完善客户类BuyHouse的复杂流程
public class BuyHouseProxy implements BuyHouse {

    private BuyHouseImpl buyHouseImpl;

    //
    public BuyHouseProxy() {
        this.buyHouseImpl = new BuyHouseImpl();
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouseImpl.buyHouse();
        System.out.println("买房后装修");

    }
}
