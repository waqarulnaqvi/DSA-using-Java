//package com.company;
//import java.util.Scanner;
//public class labpt_4_amst {
//    static void amstrong(int a){
//        int rem,t=a,l=0,ams=0;
////        int mul=1;
//        while (t>0){
//            t=t/10;
//        l++;
//        }
////        System.out.println("l"+l);
////        System.out.println("value of t"+t);
//        t=a;
////        System.out.println("value of t"+t);
//        while (t!=0){
//            rem=t%10;
//           int mul=1;
//            for(int i=0;i<l;i++){
//                mul*=rem;
//            }
//            ams+=mul;
//            t=t/10;
////            mul=1;
//        }
//        if(ams==a)
//        {
//            System.out.println(ams +" is an Amstrong number ");
//        }
//        else {
//            System.out.println(a+" is Not an Amstrong numnber");
//        }
//    }
//    static void amstrong2(int a){
//        int rem,t=a,ams=0,mul=1;
//        while (t!=0){
//            rem=t%10;
//            for(int i=0;i<3;i++){
//                mul*=rem;
//            }
//            ams+=mul;
//            mul=1;
//            t=t/10;
//
//        }
//        if(ams==a)
//        {
//            System.out.println(ams +" is an Amstrong number ");
//        }
//        else {
//            System.out.println(a+" is Not an Amstrong numnber");
//        }
//    }
//    static void amstrong3(int a){
//        int t=a;
////        float sum=0,rem;
//        double sum=0,rem;
//        while (t!=0){
//            rem=t%10;
////          sum= (float) (sum+Math.pow(rem,3));
//            sum= sum+Math.pow(rem,3);
//            t=t/10;
//
//        }
//        if(sum==a)
//        {
//            System.out.println(sum +" is an Amstrong number ");
//        }
//        else {
//            System.out.println(a+" is Not an Amstrong numnber");
//        }
//    }
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//int n= sc.nextInt();
//amstrong(n);
//amstrong2(n);
//amstrong3(n);
//    }
//}
