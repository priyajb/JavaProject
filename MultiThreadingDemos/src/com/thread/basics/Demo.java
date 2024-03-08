package com.thread.basics;


public class Demo {
    public static void main(String[] args) {

        Runnable task=()->{
            System.out.println("task1");
        };

        Thread t=new Thread(task,"pop");
        Thread t2=new Thread(()->{
            System.out.println("task2");
        },"top");
        t.start();
        t2.start();

    }
}
