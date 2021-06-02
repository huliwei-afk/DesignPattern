package com3.abstractFac;

public class SendSmsFactory implements Provider{
    @Override
    public Sender produce(){
        return new SmsSender();
    }
}
