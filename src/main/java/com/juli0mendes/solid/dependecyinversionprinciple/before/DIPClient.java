package com.juli0mendes.solid.dependecyinversionprinciple.before;

public class DIPClient {

    private BankCard bankCard;

    public DIPClient(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchase(double amount) {
        this.bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard1 = new DebitCard();
        BankCard bankCard2 = new CreditCard();
        DIPClient shoppingMall = new DIPClient(bankCard1);
        // ShoppingMall shoppingMall = new ShoppingMall(bankCard2);
        shoppingMall.purchase(10000);
    }
}
