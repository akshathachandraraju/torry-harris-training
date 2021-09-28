package com.torryharris.driver;

import com.torryharris.comparator.EmployeenameComparator;
import com.torryharris.model.Emplyoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("xyz");
        System.out.println("Before:"+stringList);
        stringList.add(0,"sita");
        stringList.remove(1);
        System.out.println("After:"+stringList);
        doubleList.add(2.34);
        doubleList.add(456.3);
        doubleList.add(89.76);
        System.out.println("Before:"+doubleList);
        doubleList.add(1,45.34);
        doubleList.remove(2);
        System.out.println("After:"+doubleList);
        for(int i=0;i<doubleList.size();i++){
            System.out.println(doubleList.get(i));
        }
        Emplyoe emplyoe1=new Emplyoe(901,"ram","HR",10000);
        Emplyoe emplyoe2=new Emplyoe(101,"geeta","Manager",15000);
        Emplyoe emplyoe3=new Emplyoe(891,"akbar","Lead",20000);
        ArrayList<Emplyoe> emplyoeList = new ArrayList<>();
        emplyoeList.add(emplyoe1);
        emplyoeList.add(1,emplyoe2);
        emplyoeList.add(emplyoe3);
       // System.out.println("Before:"+emplyoeList);

        // for loop method
        /*for(int i=0;i<emplyoeList.size();i++){
            System.out.println(emplyoeList.get(i));
        }*/
        // for each method
        /*for (Emplyoe emplyoe:emplyoeList){
            System.out.println(emplyoe);
        }*/
        // Interator method
        Iterator<Emplyoe> emplyoeIterator=emplyoeList.iterator();
        while(emplyoeIterator.hasNext())
            System.out.println(emplyoeIterator.next());
        System.out.println();

        System.out.println("after sorting ascending order");
        emplyoeList.sort(null);
        emplyoeList.sort(new EmployeenameComparator()); //compare the two objects and sort by name by using comparator
        Iterator<Emplyoe> emplyoeIterator2=emplyoeList.iterator();
        while(emplyoeIterator2.hasNext())
            System.out.println(emplyoeIterator2.next());
        System.out.println();

        System.out.println("after sorting descending order");
        emplyoeList.sort(Collections.reverseOrder());
        Iterator<Emplyoe> emplyoeIterator1=emplyoeList.iterator();
        while(emplyoeIterator1.hasNext())
            System.out.println(emplyoeIterator1.next());
        // to check the previous elements
        /*ListIterator<Emplyoe> emplyoeListIterator= emplyoeList.listIterator();
        while(emplyoeListIterator.hasPrevious())
            System.out.println(emplyoeListIterator.previous());*/

       /* ArrayList<Object> objectList=new ArrayList<>(); //arraylist of object class
        objectList.add(10);
        objectList.add(2.5f);
        objectList.add("rama");
        objectList.add(emplyoe1);
        for(Object object:objectList){
            System.out.println(object);
        }*/
    }
}
