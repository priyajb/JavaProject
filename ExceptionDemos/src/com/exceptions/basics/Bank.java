package com.exceptions.basics;

public class Bank {
    double balance;

    void withdraw(int amount) throws Exception {
        try{
            if(amount>1000){
                throw new Exception("amount is greater than 1000");
            }
        }catch(Exception e){
            System.out.println("error..");
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("completed");
    }
}
