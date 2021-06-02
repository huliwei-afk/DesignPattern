package com2.traditionalBuilder;

public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer;
    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("Mac keyboard");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("Mac screen");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
