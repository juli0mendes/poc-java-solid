package com.juli0mendes.solid.interfacesegregationprinciple.before;

import java.util.Arrays;
import java.util.List;

public class LoanPayment implements Loan {

    @Override
    public int getTimePeriod() {
        return 10;
    }

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
}
