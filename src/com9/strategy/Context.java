package com9.strategy;

//根据环境确定调用的方法，采用不同策略
public class Context {
    private FightingStrategy fightingStrategy;
    public Context(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }

    public void fighting(){
        fightingStrategy.Strategy();
    }
}
