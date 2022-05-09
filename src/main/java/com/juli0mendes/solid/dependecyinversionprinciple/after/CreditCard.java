package com.juli0mendes.solid.dependecyinversionprinciple.after;

public class CreditCard {

    public void doTransaction(double amount) {
        System.out.println("Transaction with CreditCard: " + amount);
    }
}
