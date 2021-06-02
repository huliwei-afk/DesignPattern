package com15.safeCombine;

public abstract class PageElement {//页面
    private String name;

    public PageElement(String name) {
        this.name = name;
    }

    //抽象组件角色去掉增删等接口

    public abstract void print(String placeholder);

    public String getName() {
        return name;
    }
}
