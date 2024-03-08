package com.oops.bean;

public class BeanDemo {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("mahindra");
        System.out.println(vehicle.getBrand());
        vehicle.setModel("xuv");
        System.out.println(vehicle.getModel());
        vehicle.setPrice(546789);
        System.out.println(vehicle.getPrice());


    }
}
