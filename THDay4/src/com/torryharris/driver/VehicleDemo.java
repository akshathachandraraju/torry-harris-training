package com.torryharris.driver;

import com.torryharris.model.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Car c1=new Swift();
        c1.changeGear();
        c1.move();
        Boat b1=new Titanic();
        b1.floating();
        b1.move();
        Airplane a1=new AirIndia();
        a1.fly();
        a1.move();
        Vehicle car=new Swift();
        car.move();
        Vehicle titanic=new Titanic();
        titanic.move();



    }
}
