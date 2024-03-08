package com.util.maps;

public class Department {
    private String deptHead;
    private int id;
    private String deptName;

    public Department() {
    }

    public Department(String deptHead, int id, String deptName) {
        this.deptHead = deptHead;
        this.id = id;
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptHead='" + deptHead + '\'' +
                ", id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
