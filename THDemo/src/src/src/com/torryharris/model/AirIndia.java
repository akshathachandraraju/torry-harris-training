package com.torryharris.model;

public class AirIndia implements Airplane{
    @Override
    public void fly() {
        System.out.println("AirIndia is flying");
    }

    @Override
    public void move() {
        System.out.println("AirIndia is moving");

    }
}
