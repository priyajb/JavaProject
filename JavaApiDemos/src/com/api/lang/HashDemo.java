package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("x100","audi","black");
        Vehicle vehicle1 = new Vehicle("x100","audi","white");
        Vehicle vehicle2 = new Vehicle("a100","audi","white");
        Vehicle vehicle3=new Vehicle("a109","tata","blue");

     /*   String model=vehicle.getModel();
        String brand=vehicle.getModel();
        String color=vehicle.getColor();*/

        System.out.println(vehicle.equals(vehicle1));
        System.out.println(vehicle.equals(vehicle2));
        System.out.println(vehicle.equals(vehicle3));

        System.out.println("...............");

        System.out.println(vehicle.hashCode());
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());

    }
}
//