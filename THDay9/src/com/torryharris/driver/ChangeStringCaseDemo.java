package com.torryharris.driver;

import com.torryharris.testing.ChangeStringCase;

public class ChangeStringCaseDemo {
    public static void main(String[] args) {
        ChangeStringCase stringCase=new ChangeStringCase();
        System.out.println(stringCase.toCapitalLetter("abc"));
        System.out.println(stringCase.toSmallLetter("ABc"));
    }
}
