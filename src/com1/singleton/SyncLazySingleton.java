package com1.singleton;

public class SyncLazySingleton {
    private static SyncLazySingleton instance = null;

    private SyncLazySingleton(){

    }

    public static synchronized SyncLazySingleton getInstance(){
        if(instance == null){
            instance = new SyncLazySingleton();
        }
        return instance;
    }
}
