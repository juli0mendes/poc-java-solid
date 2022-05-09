package com.juli0mendes.solid.singlereponsabilityprinciple.before;

public class BankService {
    public void withdraw(double amount) {
        System.out.println("Withdraw money : " + amount);
    }
    public void deposit(double amount) {
        System.out.println("Deposit money : " + amount);
    }
}
