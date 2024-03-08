package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape iShape=(int x,int y)->{
            System.out.println("rect"+x*y);
        };
        iShape.area(3,8);
        iShape=(x,y)-> System.out.println("tri"+(0.58*x*y));
        iShape.area(2,5);
    }
}
