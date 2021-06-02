package com14.interfaceAdapter;

public class InterfaceAdaTest {
    public static void main(String[] args) {
        System.out.println("-------------第三种适配器------------");
        VgaAdapter vgaAdapter = new VgaAdapter();
        vgaAdapter.typec();
        vgaAdapter.typec2vga();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
    }
}
