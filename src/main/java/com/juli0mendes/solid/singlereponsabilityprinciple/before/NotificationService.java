package com.juli0mendes.solid.singlereponsabilityprinciple.before;

public class NotificationService {
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
