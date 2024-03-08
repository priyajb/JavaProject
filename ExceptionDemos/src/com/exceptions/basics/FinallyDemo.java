package com.exceptions.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value = args[0];
            System.out.println("value" + value);
            int num = Integer.parseInt(value);
            System.out.println("number" + num);
            int result = 100 / num;
            System.out.println(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("finally is executing");
        }
        System.out.println("continue...");
    }
}

