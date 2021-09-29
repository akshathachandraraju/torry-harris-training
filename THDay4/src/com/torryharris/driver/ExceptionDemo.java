package com.torryharris.driver;
public class ExceptionDemo {
    public static void main(String[] args) {
        /*int[] a = new int[4];
        a[4] = 10;
        /*String s = null;
        System.out.println(s.length());
        int i = 3, b = 0;
        System.out.println(i / 0);*/
            try{
                System.out.println("start");
                int[] a = new int[4];
                a[4]=10;
                int x=10,y=0;
                int c=x/y;
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("1 exception caught");
           }
            catch(ArithmeticException e){
                System.out.println("2 exception caught");
            }
           catch(Exception ex){
                System.out.println(ex);
               // ex.printStackTrace();//displays where exception occured
            }
        System.out.println("end");
        }
    }
