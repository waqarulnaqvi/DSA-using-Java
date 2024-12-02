package com.company;
import java.util.Scanner;
public class pt_10_cwh13strings {
    public static void main(String[] args) {
//        String kk="waqarul";
        //%d,%s etc is  a format specifier..
       // String kk(reference)=(object)"waqarul";
//      In java string is a sequence of character.
//        java has a special support of string.
//        string is a class in java.
        //String is not a primitive data type in java..
//        you can use it as primitive data type in java,
//        Strings are immutable and it can't be changed but u can make it's copy and can change it's copy.
//        String name =new String("Waqarul");
//        //System.out.print("The name is :");
//
//        System.out.println(name);
//        int a =68980;
//        float b=85.64554f;
//        // $d is a format specifer
//        System.out.printf("The value of a is %10d and value of b is %5.100f \n",a,b);
//      //  System.out.printf("%d  %f",a,b);//\n and \t works in java
//        System.out.format("%d  %f",a,b);
        Scanner sc=new Scanner(System.in);
//  String kl=sc.next();
//      String st=sc.nextLine();
//       System.out.print("\n"+st+"\n"+kk);

        String sk,skk;
       /* System.out.println("Enter a String 1:");
        sk=sc.next();
        System.out.println("Enter a String 2:");
        skk=sc.nextLine();//next input won't take compiler only next line input take compiler..
        System.out.print("\n"+sk+"\n"+skk);*/

        /* String skkk,skkkk;
        System.out.println("Enter a String 1:");//no use code..
        sk=sc.next();
        System.out.println("Enter a String 2:");
        skk=sc.next();
        skkk=sc.nextLine();
        skkkk=sc.next();
        System.out.print("\n"+sk+"\n"+skk +"\n"+skkk+"\n"+skkkk);*/


        System.out.println("Enter a String 2:");
        skk=sc.nextLine();
        System.out.println("Enter a String 1:");
        sk=sc.next();
        System.out.print("\n"+sk+"\n"+skk);
    }
}
