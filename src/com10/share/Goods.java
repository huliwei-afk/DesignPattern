package com10.share;

//内部状态和外部状态。
//内部状态是对象可共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变。
//而外部状态是对象依赖的一个标记是随环境改变而改变的并且不可共享的状态。
public class Goods implements IGoods{
    private String name;//名称 内部状态
    private String version;//版本 外部状态

    Goods(String name){
        this.name=name;
    }
    //根据版本不同输出不同价格
    @Override
    public void showGoodsPrice(String version) {
        if(version.equals("32G")){
            System.out.println("价格为5199元");
        }else if(version.equals("128G")){
            System.out.println("价格为5999元");
        }
    }
}
