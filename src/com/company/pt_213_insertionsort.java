//package com.company;
//import java.util.Scanner;
//public class labpt_14_insertionsort {
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter an Elements of an array:");
//        int []a=new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("a[%d]=",i);
//            a[i]= sc.nextInt();
//        }
//        System.out.println("Original array:");
//        for (int ele:a) {
//            System.out.print(ele+" ");
//        }
//       for (int i=1;i<5;i++) {
//           int key = a[i];
//           int j = i - 1;
//           while (j >= 0 && a[j] > key) {
//               a[j + 1] = a[j];
//               j = j - 1;
//           }
//           a[j + 1] = key;
//       }
//        System.out.println("\nAfter Sorting");
//        for (int ele:a) {
//            System.out.print(ele+" ");
//        }
//        }
//       }
