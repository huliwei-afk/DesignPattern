package com13.memento;

//记录当前时刻的内部状态，并负责创建和恢复备忘录数据
//允许访问返回到先前状态所需的所有数据。
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
