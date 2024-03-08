package com.oops;


public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.print();
        System.out.println("....................");
        Vehicle vehicle2=new Vehicle("mahindra");
        vehicle2.print();
        System.out.println(".....................");
        Vehicle vehicle3=new Vehicle("mahindra",576899);
        vehicle3.print();
        System.out.println(".................");
        Vehicle vehicle4=new Vehicle("mahindra",76980,"XUV300");
        vehicle4.print();


    }
}


