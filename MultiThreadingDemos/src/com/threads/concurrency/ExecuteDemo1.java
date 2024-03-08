package com.threads.concurrency;

import com.thread.basics.Booking;
import com.thread.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println("doing polling");
            Greetings greetings=new Greetings();
            greetings.sayHello("priya");
        });
        executorService.execute(()->{
            System.out.println("extracting name from url");
            Booking booking=new Booking();
            System.out.println(booking.bookTickets("jim",10));
        });
        executorService.execute(()->{
            System.out.println("reading from db");
        });
    }
}
