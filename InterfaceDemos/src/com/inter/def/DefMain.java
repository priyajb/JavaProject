package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator iBonusCalculator=new CalculatorImpl();
        iBonusCalculator.calculate(8000);
        iBonusCalculator.policyType();
        IBonusCalculator.show();

        IAllowanceCalculator allowance=(IAllowanceCalculator) iBonusCalculator;
        allowance.calculate(7990);
        allowance.policyType();

    }
}
