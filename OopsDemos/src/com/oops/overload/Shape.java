package com.oops.overload;

public class Shape {
    void calcArea(int length)
    {
        System.out.println("sqare" +length*length);
    }

    int calcArea(int lenght,int breadth)
    {
        return lenght*breadth;
    }
    void calcArea(double radius)
    {
        System.out.println("circle"+Math.pow(radius,2));
     }
     double calcArea(double base,int height) {
         return (0.5 * base * height);
     }
}

