package com.torryharris.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1001,"akc");
        hashMap.put(1002,"abc");
        hashMap.put(1003,"sita");
        hashMap.put(1004,"akash");
        System.out.println(hashMap);
        hashMap.put(1001,"mnc");
       // Iteration of map using entry method
       for(HashMap.Entry<Integer,String> h:hashMap.entrySet())  //HashMap.Entry is the interface
           System.out.println(h.getKey()+"="+h.getValue());
       // Using Iterator method
        Iterator hashMapIterator = hashMap.entrySet().iterator();
        while (hashMapIterator.hasNext()) {
            System.out.println(hashMapIterator.next());
        }
        //using key set method
        for(Integer key:hashMap.keySet())
            System.out.println(key+"="+hashMap.get(key));
    }
}
