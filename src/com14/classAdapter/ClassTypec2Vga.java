package com14.classAdapter;

public class ClassTypec2Vga extends Phone implements Vga{

    //根据类的继承来适配
    @Override
    public void vgaInterface() {
        // TODO Auto-generated method stub
        typecPhone();
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}