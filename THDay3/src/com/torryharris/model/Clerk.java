package com.torryharris.model;

public class Clerk extends Emplyoee{
   private String degree;

    public Clerk() {
    }

    public Clerk(String name, int emplyoeeid, String designation, float salary, String degree) {
        super(name, emplyoeeid, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void generatePayRoll(){
        System.out.println("generates payroll");
    }

    @Override
    public String toString() {

        return "Clerk{" + super.toString()+
                " , "+
                "degree='" + degree + '\'' +
                '}';
    }
}
