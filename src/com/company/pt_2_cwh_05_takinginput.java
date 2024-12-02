package com.company;
import java.util.Scanner;
public class pt_2_cwh_05_takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");//new scanner means mai apna instance(object) banana chahta hu..
        Scanner sc=new Scanner(System.in);//System.in bolta hai ki mai keyboard ke input ko lena chahta hu..
//        oops me kya hota hai ki ek class hoti hai ussi se object bannaye jaate hai..
//        submission jo hai jisme paper ke answer likhte ho tum wo object hai class ek template hai...
//        ex:sab bacche apna alag object banna sakte hai matlab answer likh sakte hai same class(template) ko use kar ke..
        System.out.println("Enter number 1`");
//      int a=sc.nextInt();
        //System.out.println(sc.hasNextInt());
//         boolean b1=sc.hasNextInt();
//        System.out.println(b1);
//        System.out.println(sc.hasNextInt());
  //     float a =sc.nextFloat();
        System.out.println("Enter number 2");
       // int b=sc.nextInt();
        //boolean b2=sc.hasNextFloat();
       //boolean b2=sc.hasNextShort();
       boolean b2=sc.hasNextDouble();
       System.out.println(b2);
//        System.out.println(sc.hasNextInt());
//        float b =sc.nextFloat();

      //  String str = sc.next();
        //String str1=sc.nextLine();
//        char ch=sc.nextAt();-Erorr
        //String str = sc.next();
       // System.out.println(str);
      // System.out.println(str1);
       //System.out.println(str);
        //int sum=a+b;
      // float sum=b+a;
        System.out.println("The sum of these number is :");
       // System.out.println(sum);

    }
}
