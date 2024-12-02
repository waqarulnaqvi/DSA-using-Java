package com.company;
import java.util.Scanner;
public class pt_95_rombus_pattern {
    public static String str="*****",ktr="     ",ltr="",ptr="";
    public static void rombus_pattern(int n)
    {
        if (n !=0) {
            rombus_pattern(n - 1);
            ptr=ktr+str+ltr+str+ktr;
            ltr=ltr+"  ";
            ktr=ktr.replaceFirst(" ","");
            System.out.println(ptr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of the pattern:");
//        int n=sc.nextInt();
       int n=6;
        rombus_pattern(n);
    }
}
