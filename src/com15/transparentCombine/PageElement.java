package com15.transparentCombine;

import java.util.ArrayList;
import java.util.List;

//透明的组合模式
public abstract class PageElement {//页面
    protected List<PageElement> mPageElements = new ArrayList<>();//用来保存页面元素
    private String name;

    public PageElement(String name) {
        this.name = name;
    }

    public abstract void addPageElement(PageElement pageElement);//添加栏目或者具体内容

    public abstract void rmPageElement(PageElement pageElement);//删除栏目或者具体内容

    public abstract void clear();//清空所有元素

    public abstract void print(String placeholder);//打印页面结构

    public String getName() {
        return name;
    }
}
