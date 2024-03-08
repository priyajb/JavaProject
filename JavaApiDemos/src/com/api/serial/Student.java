package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID=3L;
    private String Name;
    private int Id;
    private transient String Department;


    public Student(){

    }

    public Student(String name, int id, String department) {
        Name = name;
        Id = id;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", Department='" + Department + '\'' +
                '}';
    }
}
