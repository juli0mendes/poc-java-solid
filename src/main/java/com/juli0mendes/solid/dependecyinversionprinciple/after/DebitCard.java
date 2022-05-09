package com.juli0mendes.solid.dependecyinversionprinciple.after;

public class DebitCard {

    public void doTransaction(double amount) {
        System.out.println("Transaction with DebitCard: " + amount);
    }
}
