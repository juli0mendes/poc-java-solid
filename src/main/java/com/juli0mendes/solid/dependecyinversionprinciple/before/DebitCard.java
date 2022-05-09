package com.juli0mendes.solid.dependecyinversionprinciple.before;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(double value) {
        System.out.println("Transaction with DebitCard: " + value);
    }
}
