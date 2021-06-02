package com3.abstractFac;

public class FacTest {
    //抽象工厂，如果此时想要再增多一个功能
    //只需增加一个实现类，实现Sender接口
    //和一个工厂类，实现Provider接口
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
