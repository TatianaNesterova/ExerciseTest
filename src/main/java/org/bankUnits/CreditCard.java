package org.bankUnits;

import lombok.Data;

import java.util.Currency;

@Data
public class CreditCard extends BankCard {
    private int interestRate;
    private int limit;
    private int numberDeptDays;

    public CreditCard(Currency currency, String name, int interestRate, int limit) {
        super(currency, limit, name);
        this.interestRate = interestRate;
        this.limit = limit;
        this.numberDeptDays = 0;
    }

    public double getDebt() {
        double res = limit - getBalance() + loan();
        System.out.println("Debt for Credit Card is " + res);
        return res;
    }

    private double loan() {
        double res = (limit - getBalance()) * interestRate / (365 * 100) * numberDeptDays;
        System.out.println(res);
        return res;
    }

    @Override
    public void depositMoney(double moneyAmount) {
        System.out.println("Credit Card balance is increased to: " + moneyAmount);
        this.increaseBalance(moneyAmount);
    }

    @Override
    public void withdrawMoney(double paymentAmount) {
        if (this.getBalance() >= paymentAmount) {
            System.out.println("Credit Card balance is decreased to: " + paymentAmount);
            decreaseBalance(paymentAmount);
        } else {
            System.out.println("There is not enough money to withdraw from Credit card ");
        }

    }
}
