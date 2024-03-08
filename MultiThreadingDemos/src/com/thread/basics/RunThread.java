package com.thread.basics;

class Runner implements Runnable {
     String name;
     Greetings greetings;
    public Runner(String name,Greetings greetings){
        Thread t=new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        t.start();
    }
    @Override
    public void run() {
        /*System.out.println(Thread.currentThread().getName());
        System.out.println("done");*/
        synchronized (greetings){
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }
    }
}


public class RunThread {
    public static void main(String[] args) {
        Greetings greetings=new Greetings();
        //Runner runner=new Runner("ram",hello);


        /*Thread thread = new Thread(runner, "Thread-one");
        Thread thread1 = new Thread(runner, "Thread-two");
        thread.start();
        thread1.start();*/
    }
}
