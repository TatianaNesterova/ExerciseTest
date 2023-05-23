package org.bankUnits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Currency;

class DepositTest {

    @Test
    void closeZeroBalanceDepositTest() {
        Deposit deposit1 = new Deposit(Currency.getInstance("RUB"), 0, "Deposit1");
        Assertions.assertTrue(deposit1.isOpen());
        deposit1.closeDeposit();
        Assertions.assertFalse(deposit1.isOpen());
    }

    @Test
    void closeNotZeroBalanceDepositTest() {
        Deposit deposit1 = new Deposit(Currency.getInstance("RUB"), 100, "Deposit1");
        deposit1.closeDeposit();
        Assertions.assertTrue(deposit1.isOpen());
    }

    @Test
    void addMoneyToOpenDepositTest() {
        Deposit deposit1 = new Deposit(Currency.getInstance("RUB"), 0, "Deposit1");
        deposit1.depositMoney(100);
        Assertions.assertEquals(100, deposit1.getBalance());
    }

    @Test
    void addMoneyToClosedDepositTest() {
        Deposit deposit1 = new Deposit(Currency.getInstance("RUB"), 0, "Deposit1");
        deposit1.closeDeposit();
        deposit1.depositMoney(100);
        Assertions.assertEquals(0, deposit1.getBalance());
    }

}