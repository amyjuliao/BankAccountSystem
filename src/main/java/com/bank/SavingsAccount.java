package com.bank;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolderName, double balance, double minimumBalance, double interestRate) {
        super(accountHolderName, balance, minimumBalance);
        this.interestRate = interestRate;
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method to add interest to the balance
    public void addInterest() {
        deposit(getBalance() * interestRate / 100);
    }
    // Overriding toString() method
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "Account Holder='" + getAccountHolderName() + '\'' +
                ", Balance=" + getBalance() +
                ", Minimum Balance=" + minimumBalance +
                ", Interest Rate=" + interestRate +
                '}';
    }
}
