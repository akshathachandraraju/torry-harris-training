package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonSerializationDemo {
    public static void main(String[] args) throws IOException {
        Person p=new Person(98,"akbar","delhi","Manager");
        Person p1=new Person(123,"ram","Karntaka","Govt Emplyoee");
        Person p2=new Person(45,"sita","Utter Pradesh","Bank emplyoee");
        Person p3=new Person(150,"rama","Kerala","HR");
        Person p4=new Person(04,"ramya","Maharastra","Clerk");
        FileOutputStream fos=new FileOutputStream("persons.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fos);
        /*ArrayList<Person>people=new ArrayList<>();  //creating arraylist and passing that list to file.
        people.add(p);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);*/
        outputStream.writeObject(p);
        outputStream.writeObject(p1);
        outputStream.writeObject(p2);
        outputStream.writeObject(p3);
        outputStream.writeObject(p4);
        outputStream.flush();
        outputStream.close();
        fos.close();
    }
}

