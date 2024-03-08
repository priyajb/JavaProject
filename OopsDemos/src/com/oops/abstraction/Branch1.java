package com.oops.abstraction;

public class Branch1 extends Bank {


    @Override
    void carLoan() {
        System.out.println("car loan");
    }

    @Override
    void housingLoan() {
        System.out.println("housing loan");
    }

    @Override
    void eduLoan() {
        System.out.println("education loan");
    }

    @Override
    void admin() {
        super.admin();
    }

    void payInterest() {
        System.out.println("pay interest");
    }
}
