package com.torryharris.driver;

import com.torryharris.testing.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("sum="+c.add(2,3));
        System.out.println("sub="+c.sub(7,3));
        System.out.println("mul="+c.mul(3,3));
        System.out.println("div="+c.divi(9,3));
    }
}
