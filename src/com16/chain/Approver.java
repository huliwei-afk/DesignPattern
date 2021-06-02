package com16.chain;

public abstract class Approver {

    protected String name;
    protected Approver nextApprover;

    public Approver(String name){
        this.name = name;
    }

    protected Approver setNextApprover(Approver approver){
        this.nextApprover = approver;
        return nextApprover;
    }

    public abstract void approve(int amount);
}
