package com1.singleton;

import java.util.HashMap;
import java.util.Map;

//新学的 容器类单例
public class ContainerSingleton {
    private static Map<String, Object> objMap = new HashMap<>();

    private ContainerSingleton() {
    }

    public static void putObject(String key, String instance){
        if(!objMap.containsKey(key)){
            objMap.put(key, instance);
        }
    }

    public static Object getObject(String key){
        return objMap.get(key);
    }
}
