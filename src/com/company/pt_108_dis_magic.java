//package com.company;
//import java.util.Scanner;
//public class selfpt_4_dis_magic {
//    //Disarian number=135,175
//    static void disa(int n) {
//        int rem, t = n, sum = 0, c = 0;
//        int l = ("" + n).length();
////System.out.println(l);
////Disarian number=135,175
//        while (n != 0) {
//            rem = n % 10;
//
//            int mul = 1;
////METHOD 1:
//            for (int i = 1; i <= l; i++) {
//                mul = mul * rem;
//            }
//            sum += mul;
////METHOD 2:
////                    sum=sum+(int)Math.pow(rem,l);
//            l--;
//            n = n / 10;
//        }
//        if (sum == t) {
//            System.out.println("Disarian Number");
//        } else {
//            System.out.println("not");
//        }
//    }
//    static void dis2(int n) {
//        int t = n, rem, rev = 0, r, sum = 0, l = 0;
//        while (t != 0) {
//            rem = t % 10;
//            rev = rev * 10 + rem;
//            t = t / 10;
//        }
//        while (rev > 0) {
//            l++;
//            r = rev % 10;
//            //METHOD 1:
//            int mul=1;
//            for (int i = 1; i <= l; i++) {
//                mul = mul * r;
//            }
//            sum += mul;
////METHOD 2:
////            sum = sum + (int) Math.pow(r, l);
//            rev = rev / 10;
//        }
//        if (sum == n) {
//            System.out.println("Disarian Number");
//        } else {
//            System.out.println("not");
//        }
//    }
//    static void magic(int n)
//    {
////        eg:-199
//        int sum=0;
//                while(n>0 ||sum>9)
//                {
//                    if(n==0){
//                        n=sum;
//                        sum=0;
//                    }
//                    sum=sum+(n%10);
//                    n=n/10;
//                }
//                if(sum==1){
//                    System.out.println("Magic number");
//                }
//                else{
//                    System.out.println("not");
//                }
//    }
//    static void magic2 (int n)
//    {
////        eg:-199
//        int sum=n;
//        while(sum>9) {
//            n=sum;
//            sum=0;
//            while (n != 0) {
//                sum = sum + (n % 10);
//                n = n / 10;
//            }
//        }
//        if(sum==1){
//            System.out.println("Magic number");
//        }
//        else{
//            System.out.println("not");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number:");
//        int n =sc.nextInt();
////        disa(n);
////        dis2(n);
//        magic(n);
//        magic2(n);
////        int l=(""+n).length();
////        System.out.println(l);
//    }
//}
