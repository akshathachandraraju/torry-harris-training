package com.torryharris.driver;

import com.torryharris.model.Person;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Person p=new Person(9805673,"akbar","delhi","Manager");
        Person p1=new Person(1234444,"ram","Karntaka","Govt Emplyoee");
        Person p2=new Person(4567832,"sita","Utter Pradesh","Bank emplyoee");
        ArrayList<Person> personList=new ArrayList<>();
        personList.add(p);
        personList.add(p1);
        personList.remove(1);
        personList.add(1,p1);
        personList.add(0,p2);
        Iterator<Person> personIterator=personList.iterator();
        while(personIterator.hasNext())
            System.out.println(personIterator.next());
        System.out.println();
        System.out.println("after sorting:");
        personList.sort(null);
        Iterator<Person> personIterator1=personList.iterator();
        while(personIterator1.hasNext())
            System.out.println(personIterator1.next());
    }
}
