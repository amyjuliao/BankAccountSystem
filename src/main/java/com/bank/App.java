package com.bank;
// Main.java
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // Creating account objects
        SavingsAccount savingsAccount = new SavingsAccount("Amy", 1000, 0, 0.03);
        CurrentAccount currentAccount = new CurrentAccount("Lewis", 5000, 100, 1000);

        // Adding accounts to a list
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Displaying account information using overridden toString() method
        System.out.println("Account Details:");
        for (BankAccount account : accounts) {
            System.out.println(account); // Calls overridden toString()
        }
    }
}
