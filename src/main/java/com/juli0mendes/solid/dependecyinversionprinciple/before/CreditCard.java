package com.juli0mendes.solid.dependecyinversionprinciple.before;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(double value) {
        System.out.println("Transaction with CreditCard: " + value);
    }
}
