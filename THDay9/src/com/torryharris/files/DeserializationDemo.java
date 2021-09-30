package com.torryharris.files;

import com.torryharris.model.Emplyoee;
import java.io.*;
import java.util.ArrayList;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("emplyoees.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        ArrayList<Emplyoee>emplyoeeArrayList=new ArrayList<>();
        Emplyoee emplyoee;
        try {
            while (true) {
                emplyoee = (Emplyoee) inputStream.readObject();
                //System.out.println(emplyoee);
                emplyoeeArrayList.add(emplyoee);
            }
        } catch (EOFException ex) {
            System.out.println();
        }
        System.out.println("Emplyoee details are:");
        for(Emplyoee e:emplyoeeArrayList)
            System.out.println(e);
    }
}