package com.oops.inheritance;

public class InEmployee {
    String employeeName;
    int employeeId;

    public InEmployee() {
    }

    void getDetails() {
        System.out.println(employeeName + " " + employeeId);
    }


    public InEmployee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
}
