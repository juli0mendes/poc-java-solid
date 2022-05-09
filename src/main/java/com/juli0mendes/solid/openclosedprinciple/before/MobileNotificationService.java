package com.juli0mendes.solid.openclosedprinciple.before;

public class MobileNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending OTP Number Message to: " + medium);
    }

    @Override
    public void sendTransactionHistory(String medium) {
        System.out.println("Sending Transactions Message to: " + medium);
    }
}
