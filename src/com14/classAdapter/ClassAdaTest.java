package com14.classAdapter;

public class ClassAdaTest {
    public static void main(String[] args) {
        //第一种适配器用法
        Vga vga = new ClassTypec2Vga();
        vga.vgaInterface();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
    }
}
