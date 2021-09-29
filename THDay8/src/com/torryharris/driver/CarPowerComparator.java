package com.torryharris.driver;

import com.torryharris.model.Car;

import java.util.Comparator;

public class CarPowerComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        return Float.compare(o2.getPower(), o1.getPower());
    }
}
