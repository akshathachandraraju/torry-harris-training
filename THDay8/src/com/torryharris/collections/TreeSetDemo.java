package com.torryharris.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer>integerTreeSet=new TreeSet<>();
        integerTreeSet.add(10);
        integerTreeSet.add(8);
        integerTreeSet.add(89);
        integerTreeSet.add(23);
        integerTreeSet.add(13);
        System.out.println(integerTreeSet);

        TreeSet<String>stringTreeSet=new TreeSet<>();
        stringTreeSet.add("sita");
        stringTreeSet.add("aman");
        stringTreeSet.add("ramya");
        stringTreeSet.add("zaid");
        System.out.println(stringTreeSet);

        TreeSet<Double>doubleTreeSet=new TreeSet<>(Collections.reverseOrder()); //reverse order
        doubleTreeSet.add(23.45);
        doubleTreeSet.add(23.09);
        doubleTreeSet.add(78.9);
        System.out.println(doubleTreeSet);
        System.out.println();
    }
}
