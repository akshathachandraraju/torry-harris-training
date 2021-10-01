package com.torryharris.model;

public class Emplyoee {
    private int empid;
    private String ename;
    private String designation;
    private float salary;
    private int yearOfJoining;

    public Emplyoee() {
    }

    public Emplyoee(int empid, String ename, String designation, float salary, int yearOfJoining) {
        this.empid = empid;
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEnmae(String ename) {
        this.ename=ename;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Emplyoee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
