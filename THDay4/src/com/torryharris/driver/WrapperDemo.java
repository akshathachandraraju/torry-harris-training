package com.torryharris.driver;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;
        Integer iobj=a; //boxing
       // int b=iobj; //unboxing
        Integer objb1=iobj+10; // iobje is unboxing and (iobj+10) is boxing in objb1
        Integer objb2=iobj-2;
        Integer objb3=iobj*2;
        Integer objb4=iobj/5;
        System.out.println("sum:"+objb1);
        System.out.println("Difference:"+objb2);
        System.out.println("Mul:"+objb3);
        System.out.println("Divi:"+objb4);
       // System.out.println(iobj);
        /* String to Integer conversion
        String str="12";
        System.out.println(str+10);
        int num=Integer.parseInt(str);
        System.out.println(num+10);
        */
       /* Scanner sc=new Scanner(System.in);
        String i,f;
        i=sc.next();
        f=sc.next();

        int inum=Integer.parseInt(i);
        System.out.println(inum*2);
        float fnum=Float.parseFloat(f);
        System.out.println(fnum*2);
*/
    }
}
