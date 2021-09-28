package com.torryharris.model;

public class Emplyoe implements Comparable<Emplyoe>{
    private int empId;
    private String name;
    private String designation;
    private int salary;

    @Override
    public int compareTo(Emplyoe o) {
        //return this.name.compareTo(o.name);// compare by name
        return this.empId-o.empId; //ascending order
      //  return o.empId-this.empId;//descending order
    }

    public Emplyoe() {
    }

    public Emplyoe(int empId, String name, String designation,int salary) {
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
        return "Emplyoe{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}
