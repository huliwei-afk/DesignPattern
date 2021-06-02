package com2.newBuilder;

//链式调用，Builder是Computer的内部类
public class NewBuilder {
    Computer computer = new Computer.Builder("Intel","SamSung")
            .setDisplay("24ch")
            .setKeyboard("Logitech")
            .setUsbCount(2)
            .build();
}
