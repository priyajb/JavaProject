package com.thread.basics;

public class Greetings {
    public String sayHello(String name) {
        String result = "welcome" + name;
        try {
            System.out.println("hi "+name);
            Thread.sleep(2000);
            result="good day"+name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
