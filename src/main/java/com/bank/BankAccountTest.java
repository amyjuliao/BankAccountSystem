package com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("Amy", 0.0, -500.0);
        assertEquals(0.0, account.getBalance(), "Balance should be initialized to 0.0");
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("Amy", 0.0, -500.0);
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Balance should be 100.0 after deposit");
    }

    @Test
    void testWithdrawWithinBalance() {
        BankAccount account = new BankAccount("Amy", 100.0, -500.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), "Balance should be 50.0 after withdrawal");
    }

    @Test
    void testWithdrawBeyondMinimumBalance() {
        BankAccount account = new BankAccount("Amy", 100.0, -500.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(700.0);
        }, "Withdrawal beyond minimum balance should throw an exception");
    }
}
