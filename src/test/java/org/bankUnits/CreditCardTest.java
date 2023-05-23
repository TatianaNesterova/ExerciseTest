package org.bankUnits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Currency;

class CreditCardTest {
    @Test
    void getDebtCreditCardTest() {
        CreditCard creditCard = new CreditCard(Currency.getInstance("RUB"), "Visa", 20, 1000);
        creditCard.setNumberDeptDays(100);
        creditCard.setBalance(0);
        Assertions.assertEquals(1054.7945205479452, creditCard.getDebt());
    }

    @Test
    void getDebtCreditCardZeroNumberDeptDayTest() {
        CreditCard creditCard = new CreditCard(Currency.getInstance("RUB"), "Visa", 20, 1000);
        creditCard.setBalance(0);
        Assertions.assertEquals(1000, creditCard.getDebt());
    }
}