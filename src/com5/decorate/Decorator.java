package com5.decorate;

public class Decorator implements Sourceable{
    private Sourceable source;

    //将原始对象作为一个参数传给装饰者的构造器
    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method(){
        System.out.println("before decorate");
        source.method();
        System.out.println("after decorate");

    }
}
