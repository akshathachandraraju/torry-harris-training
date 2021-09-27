package com.torryharris.driver;
import com.torryharris.model.Emplyoee;
import com.torryharris.model.GenericPrint;
public class GenericsDemo {
    public static void main(String[] args) {

        GenericPrint<Integer,Float> iPrint=new GenericPrint<>(10,2.5f);
        System.out.println(iPrint.getObj1());
        System.out.println(iPrint.getObj2());
        GenericPrint<String,Integer> istring=new GenericPrint<>("Demo",20);
        System.out.println(istring.getObj1());
        System.out.println(istring.getObj2());
        Emplyoee emp=new Emplyoee(101,"ram","HR");
        GenericPrint<Emplyoee,String> iemp=new GenericPrint<>(emp,"Example");
        System.out.println(iemp.getObj1());
        System.out.println(iemp.getObj2());
        iemp.GenericDisplay(emp);
    }

    }

