package com.torryharris.driver;

import com.torryharris.comparator.PersonCityComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(121,"ram","manager","bangalore");
        Person p2=new Person(452,"sita","lead","mysore");
        Person p3=new Person(125,"radha","clerk","udupi");
        Person p4=new Person(342,"ramya","trainee","mumbai");
        TreeSet<Person>personTreeSet=new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        for (Person p:personTreeSet)
            System.out.println(p);
        System.out.println();
        System.out.println("sorted by name");
        TreeSet<Person>personNameComparator=new TreeSet<>(new PersonNameComparator()); //sorted by using user comparator
        personNameComparator.add(p1);
        personNameComparator.add(p2);
        personNameComparator.add(p3);
        personNameComparator.add(p4);
        for (Person p:personNameComparator)
            System.out.println(p);
        System.out.println();
        System.out.println("sorting by city");
        TreeSet<Person>treeSetByCity=new TreeSet<>(new PersonCityComparator());
        treeSetByCity.add(p1);
        treeSetByCity.add(p2);
        treeSetByCity.add(p3);
        treeSetByCity.add(p4);
        // treeSetByCity.add(null); null not allowed
        //treeSetByCity.remove(p4);
        for (Person p:treeSetByCity)
            System.out.println(p);
        System.out.println(treeSetByCity.comparator());
    }
}
