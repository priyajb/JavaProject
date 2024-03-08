package com.exceptions.custom;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException, NegativeBalanceException {
        System.out.println("in withdraw method");
        try {
            if (balance - amount <= 0)
                throw new NegativeBalanceException("amount is negative");
            if (amount > 1000)
                throw new OutOfLimitsException("out of limits");
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
            throw e;
        } catch (OutOfLimitsException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("work done");
    }
}
