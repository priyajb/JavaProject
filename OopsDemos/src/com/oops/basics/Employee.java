package com.oops.basics;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }


    void getDetails(){
        System.out.println("Name"+employeeName);
        System.out.println("EmployeeId"+employeeId);
        System.out.println("salary"+salary);
    }

    String greet(String message){
        return message+" "+employeeName;
    }
    }



