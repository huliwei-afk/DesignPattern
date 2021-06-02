package com8.template;

//模版模式应该就是抽象类的用法
//抽象类里定义一些固定的模版，然后空实现方法由子类自行实现
//具体实现方法如果都一样可以被抽出
//也可以定义一些钩子方法
public abstract class AbstractSwordsman {
    //该方法为final，防止算法框架被覆写
    public final void fighting(){
        //运行内功，抽象方法
        neigong();
        //调整经脉,具体方法
        meridian();
        //如果有武器则准备武器
        if(hasWeapons()) {
            weapons();
        }
        //使用招式
        moves();
        //钩子方法
        hook();
    }
    //空实现方法
    protected void hook(){}
    protected abstract void neigong();
    protected abstract void weapons();
    protected abstract void moves();

    protected void meridian(){
        System.out.println("开通正经与奇经");
    }

    /**
     * 是否有武器，默认是有武器的，钩子方法
     *
     */
    protected boolean hasWeapons(){
        return true;
    }
}
