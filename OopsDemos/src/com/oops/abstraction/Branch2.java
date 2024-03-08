package com.oops.abstraction;

public class Branch2 extends Bank {

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

    void staffDetails() {
        System.out.println("staff details");
    }
}
