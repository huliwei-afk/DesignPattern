package com11.mediator;

//具体同事类
public class Emei extends United{
    public Emei(WuLinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    //发送消息
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Emei.this);
    }
    //接收消息
    public void getNotice(String message) {
        System.out.println("峨眉收到消息：" + message);
    }
}
