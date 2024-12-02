//package com.company;
//import java.util.Scanner;
//public class selfpt_22_gcd_lcm {
//    static int gcd(int a,int b){
//        int gcd=1;
//        for (int i=2;i<=10;i++){
//            while (a%i==0&&b%i==0){
//                a=a/i;
//                b=b/i;
//                gcd*=i;
//            }
//        }
//        return gcd;
//    }
//    static int lcm(int a,int b){
//        int lcm=1;
//        for (int i=2;i<=10;i++){
//            while (a%i==0||b%i==0){
//                if(b%i!=0) {
//                    a = a / i;
//                }
//               else if(a%i!=0){
//                   b=b/i;
//                }
//               else{
//                    a = a / i;
//                    b=b/i;
//                }
//                lcm*=i;
//            }
//        }
//        return lcm;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a first number:");
//        int a =sc.nextInt();
//        System.out.println("enter a first number:");
//       int b=sc.nextInt();
////       int a1=a;
////       int b1=b;
////  GCD
//        System.out.println(" Gcd of "+a+" and "+b+" is "+" = "+ gcd(a,b));
////  LCM
//        System.out.println(" Lcm of "+a+" and "+b+" is "+" = "+ lcm(a,b));
//    }
//    }
