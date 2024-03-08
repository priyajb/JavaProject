package com.inter.lam;

public class CalcLamba {
    public static void main(String[] args) {
        IMyCalculator  iMyCalculator=(int x, int y)->{
            int sum=x+y;
            return sum;
        };
        System.out.println(iMyCalculator.calculate(3,5));
       iMyCalculator=(x,y)->x*y;
        System.out.println(iMyCalculator.calculate(3,7));
        iMyCalculator=(x,y)->x/y;
        System.out.println(iMyCalculator.calculate(5,10));
        iMyCalculator=(x,y)->x%y;
        System.out.println(iMyCalculator.calculate(3,5));
    }
}
