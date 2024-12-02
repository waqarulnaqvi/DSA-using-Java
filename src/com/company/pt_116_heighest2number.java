//METHOD:1
// package com.company;
//import java.util.Scanner;
//    class selfpt_11_heighest2number {
//        static void sort(int[] arr) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                for (int j = 0; j < arr.length - 1 - i; j++) {
//                    if (arr[j] > arr[j + 1]) {
//                        arr[j] = arr[j] + arr[j + 1];
//                        arr[j + 1] = arr[j] - arr[j + 1];
//                        arr[j] = arr[j] - arr[j + 1];
//                    }
//                }
//            }
//            System.out.println("\nAfter sorting:");
//            for (int e : arr) {
//                System.out.print(" " + e);
//            }
//            System.out.printf("\nhighest  first element  is : %d and its index = a[%d] \n highest  second element  is : %d and its index = a[%d]", arr[arr.length - 1], arr.length - 1, arr[arr.length - 2], arr.length - 2);
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a element of array:");
//            int[] a = new int[5];
//            for (int e = 0; e < a.length; e++) {
//                System.out.print(" Enter element " + e + ":");
//                a[e] = sc.nextInt();
//            }
//            System.out.println("Before sorting:");
//            for (int k : a) {
//                System.out.print(" " + k);
//            }
//            sort(a);
//        }
//
//    }
//METHOD:2
   package com.company;
 class pt_116_heighest2number {
     static void sort(int ...arr) {
         System.out.println("Array element is :");
         int max = Integer.MIN_VALUE;
         int smax = Integer.MIN_VALUE, mi = 0, smi = 0;
         for (int e : arr) {
             System.out.print(" " + e);
         }
//         METHOD:1
//         for(int i=0;i<arr.length;i++)
//         {
//         for (int e = 0; e < arr.length; e++) {
//             if (max < arr[e]) {
//                 max = arr[e];
//                 mi = e;
//             }
//         }
//         if(max >arr[i]&&smax<arr[i])
//         {
//             smax = arr[i];
//            smi = i;
//        }
//         METHOD:2
         for (int i = 0; i < arr.length; i++) {
             for (int e = 0; e < arr.length; e++) {
                 if (max < arr[e]) {
                     max = arr[e];
                     mi = e;
                 }
                 if (max > arr[e] && smax < arr[e]) {
                     smax = arr[e];
                     smi = e;
                 }
             }
         }
/*         IGNORE THE BELOW CODE..
             for (int e = 0; e < arr.length; e++) {
                 if (max < arr[e]) {
                     max = arr[e];
                     mi = e;
                 }
                 if (max > arr[e] || smax < arr[e]) {
                     smax = arr[e];
                     smi = e;
                 }
             }
//         System.out.printf("\nhighest  first element  is : %d and its index = a[%d] \n highest  second element  is : %d and its index = a[%d]", max, mi, smax, smi);
//     }
 */
         System.out.printf("\nhighest  first element  is : %d and its index = a[%d] \n highest  second element  is : %d and its index = a[%d]", max, mi, smax, smi);
     }
     public static void main(String[] args) {
         sort(56,33,222,1,2,45,7);
     }
 }