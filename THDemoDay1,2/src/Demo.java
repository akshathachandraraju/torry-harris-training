import java.util.Scanner;

public class Demo {
    public static void main(String [] args){

      /* Ex-1
      int i=1;
       while(i<=10)
       {
           System.out.println("akshatha");
           i++;
       }
*/
        /* Ex-2 default variable value
        byte b=0;
       int i=0;
       float f=0.0f;
       short s=0;
       double d=0.0;
       char c='a';
        System.out.println("byte"+b);
        System.out.println("Integer"+i);
        System.out.println("float"+f);
        System.out.println("short"+s);
        System.out.println("double"+d);
        System.out.println("character"+c);
        */

        /* to read input for different types
        int n;
        String c;
        float f;
        double d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=sc.next();
        f=sc.nextFloat();
        d=sc.nextDouble();
        System.out.println("entered num: "+n);
        System.out.println("enter string: "+c);
        System.out.println("entered num: "+f);
        System.out.println("entered num: "+d);
        */

        /* Ex-2*/
        int i=1,n;
        String c;
        Scanner sc=new Scanner(System.in);
        System.out.println("entered num: ");
        n=sc.nextInt();
        System.out.println("enter string: ");
        c=sc.next();
        while(i<=n){
            System.out.println(c);
            i++;
        }
    }
}


