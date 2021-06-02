package com16.chain;

public class ChainResTest {
    public static void main(String[] args) {
        Approver approver = new Staff("张三");
        approver.setNextApprover(new Manager("李四")).setNextApprover(new CEO("王五"));
        approver.approve(1000);

        approver.approve(2000);

        approver.approve(6000);

        approver.approve(11000);
    }
}
