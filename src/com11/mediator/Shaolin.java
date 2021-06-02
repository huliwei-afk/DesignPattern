package com11.mediator;

//具体同事类
public class Shaolin extends United{
    public Shaolin(WuLinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message){
        wulinAlliance.notice(message,Shaolin.this);
    }
    public void getNotice(String message){
        System.out.println("少林收到消息："+message);
    }
}
