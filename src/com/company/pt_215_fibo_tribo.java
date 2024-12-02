//package com.company;
//import java.util.Scanner;
//public class lappt_3_fibo_tribo {
//    static void fibo(int r){
//        int n1=0,n2=1;
//        if (r<=1)//index=0 &,its length=1.
//        {
//            System.out.println(0);
//        }
//        else {
//            System.out.print(n1 + " " + n2 + " ");
//        }
//        for(int i=2;i<r;i++){//series index starts from 0.
//            int c=n1+n2;
//            System.out.print(c+" ");
//            n1=n2;
//            n2=c;
//        }
//    }
//    static void tribo(int r){
//        int n1=0,n2=1,n3=1;
//        if (r==1)
//        {
//            System.out.println(0);
//        }
//        else if(r==2) {
//            System.out.print(n1 + " " + n2 + " ");
//        }
//        else {
//            System.out.print(n1 + " " + n2 + " " + n3 + " ");
//        }
//        for(int i=4;i<=r;i++){//Series length starts from 1.
//            int c=n1+n2+n3;
//            System.out.print(c+" ");
//            n1=n2;
//            n2=n3;
//            n3=c;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        Question 3:
//        System.out.println("Enter the length of fibo series:");
//        int r=sc.nextInt();
//        fibo(r);
////        Question 4:
//        System.out.println("\nEnter the length of tribo series:");
//        int r1=sc.nextInt();
//        tribo(r1);
//
//    }
//}
