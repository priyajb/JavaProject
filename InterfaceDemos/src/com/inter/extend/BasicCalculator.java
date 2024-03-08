package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
        int sum = x + y;
        System.out.println("sum is:" + sum);
    }

    @Override
    public void product(int x, int y) {
        int productvalue = x * y;
        System.out.println("product is :" + productvalue);
    }


}
