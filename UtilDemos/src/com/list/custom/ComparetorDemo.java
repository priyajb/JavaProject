package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparetorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("city", "honda", 23_90_000),
                new Vehicle("hexa", "tata", 12_90_000),
                new Vehicle("santro", "hyundai", 43_90_000),
                new Vehicle("a100", "audi", 45_90_000));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("sort by brand");
        Collections.sort(vehicles, new BrandSort());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("sort by model");
        Collections.sort(vehicles, new ModelSort());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("sort by price");
        Collections.sort(vehicles, new PriceSort());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
