package com.thread.basics;

public class Booking {
    public double bookTickets(String name, int noOfTickets) {
        double costPerTickets = 100;
        System.out.println("booked for:" + name);
        double totalAmount = costPerTickets * noOfTickets;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("total:" + totalAmount);
        return totalAmount;
    }
}
