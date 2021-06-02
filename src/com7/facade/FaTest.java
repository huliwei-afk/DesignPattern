package com7.facade;

//外观模式本身就是将子系统的逻辑和交互隐藏起来，为用户提供一个高层次的接口，
//使得系统更加易用，同时也隐藏了具体的实现，这样即使具体的子系统发生了变化，用户也不会感知到
public class FaTest {
    public static void main(String[] args){
        ZhangWuJi zhangWuJi=new ZhangWuJi();
        //张无忌使用乾坤大挪移
        zhangWuJi.QianKun();
        //张无忌使用七伤拳
        zhangWuJi.QiShang();
    }
}
