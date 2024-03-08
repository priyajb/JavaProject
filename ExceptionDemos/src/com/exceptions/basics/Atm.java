package com.exceptions.basics;

public class Atm {
    public static void main(String[] args) {
        System.out.println("in atm");
        Bank bank=new Bank();
    try{
    bank.withdraw(2345);
        System.out.println("amount withdrawn");
    }
    catch(Exception e)
    {

        System.out.println("exception");
        System.out.println(e.getMessage());
    }
        System.out.println("bye!!!!!!!!!!!1");
    }
}
