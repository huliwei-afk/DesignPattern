package com11.mediator;

public class medTest {
    public static void main(String[]args) {
        Champions champions=new Champions();
        Wudang wudang=new Wudang(champions);
        Shaolin shaolin=new Shaolin(champions);
        Emei emei=new Emei(champions);
        //setter来持有武当、峨眉和少林的引用
        //因为champion类需要知道具体的同事类
        champions.setWudang(wudang);
        champions.setShaolin(shaolin);
        champions.setEmei(emei);
        wudang.sendAlliance("武当弟子被少林大力金刚指所杀");
        emei.sendAlliance("峨眉弟子被少林大力金刚指所杀");
        shaolin.sendAlliance("少林弟子绝不会做出这种事情");
    }
}
