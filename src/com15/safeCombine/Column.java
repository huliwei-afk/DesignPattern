package com15.safeCombine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Column extends PageElement {//栏目
    private List<PageElement> mPageElements = new ArrayList<>();//用来保存页面元素

    public Column(String name) {
        super(name);
    }

    public void addPageElement(PageElement pageElement) {
        mPageElements.add(pageElement);
    }

    public void rmPageElement(PageElement pageElement) {
        mPageElements.remove(pageElement);
    }

    public void clear() {
        mPageElements.clear();
    }

    @Override
    public void print(String placeholder) {
        System.out.println(placeholder + "└──" + getName());
        Iterator<PageElement> i = mPageElements.iterator();
        while (i.hasNext()) {
            PageElement pageElement = i.next();
            pageElement.print(placeholder + "   ");
        }
    }

}
