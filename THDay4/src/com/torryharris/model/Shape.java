package com.torryharris.model;

public abstract class Shape {
     private int noOfSides;
     public abstract void area();

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }
}
