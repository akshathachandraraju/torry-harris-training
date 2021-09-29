package com.torryharris.collections;

import com.torryharris.model.Emplyoee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("abc", 1);
        treeMap1.put("def", 2);
        treeMap1.put("jkl", 4);
        treeMap1.put("ghi", 3);
        System.out.println(treeMap1);
        System.out.println();
        Emplyoee emplyoe1=new Emplyoee(901,"ram","HR",10000);
        Emplyoee emplyoe2=new Emplyoee(101,"geeta","Manager",15000);
        Emplyoee emplyoe3=new Emplyoee(891,"akbar","Lead",20000);
        TreeMap<Integer,Emplyoee> emplyoeeHashMap=new TreeMap<>();
        emplyoeeHashMap.put(emplyoe1.getEmpId(), emplyoe1);
        emplyoeeHashMap.put(emplyoe2.getEmpId(), emplyoe2);
        emplyoeeHashMap.put(emplyoe3.getEmpId(), emplyoe3);
        for(Map.Entry<Integer,Emplyoee> emplyoee:emplyoeeHashMap.entrySet())
            System.out.println(emplyoee.getKey()+"="+emplyoee.getValue());
        System.out.println();
    }
}
