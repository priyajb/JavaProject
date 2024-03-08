package com.oops.staticex;

public class Demo1 {
    static {
        System.out.println("in demo static block");
    }

    public static void main(String[] args) {
        System.out.println("main demo");
        try {
            Class.forName("com.oops.staticex.Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
