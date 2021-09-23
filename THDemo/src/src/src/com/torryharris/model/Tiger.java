package com.torryharris.model;

public class Tiger implements Mammal{
    @Override
    public void feed() {
        System.out.println("tiger feeds cub");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating deer");
    }
}
