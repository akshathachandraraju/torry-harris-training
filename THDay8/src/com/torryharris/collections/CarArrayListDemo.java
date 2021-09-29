package com.torryharris.collections;

import com.torryharris.driver.CarPowerComparator;
import com.torryharris.model.Car;

import java.util.*;

public class CarArrayListDemo {
    public static void main(String[] args) {
        Car c1=new Car(110,"Swift","Disel",88.50f);
        Car c2=new Car(120,"ALTO","Petrol",67.50f);
        Car c3=new Car(104,"Jeep","Disel",91.52f);
        Car c4=new Car(134,"RangeRover","Disel",82.15f);
        Car c5=new Car(145,"Balano","Disel",75.50f);
        Car c6=new Car(110,"Swift","Petrol",80.50f);
        ArrayList<Car>carArrayList=new ArrayList<>();
        carArrayList.add(c1);
        carArrayList.add(c2);
        carArrayList.add(c3);
        carArrayList.add(c4);
        carArrayList.add(c5);
        carArrayList.add(c6);
        System.out.println("Car details:");
        Iterator<Car>carIterator=carArrayList.iterator();
        while(carIterator.hasNext())
            System.out.println(carIterator.next());
        System.out.println();

        System.out.println("car details sorted by power:");
        TreeSet<Car>carTreeSet=new TreeSet<>(new CarPowerComparator());
        carTreeSet.add(c1);
        carTreeSet.add(c2);
        carTreeSet.add(c3);
        carTreeSet.add(c4);
        carTreeSet.add(c5);
        carTreeSet.add(c6);
        Iterator<Car>carIterator1=carTreeSet.iterator();
        while(carIterator1.hasNext())
            System.out.println(carIterator1.next());
        System.out.println();

        HashSet<Car>carHashSet=new HashSet<>();
        carHashSet.add(c1);
        carHashSet.add(c2);
        carHashSet.add(c3);
        carHashSet.add(c4);
        carHashSet.add(c5);
        carHashSet.add(c6);
        System.out.println("Car details without duplicate values:");
        Iterator<Car>carIterator2=carHashSet.iterator();
        while(carIterator2.hasNext())
            System.out.println(carIterator2.next());
        System.out.println();
    }
}
