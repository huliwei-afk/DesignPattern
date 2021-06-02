package com10.share;

import java.util.HashMap;
import java.util.Map;

//将商品放入Map中，第一次不存在就创建对象，第二次之后只需要从Map中取出即可
public class GoodsFactory {
    private static Map<String,Goods> pool=new HashMap<String, Goods>();

    public static Goods getGoods(String name){
        if(pool.containsKey(name)){
            System.out.println("使用缓存,key为:"+name);
            return pool.get(name);
        }else{
            Goods goods=new Goods(name);
            pool.put(name,goods);
            System.out.println("创建商品,key为:"+name);
            return goods;
        }
    }
}