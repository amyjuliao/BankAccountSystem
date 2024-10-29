package com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    @Test
    void testWithdrawWithinMaxLimit() {
        CurrentAccount account = new CurrentAccount("Bob", 1000.0, -500.0, 500.0);
        account.withdraw(400.0);
        assertEquals(600.0, account.getBalance(), "Balance should reflect withdrawal within max limit");
    }

    @Test
    void testWithdrawBeyondMaxLimit() {
        CurrentAccount account = new CurrentAccount("Bob", 1000.0, -500.0, 500.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600.0), "Should throw exception if withdraw exceeds max limit");
    }
}

