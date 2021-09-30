package com.torryharris.files;

import java.io.*;
import java.util.Scanner;

public class NameDemo {
    public static void main(String[] args) throws IOException {
        int n;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        System.out.println("enter the name:");
        str=sc.next();
        FileReader reader = new FileReader("input1.txt");
        FileWriter writer=new FileWriter("output3.txt");
        for(int i=0;i<n;i++) {
            writer.write(str);
            writer.write("\n");
            writer.flush();
        }
        writer.close();
        }
    }

