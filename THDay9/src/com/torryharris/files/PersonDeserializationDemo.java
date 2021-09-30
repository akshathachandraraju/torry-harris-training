package com.torryharris.files;

import com.torryharris.model.Emplyoee;
import com.torryharris.model.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonDeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("persons.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        ArrayList<Person> personArrayList=null;
        Person person;
        try{
        while(true) {
            person = (Person) inputStream.readObject();
            personArrayList.add(person);
           /* personArrayList=(ArrayList<Person>)
            inputStream.readObject();*/
        }
        }catch(EOFException e){
            System.out.println();
        }
        System.out.println("Person Deatils:");
        personArrayList.sort(null);
        for(Person p:personArrayList)
            System.out.println(p);
    }
}
