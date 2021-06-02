package com15.safeCombine;

public class Content extends PageElement {//具体内容，只专注自己的职责

    public Content(String name) {
        super(name);
    }

    @Override
    public void print(String placeholder) {
        System.out.println(placeholder + "──" + getName());
    }
}
