package com.exceptions.basics;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value = args[0];
            System.out.println("value" + value);
            int num = Integer.parseInt(value);
            System.out.println("number" + num);
            int result = 100 / num;
            System.out.println(result);
            int marks[]=null;
        }
        catch (ArrayIndexOutOfBoundsException |
                NullPointerException|
                NumberFormatException|
                ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("plz enter value");

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("completed");

    }
}
