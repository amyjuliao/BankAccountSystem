package com.bank;

public class BankAccount {

    protected String accountHolderName;
    protected double balance;
    protected double minimumBalance;

    // Constructor
    public BankAccount(String accountHolderName, double balance, double minimumBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Account{" +
                "Account Holder='" + accountHolderName + '\'' +
                ", Balance=" + balance +
                ", Minimum Balance=" + minimumBalance +
                '}';
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
        if (balance - amount < minimumBalance) throw new IllegalArgumentException("Cannot withdraw beyond minimum balance");
        balance -= amount;
    }
}
