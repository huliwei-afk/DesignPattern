package com3.multiFac;

public class FacTest {
    public static void main(String[] args) {
        //如果是静态工厂就可以直接Sender sender = SendFactory.produceXxx();
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
