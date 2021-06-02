package com3.abstractFac;

public class SendMailFactory implements Provider{
    @Override
    public Sender produce(){
        return new MailSender();
    }

}
