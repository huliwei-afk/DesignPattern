package com3.multiFac;

public class SendFactory {
    //如果是静态工厂在每个方法前加上static，就可以在FacTest类里直接
    //通过类名调用而不用创建对象
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
