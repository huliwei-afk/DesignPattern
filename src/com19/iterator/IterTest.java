package com19.iterator;

public class IterTest {
    public static void main(String[] args) {
        Aggregate aggregate=new DeliveryAggregate();
        aggregate.add("1111");
        aggregate.add("2222");
        aggregate.add("3333");
        aggregate.add("9527");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            String tel = (String) iterator.next();
            System.out.println("当前号码为："+tel);
        }
        System.out.println("后面没有了");
    }
}
