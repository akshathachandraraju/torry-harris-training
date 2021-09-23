package com.torryharris.driver;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            readfromfile("f1.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void readfromfile(String filename)  throws FileNotFoundException {
            File file=new File("file.txt");
    }
}
