package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("priya", 12, "davangere");
        customers.add(customer1);
        Customer customer2 = new Customer("jimmy", 13, "bangalore");
        customers.add(customer2);
        Customer customer3 = new Customer("vinutha", 14, "hyderbad");
        customers.add(customer3);
        Customer customer4 = new Customer("mala", 15, "belgav");
        customers.add(customer4);
        Customer customer5 = new Customer("jaya", 16, "bidar");
        customers.add(customer5);

        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer str = iterator.next();
            System.out.println(str);
        }
        System.out.println("................................");
        for (Customer list : customers) {
            System.out.println(list);
        }

        List<Customer> customerByCity = new ArrayList<>();
        for (Customer customer : customers) {
            customerByCity.add(customer);
            if (customer.getCity().equals("bangalore")) {
               customerByCity.add(customer);
            }
        }
        Iterator<Customer> iterator1 = customers.iterator();
        while (iterator1.hasNext()) {
            Customer str = iterator1.next();
            System.out.println(str);
        }
    }
}