package com.util.list;

public class Customer {
    private String Name;
    private int CustomerId;
    private String city;

    public Customer() {
    }

    public Customer(String name, int customerId, String city) {
        Name = name;
        CustomerId = customerId;
        this.city = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", CustomerId=" + CustomerId +
                ", city='" + city + '\'' +
                '}';
    }
}
