package com.torryharris.driver;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
        public static void main(String[] args) {
            ArrayList<Integer> integerList=new ArrayList<>();
            integerList.add(10);
            integerList.add(20);
            integerList.add(30);
            System.out.println(integerList);
            integerList.add(1,50);
            System.out.println(integerList);
            integerList.sort(Collections.reverseOrder());
            System.out.println(integerList);

        }
    }

