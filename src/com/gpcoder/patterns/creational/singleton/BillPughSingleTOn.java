package com.gpcoder.patterns.creational.singleton;

public class BillPughSingleTOn {
    private  BillPughSingleTOn() {}
    private static class Helper {
        private static final BillPughSingleTOn INSTANCE = new BillPughSingleTOn();

    }

    public static BillPughSingleTOn getInstance() {
        return Helper.INSTANCE;
    }


}
