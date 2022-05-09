package com.juli0mendes.solid.interfacesegregationprinciple.after;

import java.util.Arrays;
import java.util.List;

public class LoanPayment implements Payment {
    @Override
    public void init() {
        System.out.println("Initiate LoanPayment...");
    }

    @Override
    public Object status() {
        return "LoanPayment Status";
    }

    @Override
    public List<Object> getPayments() {
        return Arrays.asList("LoanPayment1", "LoanPayment2");
    }

    @Override
    public int getTimePeriod() {
        return 10;
    }
}
