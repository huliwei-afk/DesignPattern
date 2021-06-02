package com19.iterator;

public interface Aggregate {

    int size();//容器大小

    String get(int location);//获取获取中指定位置的号码

    void add(String tel);//添加号码到容器中

    void remove(String tel);//从容器中移除号码

    Iterator iterator();//返回容器的迭代器
}

