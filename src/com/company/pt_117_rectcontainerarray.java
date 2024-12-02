//package com.company;
//import java.util.Scanner;
//class  selfpt_12_rectcontainerarray {
//        static void sort(int ...arr) {
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Array element  :");
//            for (int e : arr) {
//                System.out.print("      " + e);
//            }
//            System.out.print("\nArray index    :");
//            for(int i=0;i< arr.length;i++) {
//                System.out.print("   ind="+ i);
//            }
//            System.out.println("\nIn between which container(index) do you want to store water:");
//            int index1 =sc.nextInt();
//            System.out.println("AND");
//            int indexlast=sc.nextInt();
//            if (index1> indexlast){
//                int t=index1;
//                index1=indexlast;
//                indexlast=t;
//            }
//               if(arr[index1]<arr[indexlast]){
//                   int area=arr[index1]*(indexlast-index1);
//                   System.out.printf("Water store in container between %d breadth and %d height = %d.0pounds",(indexlast-index1),arr[index1],area);
//                }
//               else {
//                   int area=arr[indexlast]*(indexlast-index1);
//                   System.out.printf("Water store in container between %d breadth and %d height = %d.0pounds",(indexlast-index1),arr[indexlast],area);
//               }
//        }
//        public static void main(String[] args) {
//            sort(56,33,222,1,2,45,7);
//        }
//    }
//
