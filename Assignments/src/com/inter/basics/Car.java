package com.inter.basics;

public class Car extends Vehical implements IInternal,IExternal{
    String type;

    public Car(String brand, String model, double price) {
        super(brand, model, price);
    }

    void show()
    {
        if(type.equals(""))
        System.out.println("details");
    }

    @Override
    public void showAcessories() {
        System.out.println("show accessories");
    }

    @Override
    public void insuranceDetails() {
        System.out.println("insurance details");
    }

    @Override
    void getMilage() {

    }

    @Override
    public void exterior() {

    }

    @Override
    public void interior() {

    }
}
