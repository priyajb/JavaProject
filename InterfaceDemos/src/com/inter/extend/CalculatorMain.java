package com.inter.extend;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator iCalculator=new BasicCalculator();
        iCalculator.add(10,20);

        iCalculator.product(30,2);

        IScientific iScientific=new ScientificCalci() ;
        iScientific.cube(2);
        iScientific.square(7);

    }
}
