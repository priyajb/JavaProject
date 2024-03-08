package com.exceptions.basics;

public class MultipleCatch {
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
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("plz enter value");
        }catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
            System.out.println("don't enter 0");
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("please enter a number");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("completed");

    }
    }

