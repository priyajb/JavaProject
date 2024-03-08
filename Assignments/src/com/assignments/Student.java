package com.assignments;

import javax.swing.*;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Student name:" + name);
        System.out.println("Student department:" + department);
    }

    public String getGrade(int... marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / (double) marks.length;

        if (average >= 90) {
            return "Grade A";
        } else if (average >= 80) {
            return "Grade B";
        } else if (average >= 70) {
            return "Grade C";
        } else if (average >= 60) {
            return "Grade D";
        } else if (average >= 50) {
            return "Grade E";
        } else {
            return "fail";
        }

    }

}

