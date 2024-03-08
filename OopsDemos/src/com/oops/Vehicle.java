package com.oops;

public class Vehicle {
    String brand;
    double price;
    String model;
   public Vehicle() {
       System.out.println("default");
   }
    public Vehicle(String brand) {
       this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, double price) {
        this(brand);
        System.out.println("two");
        this.price = price;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand,price);
        System.out.println("three");
        this.model = model;
    }
   void getDetails(){
       System.out.println("brand :"+brand);
       System.out.println("price :"+price);
       System.out.println("model :"+model);
   }
   void print()
   {
       if(brand!=null){
           System.out.println("brand :"+brand);
       }
       if(model!=null)
       {
           System.out.println("model:"+model);
       }
       if(price>0)
       {
           System.out.println("Price :" +price);
       }
   }

    }

