package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class StuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name:");
        String name = sc.nextLine();
        System.out.println("enter student department");
        String department = sc.nextLine();
        System.out.println("enter the number of subjects");
        int subjects = sc.nextInt();
        System.out.println("enter the each subject marks");
        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            marks[i] = sc.nextInt();
        }

        Student student1 = new Student(name, department);
        student1.printDetails();
        System.out.println(student1.getGrade(marks));

        Student student2 = new Student(name, department);
        student2.printDetails();
        System.out.println(student2.getGrade(marks));


    }
}
