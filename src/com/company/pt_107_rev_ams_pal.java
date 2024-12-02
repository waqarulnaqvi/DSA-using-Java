//package com.company;
//import java.util.Scanner;
//public class pt_107_rev_ams_pal {
//    static void reverse(int n)
//    {
//        int rem,rev=0,c=0;
//        while (n > 0) {
//                     rem=n%10;
//                     rev=rev*10+rem;
//                     n=n/10;
////                     c++;
////                     if(c==4)
////                         break;
//                  }
//        System.out.println("Reverse of a number is "+rev);
//    }
//    static void pal(int n)
//    {
//        int t=n,rem,rev=0;
//        while(t!=0)
//        {
//            rem=t%10;
//            rev=rev*10+rem;
//            t=t/10;
//        }
//        if (n==rev)
//
//            System.out.println(n+" is a Palindrome number" );
//        else
//            System.out.println(n+" is not a Palindrome number" );
//    }
//    static void amst(int n)
//    {
//        int t=n,l=0,rem,rev=0,mul=1,ams=0;
//        while (t > 0)
//        {
//            t=t/10;
//            l++;
//        }
////        System.out.println("l "+l);
////        System.out.println("t "+t);
//        t=n;
////        System.out.println("t "+t);
//        while(t!=0)
//        {
//            rem=t%10;
////            int mul=1;
//            for(int i=1;i<=l;i++)
//            {
//                mul=mul*rem;
//            }
////            System.out.println("mul "+mul);
//            ams+=mul;
//            mul=1;
//            t=t/10;
//        }
////        System.out.println("Ams "+ams);
//        if (n==ams)
//            System.out.println(n+" is an Amstrong number" );
//        else
//            System.out.println(n+" is not an Amstrong number" );
//    }
//    static void even(int n)
//    {
//        if(n%2==0)
//            System.out.println("EVEN NUMBER");
//        else
//            System.out.println("NOT");
//    }
//    static void ams(int n)
//    {
//        int rem,sum=0,t=n;
//                while(t>0)
//                {
//                    rem=t%10;
////                    m1:
//                    sum=sum+ (int) Math.pow(rem,3);
//                    //                    m2:
////                    sum=sum+rem*rem*rem;
//                    //                    m3:
////                    rem= (int) Math.pow(rem,3);
////                    sum=sum+rem;
//                    t=t/10;
//                }
////        System.out.println(sum);
//        if (sum==n)
//            System.out.println(n+" is an Amstrong number" );
//        else
//            System.out.println(n+" is not an Amstrong number" );
//    }
//    static void largest(int a,int b,int c){
//        int l=a>b?(a>c?a:c):(b>c?b:c);
//        System.out.println(l +" is largest");
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number :");
//        selfpt_3_rev_ams_pal a=new selfpt_3_rev_ams_pal();
//        int n = sc.nextInt();
////        amst(n);
//        ams(n);
////        reverse(n);
////        pal(n);
//        even(n);
//        largest(2,3,n);
//    }
//}
