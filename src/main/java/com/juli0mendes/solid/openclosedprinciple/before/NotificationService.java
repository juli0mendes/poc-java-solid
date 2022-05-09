package com.juli0mendes.solid.openclosedprinciple.before;

public interface NotificationService {

    void sendOTP(String medium);
    void sendTransactionHistory(String medium);
}
