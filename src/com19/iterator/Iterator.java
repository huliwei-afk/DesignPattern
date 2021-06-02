package com19.iterator;

public interface Iterator {
    boolean hasNext();    //是否存在下一条记录

    Object next();        //返回当前记录并移到下一条记录
}
