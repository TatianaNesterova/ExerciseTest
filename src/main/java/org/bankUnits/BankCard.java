package org.bankUnits;

import lombok.NoArgsConstructor;

import java.util.Currency;

@NoArgsConstructor
public abstract class BankCard extends BankUnit implements BankOperation {

    public BankCard(Currency currency, double balance, String name) {
        super(currency, balance, name);
    }

    public abstract void withdrawMoney(double moneyAmount);
}
