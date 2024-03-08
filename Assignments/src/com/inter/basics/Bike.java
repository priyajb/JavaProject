package com.inter.basics;

public class Bike extends Vehical implements IExternal{

    String capacity;

    public Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void showAcessories() {

    }

    @Override
    public void exterior() {

    }

    @Override
    public void insuranceDetails() {

    }

    @Override
    void getMilage() {

    }
}
