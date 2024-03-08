package com.thread.basics;

class Child extends Thread {

    public Child(String name, int priority) {
        super(name);
        System.out.println(this);
        // this.start();
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("5*" + i + "=" + 5 * i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExThread {
    public static void main(String[] args) {

        /*Child child = new Child("child 1", 10);
        child.setName("Thread 1");
        System.out.println(child);*/

        Child child2 = new Child("child 2", 9);
        child2.setName("Thread 2");
        child2.setDaemon(true);

        System.out.println("........");
        for (int i = 1; i <= 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(Thread.currentThread().getName());
            System.out.println("10*" + i + "=" + 10 * i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        /*try {
            //child.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            child2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("main completed");
    }
}


