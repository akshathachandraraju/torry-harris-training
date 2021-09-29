package com.torryharris.model;

public class AirIndia implements Airplane,Boat{
    @Override
    public void fly() {
        System.out.println("AirIndia is flying");
    }

    @Override
    public void move() {
        System.out.println("AirIndia is moving");

    }

    @Override
    public void floating() {
        System.out.println("floating");
    }
}
