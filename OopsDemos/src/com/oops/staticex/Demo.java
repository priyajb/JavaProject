package com.oops.staticex;

public class Demo {
    static int a;
    static int b=10;

    static {
        System.out.println("static block1 is executing");
        a=200;
    }
    static {
        System.out.println("static block2 is executing");
        a=260;
    }
    static void getMessage()
    {
        System.out.println("in static method");
        System.out.println("sum:"+(a+b));
    }

}
