package com14.objAdapter;

import com14.classAdapter.Phone;
import com14.classAdapter.Vga;

public class ObjTypec2Vga implements Vga {
    private Phone phone;

    public ObjTypec2Vga(Phone phone) {
        // TODO Auto-generated constructor stub
        this.phone = phone;
    }

    @Override
    public void vgaInterface() {
        // TODO Auto-generated method stub
        if(phone != null) {
            //根据对象来调用配
            phone.typecPhone();
            System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
            System.out.println("信息已转换成VGA接口，显示屏可以对接。");
        }
    }
}
