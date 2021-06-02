package com5.decorate;

public class DecoratorTest {

    public static void main(String[] args) {
        //装饰器在这里要加入"需要增强的对象的实例"，和代理不一样，需要明确知道增强哪个对象
        Sourceable obj = new Decorator(new Source());
        obj.method();
    }
}
