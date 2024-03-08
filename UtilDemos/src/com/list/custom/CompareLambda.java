package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("city", "honda", 23_90_000),
                new Vehicle("hexa", "tata", 12_90_000),
                new Vehicle("santro", "hyundai", 43_90_000),
                new Vehicle("a100", "audi", 45_90_000));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("model sort using lambda");
        Collections.sort(vehicles,(o1, o2)->o1.getModel().compareTo(o2.getModel()));

        for (Vehicle vehicle:vehicles)
        {
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,((o1, o2) -> o1.getBrand().compareTo(o2.getBrand())));
        System.out.println("sorting by brand");
        for (Vehicle vehicle:vehicles)
        {
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,((o1, o2) ->((Double)o1.getPrice()).compareTo(o2.getPrice())));
        System.out.println("sorting by price");
        for (Vehicle vehicle:vehicles)
        {
            System.out.println(vehicle);
        }

    }
}
