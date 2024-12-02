//package com.company;
//import java.util.Scanner;
//class selfpt_7_Bubblesort {
//    static void sort(int []arr){
//        for(int i=0;i<arr.length-1;i++) {
//        for(int j=0;j<arr.length-1-i;j++) {
//            if (arr[j] > arr[j + 1]) {
////              2 variable swapping..
//                arr[j] = arr[j] + arr[j + 1];
//                arr[j + 1] = arr[j] - arr[j + 1];
//                arr[j] = arr[j] - arr[j + 1];
////                3 variable swapping..
////                int t=arr[i];
////                arr[i]=arr[i+1];
////                arr[i+1]=t;
//            }
//        }
//        }
//        System.out.println("\nAfter sorting:");
//        for (int e:arr){
//            System.out.print(" "+e);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a element of array:");
//        int[] a = new int[5];
//        for (int e=0;e<a.length;e++)
//        {
//            System.out.print(" Enter element "+e+":");
//            a[e]=sc.nextInt();
//        }
//        System.out.println("Before sorting:");
//        for (int k:a) {
//            System.out.print(" "+k);
//        }
//        sort(a);
//    }
//}
//
//
