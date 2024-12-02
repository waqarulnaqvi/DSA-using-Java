//package com.company;
//
//import java.util.Scanner;
//
//public class labpt_9addwithoutadditionoperator {
//    static int  add(int x,int y){
//      while(y!=0){
//          int carry=x&y;
//          x=x^y;
//          y=carry<<1;
//      }
//      return x;
//    }
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
////     Left shift bitwise operator :-it needs two operands ,it shift each bit from right to left..
////        System.out.println(8<<1);Left shift bitwise operator.
////        System.out.println(8>>1);right shift bitwise operator.
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//        System.out.println("Sum is"+add(a,b));
//    }
//}
