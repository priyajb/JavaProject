package com.objects.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Employee employee = new Employee("priya", "software trainee");

        Employee[] empList = new Employee[3];

        for (int i = 0; i < empList.length; i++) {
            System.out.println("enter the name and designation");
            String name = sc.next();
            String designation = sc.next();

            empList[i] = new Employee(name, designation);
        }

/*
        System.out.println("enter your choice :"+"Manager or Programmer");
        String choice=sc.next();

        if (designation.equals("programmer")) {
            System.out.println(emp.calcBonus(30000));
        } else if (designation.equals("manager")) {
            System.out.println(emp.calcBonus(3300, 4000, "car"));
        } else {
            System.out.println(emp.calcBonus(3000, 45434, "bike"));
        }
    }
}*/











        /*for (Employee emp : empList) {
            if (emp.designation.equals("programmer")) {
                emp.calcBonus(30000);
            }
*/


    }
    }