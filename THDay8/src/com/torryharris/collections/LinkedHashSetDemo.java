package com.torryharris.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String>stringLinkedHashSet=new LinkedHashSet<>();
        stringLinkedHashSet.add("sita");
        stringLinkedHashSet.add("siya");
        stringLinkedHashSet.add("ramya");
        stringLinkedHashSet.add("geeta");
       // for(String s:stringLinkedHashSet)
       // System.out.println(s);
        stringLinkedHashSet.remove("siya");
        stringLinkedHashSet.add(null);
        for(String s:stringLinkedHashSet)
            System.out.println(s);



    }
}
