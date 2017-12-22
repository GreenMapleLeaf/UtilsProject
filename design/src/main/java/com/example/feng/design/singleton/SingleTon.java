package com.example.feng.design.singleton;

/**
 * 单例模式
 * Created by Feng on 2017/11/17.
 */

public class SingleTon {
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
