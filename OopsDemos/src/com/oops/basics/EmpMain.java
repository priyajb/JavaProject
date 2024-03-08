package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee=new Employee("raj",1,2000);
        employee.employeeName="raju";
        employee.employeeId=13;
        employee.salary=20000;

        employee.getDetails();
        String s=employee.greet(employee.employeeName +"welcome");
        System.out.println(s);

       /* System.out.println("Name " + employee.employeeName);
        System.out.println("Id" +employee.employeeId);
        System.out.println("salary"+employee.salary);*/
    }
}
