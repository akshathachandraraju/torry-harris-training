package com.torryharris.model;

public class College {
    private int cID;
    private String cName;
    private String cAddress;

    public College() {
    }

    public College(int cID, String cName, String cAddress) {
        this.cID = cID;
        this.cName = cName;
        this.cAddress = cAddress;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

   public void displayCollege(){
       System.out.println("College details:");
       System.out.println("College name:"+cName);
       System.out.println("College ID:"+cID);
       System.out.println("College Address:"+cAddress);
   }
}
