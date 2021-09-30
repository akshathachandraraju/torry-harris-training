package com.torryharris.model;

import java.io.Serializable;

public class Emplyoee implements Serializable {
    private int empId;
    private String name;
    private String designation;
    private int salary;

    public Emplyoee() {
    }

    public Emplyoee(int empId, String name, String designation,int salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Emplyoee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary='"+salary+
                '}';
    }

}

