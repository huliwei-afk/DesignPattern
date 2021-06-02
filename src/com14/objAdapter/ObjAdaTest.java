package com14.objAdapter;

import com14.classAdapter.Phone;

public class ObjAdaTest {
    public static void main(String[] args) {

        //第二种适配器用法
        System.out.println("-------------第二种适配器------------");
        ObjTypec2Vga typec2Vga = new ObjTypec2Vga(new Phone());
        typec2Vga.vgaInterface();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
    }
}
