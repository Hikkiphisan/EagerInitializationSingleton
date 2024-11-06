package com.gpcoder.patterns.creational.singleton;

public class StaticBlockInitialization {
    private static StaticBlockInitialization INSTANCES;
    static {
        try {
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockInitialization getINSTANCES () {
        return INSTANCES;
    }

}
