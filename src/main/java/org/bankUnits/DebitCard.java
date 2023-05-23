package org.bankUnits;

import java.util.Currency;

public class DebitCard extends BankCard {

    DebitCard(Currency currency, double balance, String name) {
        super(currency, balance, name);
    }

    DebitCard(double balance, String name) {
        super(Currency.getInstance("RUB"), balance, name);
    }

    public double getBalance() {
        System.out.println("Debit Card balance: " + super.getBalance());
        return super.getBalance();
    }

    public void depositMoney(double moneyAmount) {
        System.out.println("Debit Card balance is increased to: " + moneyAmount);
        this.increaseBalance(moneyAmount);
    }

    public void withdrawMoney(double paymentAmount) {
        if (this.getBalance() >= paymentAmount) {
            System.out.println("Debit Card balance is decreased to: " + paymentAmount);
            decreaseBalance(paymentAmount);
        } else {
            System.out.println("There is not enough money to withdraw from Debit card ");
        }
    }
}
