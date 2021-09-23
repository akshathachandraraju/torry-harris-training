package com.torryharris.driver;

import com.torryharris.model.*;

public class MammalDemo {
    public static void main(String[] args) {
        Mammal tiger=new Tiger();
        tiger.feed();
        tiger.eat();

        Mammal cow=new Cow();
        cow.feed();
        cow.eat();

        Bat b=new Bat();
        b.fly();
        b.eat();
        b.feed();

        Mammal bat=new Bat();
        bat.eat();
        bat.feed();

        Animal t1=new Tiger();
        t1.eat();
        }
    }

