package com.assignments;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("withdrawal succesfull" + balance);
        } else {
            System.out.println("invalid withdrawl");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit succesfull: " + balance);

        } else {
            System.out.println("deposit unsuccessfull");
        }
    }

    double getBalance() {
        return balance;
    }
}
