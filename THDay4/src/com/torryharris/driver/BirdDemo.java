package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        Bird p1=new Peacock();
        p1.fly();
        p1.eat();

        Bird p2=new Pigeon();
        p2.fly();
        p2.eat();

        Bat b=new Bat();
        b.feed();
        b.eat();
        b.fly();

        Bird bat=new Bat();
        bat.fly();
    }
}
