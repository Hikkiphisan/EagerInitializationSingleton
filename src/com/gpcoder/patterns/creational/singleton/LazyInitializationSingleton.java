package com.gpcoder.patterns.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton INTANCE;
    private LazyInitializationSingleton() {};

    public static LazyInitializationSingleton getInstance() {
        if(INTANCE == null) {
            INTANCE = new LazyInitializationSingleton();
        }
        return INTANCE;
    }

}
