package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Swift is changing gear");
    }

    @Override
    public void move() {
        System.out.println("swift is moving");
    }
}
