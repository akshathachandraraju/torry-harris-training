package com.torryharris.driver;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int i,b,c;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        c=sc.nextInt();
        try {
            if (c == 0) {
                throw new ArithmeticException("divide by zero exception");
            } else {
                i = b / c;
            }
        }
        catch(ArithmeticException e){
            System.out.println("exception caught");
            System.out.println(e);
        }
        System.out.println("after if-else statement");
    }
}
