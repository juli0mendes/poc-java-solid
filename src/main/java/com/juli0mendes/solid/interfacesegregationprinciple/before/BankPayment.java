package com.juli0mendes.solid.interfacesegregationprinciple.before;

import java.util.Arrays;
import java.util.List;

public class BankPayment implements Bank {

    @Override
    public int getOutstandingBalance() {
        return 1000;
    }

    @Override
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
}
