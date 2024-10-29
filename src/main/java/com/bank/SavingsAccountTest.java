package com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @Test
    void testAddInterest() {
        SavingsAccount account = new SavingsAccount("Alice", 1000.0, -500.0, 5.0);
        account.addInterest();
        assertEquals(1050.0, account.getBalance(), "Balance should include interest after adding");
    }
}
