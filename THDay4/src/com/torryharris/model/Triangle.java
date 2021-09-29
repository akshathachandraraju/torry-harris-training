package com.torryharris.model;

public class Triangle extends Shape{
    private int length;
    private int height;

    public Triangle(int length, int height) {
        this.length = length;
        this.height = height;
        setNoOfSides(3);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("No of sides :"+getNoOfSides());
        System.out.println("Area of triangle :"+(length*height/2));

    }
}
