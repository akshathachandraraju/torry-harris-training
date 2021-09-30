package com.torryharris.files;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        File input = new File("input1.txt");
        FileReader reader = new FileReader(input);
        char[] array = new char[(int)input.length()];
                reader.read(array);
                System.out.println(array);
        reader.close();

        String data = "This is file content of output file using File writer object";
        FileWriter writer=new FileWriter("output2.txt");
        writer.write(data);
        writer.flush();  //forcefully write the content to the file
        writer.close();


    }
}
