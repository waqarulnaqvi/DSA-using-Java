package com.company;

import java.util.Scanner;
public class pt_140_ds_bubble_sort {
    public static void bubble_asc(int []a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
            System.out.println("\nSorted Array in ascending order:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    public static void bubble_dsc(int []a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
            System.out.println("\nSorted Array in descending order:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = sc.nextInt();
        }
       bubble_asc(a);
        bubble_dsc(a);
    }
}
