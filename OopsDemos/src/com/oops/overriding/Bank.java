package com.oops.overriding;

public class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("withdrawal succesfull" + balance);
        } else {
            System.out.println("invalid withdrawl");
        }

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit succesfull: " + balance);

        } else {
            System.out.println("deposit unsuccessfull");
        }
    }

    public double getBalance() {
        return balance;
    }
}
