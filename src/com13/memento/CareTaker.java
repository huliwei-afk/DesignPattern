package com13.memento;

import java.util.ArrayList;
import java.util.List;

//对备忘录进行管理、保存和提供备忘录，只能将备忘录传递给其他角色。
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
