package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理，此时无需手动创建代理类，只需要有动态处理器即可
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }
}
