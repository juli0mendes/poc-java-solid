package com.juli0mendes.solid.interfacesegregationprinciple.after;

import java.util.Arrays;
import java.util.List;

public class BankPayment implements Payment {

    public void init() {
        System.out.println("Initiate BankPayment...");
    }

    @Override
    public Object status() {
        return "BankPayment Status";
    }

    @Override
    public List<Object> getPayments() {
        return Arrays.asList("BankPayment1", "BankPayment2");
    }

    // not needed for BankPayment but we have to override
    @Override
    public int getTimePeriod() {
        return 0;
    }
}