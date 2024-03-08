package com.oops.inheritance;

public class InManager extends InEmployee {
    double salary;

    public InManager(String employeeName, int employeeId, double salary) {
        super(employeeName, employeeId);
        this.salary = salary;
    }

    InManager()
    {
        employeeName="priya";
        employeeId=89;
        salary=20000;
    }
void printBonus(double amount){
    System.out.println("bonus :"+(amount+salary));
}

}
