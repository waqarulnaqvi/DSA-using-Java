package com.company;
import java.util.Scanner;
public class pt_3_cwh_6_ex1_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of 5 subjects");
        System.out.println("enter marks of physics");
        int a  =sc.nextInt();
        System.out.println("enter marks of chemistry");
        int b= sc.nextInt();
        System.out.println("enter marks of math");
        int c  =sc.nextInt();
        System.out.println("enter marks of computer");
        int d= sc.nextInt();
        System.out.println("enter marks of english");
        int e =sc.nextInt();
        int total =a+b+c+d+e;
        float per=(total*100)/500;
        System.out.println("total marks is"+total);
        System.out.print("percentage is "+per);
        System.out.println("%");
    }
}
