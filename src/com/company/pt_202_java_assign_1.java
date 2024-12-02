////package com.company;
//////Question 5.Write a Program to java find the sum of series 1+2+3+4+..+n.
////import java.util.Scanner;
////class  SumofSeries{
////   public int sum(int n){
////       if(n==1)
////       {
////           return 1;
////       }
////       else return n+sum(n-1);
////   }
////}
////public class java_assign_1 {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter an n number:");
////        int n = sc.nextInt();
////        SumofSeries ob = new SumofSeries();
////        System.out.println("Sum of n series is " + ob.sum(n));
////    }
////}
//
//
////Name:Syed Waqarul Hasan Naqvi
////Enroll:1900102580
////Question 5.Write a Program to java find the sum of series 1+2+3+4+..+n.
////import java.util.Scanner;
////class  SumofSeries {
////    public void sum(int n) {
////        int sum = 0;
////        for (int i = 1; i <= n; i++) {
////            sum += i;
////        }
////        System.out.println("sum of n series is "+sum);
////    }
////}
////public class java_assign_1 {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter an n number:");
////        int n = sc.nextInt();
////        SumofSeries ob = new SumofSeries();
////      ob.sum(n);
////    }
////}
//
//
////Name:Syed Waqarul Hasan Naqvi
////Enroll:1900102580
////Question 6.Write a Program to find the largest of three numbers.
//import java.util.Scanner;
//class Largest{
//    void findlarge(int a,int b,int c)
//    {
//        if(a>b&&a>c){
//            System.out.println(a+" is largest");
//        }
//        else if (b>a&&b>c){
//            System.out.println(b+" is largest");
//        }
//        else {
//            System.out.println(c+" is largest");
//        }
//    }
//    void findlarge1(int a,int b,int c){
//        if(a>b){
//            if(b>c){
//                System.out.println(a+" is largest");
//            }
//        }
//        else if(b>c){
//            System.out.println(b+" is largest");
//        }
//        else {
//            System.out.println(c+" is largest");
//        }
//    }
//}
//public class java_assign_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 3 numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        Largest l = new Largest();
//        l.findlarge(a, b, c);
//        l.findlarge1(a, b, c);
//
//    }
//}