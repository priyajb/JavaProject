package com.inter.basics;

import org.w3c.dom.ls.LSOutput;

abstract class Vehical implements IInsurance {
    String brand;
    String model;
    double price;

    public Vehical(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("  ");
    }

    abstract void getMilage() ;

    }

