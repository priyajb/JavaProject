package com.inter.extend;

public class ScientificCalci extends BasicCalculator implements IScientific{

    public void square(int x)
    {
        System.out.println();
    }

    @Override
    public void cube(int x) {
        System.out.println(Math.pow(x,3));
    }
}
