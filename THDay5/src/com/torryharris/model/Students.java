package com.torryharris.model;

public class Students extends Branch{
    private int USN;
    private String sName;
    College college;
    Branch branch;
    public Students() {
    }

    public Students(int USN, String sName, College college, Branch branch) {
        this.USN = USN;
        this.sName = sName;
        this.college = college;
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getUSN() {
        return USN;
    }

    public void setUSN(int USN) {
        this.USN = USN;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

   public void displayStudent(){
       System.out.println("College details:");
       System.out.println("College name:"+college.getcName());
       System.out.println("College ID:"+college.getcID());
       System.out.println("College Address:"+college.getcAddress());
       System.out.println("Branch details :");
       System.out.println("Branch name:"+branch.getbName());
       System.out.println("Branch ID:"+branch.getbID());
       System.out.println("Student details:");
       System.out.println("student name:"+sName);
       System.out.println("Student USN:"+USN);
   }
}
