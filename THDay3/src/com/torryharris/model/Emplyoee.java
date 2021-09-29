package com.torryharris.model;

public class Emplyoee {
    private String name;
    private int emplyoeeid;
    private String designation;
    private float salary;

    public Emplyoee() {
    }

    public Emplyoee(String name, int emplyoeeid, String designation, float salary) {
        this.name = name;
        this.emplyoeeid = emplyoeeid;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmplyoeeid() {
        return emplyoeeid;
    }

    public void setEmplyoeeid(int emplyoeeid) {
        this.emplyoeeid = emplyoeeid;
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

   @Override
    public String toString() {
        return
                "name='" + name + ' ' +
                ", emplyoeeid=" + emplyoeeid +
                ", designation='" + designation + ' ' +
                ", salary=" + salary ;

    }

}
