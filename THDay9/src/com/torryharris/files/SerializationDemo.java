package com.torryharris.files;

import com.torryharris.model.Emplyoee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Emplyoee e1=new Emplyoee(901,"ram","HR",10000);
        Emplyoee e2=new Emplyoee(101,"geeta","Manager",15000);
        Emplyoee e3=new Emplyoee(891,"akbar","Lead",20000);
        Emplyoee e4=new Emplyoee(911,"rama","Trainee",10000);
        Emplyoee e5=new Emplyoee(111,"satya","Sales",15000);
        FileOutputStream fos=new FileOutputStream("emplyoees.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fos);
        outputStream.writeObject(e1);
        outputStream.writeObject(e2);
        outputStream.writeObject(e3);
        outputStream.writeObject(e4);
        outputStream.writeObject(e5);
        outputStream.flush();
        outputStream.close();
        fos.close();
    }
}
