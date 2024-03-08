package com.inter.lam;

public class LambdaDemo {
    public static void main(String[] args) {
        IGreeter greeter=(String message)->{
            System.out.println(message);
        };
        greeter.greetMessage("hi hello");

        greeter=message -> System.out.println(message+"!!!!!!!!!!!");
        greeter.greetMessage("wow");
    }
}
