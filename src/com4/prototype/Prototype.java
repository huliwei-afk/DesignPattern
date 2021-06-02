package com4.prototype;

//实现Cloneable接口，重写clone方法
class Prototype implements Cloneable {
    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}

