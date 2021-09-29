package com.torryharris.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stringHashSet=new HashSet<>();
        stringHashSet.add("akash");
        stringHashSet.add("sita");
        stringHashSet.add("ram");
        stringHashSet.add("abc");
        stringHashSet.add(null);
        System.out.println(stringHashSet);
        HashSet<Float>floatHashSet=new HashSet<>();
        floatHashSet.add(12.3f);
        floatHashSet.add(8.76f);
        floatHashSet.add(1234.8f);
        floatHashSet.add(12.44f);
        floatHashSet.add(null);;
        System.out.println(floatHashSet);
    }
}
