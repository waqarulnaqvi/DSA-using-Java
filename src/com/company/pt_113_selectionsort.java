//package com.company;
//import java.util.Scanner;
//class selfpt_8_selectionsort {
//    static void sort(int []arr){
//        int min;
//        for(int i=0;i<arr.length-1;i++) {
//            min = i;
//            for (int j = i + 1; j < arr.length ; j++) {
//                if (arr[min] > arr[j]) {
//                    min = j;
//                }
//            }
//                int t=arr[i];
//                arr[i]=arr[min];
//                arr[min]=t;
//        }
//        System.out.println("\nAfter sorting:");
//        for (int e:arr){
//            System.out.print(" "+e);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a element of array:");
//        int a [] = {44,33,2,1,4,5};
//        System.out.println("Before sorting:");
//        for (int k:a) {
//            System.out.print(" "+k);
//        }
//        sort(a);
//    }
//}
//
//
