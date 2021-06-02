package com2.traditionalBuilder;

public class LenovoComputerBuilder extends ComputerBuilder {
    private Computer computer;
    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("Lenovo keyboard");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("Lenovo screen");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
