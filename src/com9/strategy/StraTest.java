package com9.strategy;

public class StraTest {
    public static void main(String[] args) {
        Context context;
        //如果遇到弱的对手
        context = new Context(new Weak());
        context.fighting();

        //如果遇到普通的对手
        context = new Context(new Common());
        context.fighting();

        //如果遇到强劲的对手
        context = new Context(new Strong());
        context.fighting();
    }
}
