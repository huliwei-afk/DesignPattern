package com2.traditionalBuilder;

//看起来好像传统建造者好麻烦
//现在基本都用新版建造者？guess
public class BuilderTest {
    public static void main(String[] args) {
        ComputerDirector director=new ComputerDirector();//1

        ComputerBuilder macBuilder=new MacComputerBuilder("i5","SamSung125");//2
        director.makeComputer(macBuilder);//3
        Computer macComputer=macBuilder.getComputer();//4
        System.out.println("mac computer:"+macComputer.toString());

        ComputerBuilder lenovoBuilder=new LenovoComputerBuilder("i7","Hynix222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer=lenovoBuilder.getComputer();
        System.out.println("lenovo computer:"+lenovoComputer.toString());
    }
}
