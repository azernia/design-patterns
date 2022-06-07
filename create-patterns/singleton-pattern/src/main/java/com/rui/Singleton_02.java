package com.rui;

/**
 * double check lock
 */
public class Singleton_02 {

    private volatile static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if (null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }

}
