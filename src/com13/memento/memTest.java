package com13.memento;

public class memTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        //设置两个State
        originator.setState("State #1");
        originator.setState("State #2");
        //添加到careTaker
        careTaker.add(originator.saveStateToMemento());

        //设置一个State
        originator.setState("State #3");
        //添加在careTaker
        careTaker.add(originator.saveStateToMemento());

        //设置一个State
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
