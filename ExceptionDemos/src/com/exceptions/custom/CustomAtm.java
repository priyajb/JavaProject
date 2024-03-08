package com.exceptions.custom;

public class CustomAtm {
    public static void main(String[] args) throws OutOfLimitsException,NegativeBalanceException{
    CustomBank customBank=new CustomBank(-1);
customBank.withdraw(3000);

    }
}
