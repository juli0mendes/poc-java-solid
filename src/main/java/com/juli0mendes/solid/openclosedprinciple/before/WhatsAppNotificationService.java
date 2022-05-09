package com.juli0mendes.solid.openclosedprinciple.before;

public class WhatsAppNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending OTP Number to: " + medium);
    }

    @Override
    public void sendTransactionHistory(String medium) {
        System.out.println("Sending Transactions Details to: " + medium);
    }
}
