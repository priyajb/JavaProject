package com.inter.def;

public interface IAllowanceCalculator {
    void calculate(double amount);
    default void policyType(){
        System.out.println("policy for bonus");
    }

}

