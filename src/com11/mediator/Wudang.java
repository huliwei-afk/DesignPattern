package com11.mediator;

//具体同事类
public class Wudang extends United{
    public Wudang(WuLinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Wudang.this);
    }
    public void getNotice(String message) {
        System.out.println("武当收到消息：" + message);
    }
}
