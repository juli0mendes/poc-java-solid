package com.juli0mendes.solid.dependecyinversionprinciple.after;

public class DIPClient {

    private DebitCard debitCard;

    public DIPClient(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void purchase(double amount) {
        this.debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        DIPClient DIPClient = new DIPClient(debitCard);
        DIPClient.purchase(10000);
    }
}
