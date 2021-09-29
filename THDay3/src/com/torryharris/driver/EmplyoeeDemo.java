package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Emplyoee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmplyoeeDemo {
    public static void main(String[] args) {
        Manager akshatha=new Manager("akshatha",100,"Manager",50000f,"Jio",5);
        Lead sita=new Lead("sita",101,"TechLead",40000f,6);
        Clerk ram=new Clerk("ram",102,"clerk",15000f,"B.com");
        System.out.println(akshatha);
        System.out.println(sita);
        System.out.println(ram);

    }
}
