package com.bank;

public class CurrentAccount extends BankAccount {

    private double maxWithdrawalAmount;

    // Constructor
    public CurrentAccount(String accountHolderName, double balance, double minimumBalance, double maxWithdrawalAmount) {
        super(accountHolderName, balance, minimumBalance);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    // Override withdraw to check against max withdrawal amount
    @Override
    public void withdraw(double amount) {
        if (amount > maxWithdrawalAmount) throw new IllegalArgumentException("Cannot withdraw beyond maximum allowed amount");
        super.withdraw(amount);
    }

    // Getter for max withdrawal amount
    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }
    // Overriding toString() method
    @Override
    public String toString() {
        return "CurrentAccount{" +
                "Account Holder='" + getAccountHolderName() + '\'' +
                ", Balance=" + getBalance() +
                ", Minimum Balance=" + minimumBalance +
                ", Max Withdrawal Amount=" + maxWithdrawalAmount +
                '}';
    }
}
