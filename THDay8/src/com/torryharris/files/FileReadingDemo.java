package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        System.out.println("File contents are:");
        int ch;
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);

        fis.close();
        FileOutputStream fos=new FileOutputStream("output.txt");
        String str="This is output file";
        char [] array=str.toCharArray();
        for(char c:array)
            fos.write(c);
        fos.close();
        System.out.println("\nContents are written on to output.txt");
    }
}
