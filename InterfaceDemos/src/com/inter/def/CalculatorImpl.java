package com.inter.def;
public class CalculatorImpl implements IBonusCalculator,IAllowanceCalculator {
    @Override
    public void calculate(double amount) {
        System.out.println(amount*5);
    }

    @Override
    public void policyType() {
        IBonusCalculator.super.policyType();
        System.out.println("policy type for all the employess");
        IAllowanceCalculator.super.policyType();
    }
}
