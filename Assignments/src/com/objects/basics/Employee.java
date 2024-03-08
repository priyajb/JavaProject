package com.objects.basics;

public class Employee {

    String employeeName;
    String designation;

    public Employee(String employeeName, String designation) {
        this.employeeName = employeeName;
        this.designation = designation;
    }
    double calcBonus(double basicAllowance)
    {
        return basicAllowance;
    }
    double calcBonus(double basicAllowance,double houseAllowance,String gift)
    {
        System.out.println("your gift is"+gift);
        return(basicAllowance+houseAllowance);
    }
    double calcBonus(double basicAllowance,String gift,double houseAllowance,double carAllowance)
    {
        System.out.println("your gift is"+gift);
        return(basicAllowance+houseAllowance+carAllowance);
    }
}
