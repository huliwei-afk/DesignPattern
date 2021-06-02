package com.staticProxy;

//测试类，以客户类为接口的实例化对象
//将客户类对象放进代理类的构造器得到代理对象
//调用代理类的方法即可完成测试

/*打印如下
我要买房
-----------要求如上，实现如下----------------
买房前准备
我要买房
买房后装修
 */

//是一种代码增强，在实现前后增加一些逻辑，而使得调用者无感知
//目的是保护目标对象，和增强目标对象，降低耦合，增加扩展性
//但是缺点在于系统设计中类数量增加，增加代理类会降低请求速度，也增加了复杂度
public class ProxyTest {
    public static void main(String[] args) {
        //这里和装饰器的差别就是刻意隐藏实现，只需要new代理类即可
        BuyHouse buyHouse = new BuyHouseProxy();
        buyHouse.buyHouse();
    }
}
