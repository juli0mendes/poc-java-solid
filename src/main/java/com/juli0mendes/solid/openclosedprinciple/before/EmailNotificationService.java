package com.juli0mendes.solid.openclosedprinciple.before;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending OTP Number Email to: " + medium);
    }

    @Override
    public void sendTransactionHistory(String medium) {
        System.out.println("Sending Transactions Email to: " + medium);
    }
}
