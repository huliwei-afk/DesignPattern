package com10.share;

public class ShareTest {
    //享元即共享对象，只有第一次的Goods对象是创建的，其他后面都是从Map中取出的缓存

    //name作为内部状态是不变的，并且作为Map的key值是可以共享的。
    //而showGoodsPrice方法中需要传入的version值则是外部状态，他的值是变化的。
    public static void main(String[]args) {
        Goods goods1=GoodsFactory.getGoods("iphone7");
        goods1.showGoodsPrice("32G");
        Goods goods2=GoodsFactory.getGoods("iphone7");
        goods2.showGoodsPrice("32G");
        Goods goods3=GoodsFactory.getGoods("iphone7");
        goods3.showGoodsPrice("128G");
    }
}
