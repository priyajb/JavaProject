package com.thread.basics;

public class DashBoard {
    public static void main(String[] args) {
        Booking booking=new Booking();
        Counter counter=new Counter("tom",10,booking);
        Counter counter1=new Counter("john",4,booking);
    }
}
