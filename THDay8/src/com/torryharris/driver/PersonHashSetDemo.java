package com.torryharris.driver;

import com.torryharris.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(121,"ram","manager","bangalore");
        Person p2=new Person(342,"sita","lead","mysore");
        Person p3=new Person(125,"radha","clerk","udupi");
        Person p4=new Person(342,"sita","trainee","mumbai");
        HashSet<Person>peopleHashset=new HashSet<>();
        peopleHashset.add(p1);
        peopleHashset.add(p2);
        peopleHashset.add(p3);
        peopleHashset.add(p4);
        System.out.println(p1.hashCode());
        System.out.println(p2.equals(p4));
        for(Person p:peopleHashset)
        System.out.println(p);
    }
}
