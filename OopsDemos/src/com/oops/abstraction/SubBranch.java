package com.oops.abstraction;

public class SubBranch extends Branch2 {

    @Override
    void carLoan() {
        System.out.println("car loan in sub branch");
    }

    @Override
    void eduLoan() {
        System.out.println("education loan");
    }

    void subPay() {
        System.out.println("sub pay");
    }
}
