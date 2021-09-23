package com.torryharris.model;

public class Cow implements Mammal{

    @Override
    public void feed() {
        System.out.println("cow feeds to calf");
    }

    @Override
    public void eat() {
        System.out.println("cow is eating grass");

    }
}
