package com.juli0mendes.solid.singlereponsabilityprinciple.after;

public class BankService {

    public void withdraw(double amount) {
        System.out.println("Withdraw money : " + amount);
    }

    public void deposit(double amount) {
        System.out.println("Deposit money : " + amount);
    }

    public String getLoanInfo(String loanType) {
        if (loanType.equals("professional")) {
            return "Professional Loan";
        } else if (loanType.equals("home")) {
            return "Home Loan";
        } else {
            return "Personal Loan";
        }
    }

    public void printPassbook() {
        System.out.println("Printing Book Details...");
    }

    public void sendOTP(String medium) {
        if (medium.equals("mobile")) {
            System.out.println("Sending OTP to mobile");
        } else if (medium.equals("email")) {
            System.out.println("Sending OTP to email");
        } else {
            System.out.println("Not a valid medium");
        }
    }
}
