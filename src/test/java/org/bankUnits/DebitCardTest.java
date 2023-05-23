package org.bankUnits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Currency;

class DebitCardTest {

    @Test
    void addMoneyToDebitCardRubTest() {
        double refillAmount = 100;
        BankCard debitCard = new DebitCardRub(0, "Visa card");
        Assertions.assertEquals(0, debitCard.getBalance());
        debitCard.depositMoney(refillAmount);
        Assertions.assertEquals(100, debitCard.getBalance());
        System.out.println(debitCard);
    }

    @Test
    void addMoneyToDebitCardCurrencyTest() {
        double refillAmount = 100;
        BankCard debitCard = new DebitCard(Currency.getInstance("USD"), 0, "Visa card");
        Assertions.assertEquals(0, debitCard.getBalance());
        debitCard.depositMoney(refillAmount);
        Assertions.assertEquals(100, debitCard.getBalance());
        System.out.println(debitCard);
    }

    @Test
    void withdrawEnoughMoneyTest() {
        double paymentAmount = 100;
        BankCard debitCard = new DebitCardRub(1000, "Visa card");
        debitCard.withdrawMoney(paymentAmount);
        Assertions.assertEquals(900, debitCard.getBalance());
    }

    @Test
    void withdrawNotEnoughMoneyTest() {
        double paymentAmount = 100;
        BankCard debitCard = new DebitCardRub(10, "Visa card");
        debitCard.withdrawMoney(paymentAmount);
        Assertions.assertEquals(10, debitCard.getBalance());
    }

}