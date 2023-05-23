package org.bankUnits;

import lombok.Data;

import java.util.Currency;

@Data
public class Deposit extends BankUnit implements BankOperation {
    private boolean isOpen;

    public Deposit(Currency currency, double balance, String name) {
        super(currency, balance, name);
        this.isOpen = true;
    }

    public void closeDeposit() {
        if (this.getBalance() == 0) {
            isOpen = false;
            System.out.println("Deposit is closed");
        } else {
            System.out.println("Deposit can not be closed because balance is not equal to 0");
        }

    }

    @Override
    public void depositMoney(double moneyAmount) {
        if (this.isOpen()) {
            super.increaseBalance(moneyAmount);
            System.out.println("Money is added to open deposit");
        } else {
            System.out.println("Money can not be added to closed deposit");
        }
    }
}
