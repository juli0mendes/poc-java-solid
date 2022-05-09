package com.juli0mendes.solid.openclosedprinciple.before;

public class OCPClient {

    public static void main(String[] args) {
        NotificationService notificationService1 = new MobileNotificationService();
        NotificationService notificationService2 = new EmailNotificationService();
        NotificationService notificationService3 = new WhatsAppNotificationService();

        notificationService1.sendOTP("123456789");
        notificationService2.sendOTP("test@email.com");
        notificationService3.sendOTP("test@email");

        notificationService1.sendTransactionHistory("123456789");
        notificationService2.sendTransactionHistory("test@email.com");
        notificationService3.sendTransactionHistory("test@email");
    }
}
