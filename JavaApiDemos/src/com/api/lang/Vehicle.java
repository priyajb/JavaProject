package com.api.lang;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String brand;
    private  String color;
     public Vehicle(){

     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return model.equals(vehicle.model) && brand.equals(vehicle.brand) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand);
    }

    public Vehicle(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
