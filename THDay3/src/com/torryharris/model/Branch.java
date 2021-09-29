package com.torryharris.model;

public class Branch extends College{
    private String bName;
    private int bID;
    College college;
    public Branch() {
    }

    public Branch(String bName, int bID, College college) {
        this.bName = bName;
        this.bID = bID;
        this.college = college;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }
public void displayBranch(){
    System.out.println("College details:");
    System.out.println("College name:"+college.getcName());
    System.out.println("College ID:"+college.getcID());
    System.out.println("College Address:"+college.getcAddress());
    System.out.println("Branch details :");
    System.out.println("Branch name:"+bName);
    System.out.println("Branch ID:"+bID);
}
}
