package com.torryharris.model;

public class Bat implements Bird,Mammal{
    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }

    @Override
    public void feed() {
        System.out.println("bat feed pups");
    }

    @Override
    public void eat() {
        System.out.println("bat is eating insects");

    }
}
