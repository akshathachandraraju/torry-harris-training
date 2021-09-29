package com.torryharris.driver;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="abcd";
        String s2=new String("abcd");
        String s3=s1.concat("ef");;
        System.out.println(s1+" "+s1.hashCode());
        System.out.println(s2+" "+s2.hashCode());
        System.out.println(s3+" "+s3.hashCode());

    }
}
