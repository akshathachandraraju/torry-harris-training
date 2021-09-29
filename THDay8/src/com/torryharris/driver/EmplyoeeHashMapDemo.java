package com.torryharris.driver;

import com.torryharris.model.Emplyoee;

import java.util.HashMap;
import java.util.Map;

public class EmplyoeeHashMapDemo {
    public static void main(String[] args) {
        Emplyoee emplyoe1=new Emplyoee(901,"ram","HR",10000);
        Emplyoee emplyoe2=new Emplyoee(101,"geeta","Manager",15000);
        Emplyoee emplyoe3=new Emplyoee(891,"akbar","Lead",20000);
        HashMap<Integer,Emplyoee>emplyoeeHashMap=new HashMap<>();
        emplyoeeHashMap.put(emplyoe1.getEmpId(), emplyoe1);
        emplyoeeHashMap.put(emplyoe2.getEmpId(), emplyoe2);
        emplyoeeHashMap.put(emplyoe3.getEmpId(), emplyoe3);
        for(Map.Entry<Integer,Emplyoee> emplyoee:emplyoeeHashMap.entrySet())
            System.out.println(emplyoee.getKey()+"="+emplyoee.getValue());
        System.out.println();
    Emplyoee emplyoe11=new Emplyoee(911,"rama","HR",10000);
    Emplyoee emplyoe22=new Emplyoee(111,"satya","Manager",15000);
    Emplyoee emplyoe33=new Emplyoee(811,"akash","Lead",20000);
    HashMap<Emplyoee,String>emplyoeeHashMap1=new HashMap<>();
        emplyoeeHashMap1.put(emplyoe1, emplyoe11.getName());
        emplyoeeHashMap1.put(emplyoe2, emplyoe22.getName());
        emplyoeeHashMap1.put(emplyoe3, emplyoe33.getName());
        for(Map.Entry<Emplyoee,String> emplyoee1:emplyoeeHashMap1.entrySet())
            System.out.println(emplyoee1.getKey()+"="+emplyoee1.getValue());
}
}
