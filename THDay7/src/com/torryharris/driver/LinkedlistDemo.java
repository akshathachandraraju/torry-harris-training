package com.torryharris.driver;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<String>stringLinkedList=new LinkedList<>();
        stringLinkedList.add("jin");
        stringLinkedList.add("suga");
        stringLinkedList.add("jhope");
        stringLinkedList.addFirst("RM");
        stringLinkedList.add("jimin");
        stringLinkedList.add("v");
        stringLinkedList.addLast("Jungkook");

        LinkedList<String>stringLinkedList1=new LinkedList<>();
        stringLinkedList1.add("akc");
        stringLinkedList1.add("BTS");
        stringLinkedList1.addAll(stringLinkedList);
        for(String l:stringLinkedList1)
            System.out.println(l);
        Stack<Integer>integerStack=new Stack<>();
        integerStack.push(10);
        integerStack.push(30);
        integerStack.push(50);
        integerStack.push(70);
        integerStack.pop();
        System.out.println(integerStack);
    }
}
