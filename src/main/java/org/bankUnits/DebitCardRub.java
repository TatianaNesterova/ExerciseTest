package org.bankUnits;

import java.util.Currency;

public class DebitCardRub extends DebitCard {

    DebitCardRub(double balance, String name) {
        super(Currency.getInstance("RUB"), balance, name);
    }
}
