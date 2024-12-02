package com.company;
 import java.util.Scanner;
 public class  pt_141_ds_selection_sort {
    public static void selection_asc(float []a) {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            float t=a[min];
            a[min]=a[i];
            a[i]=t;

            }
        System.out.println("\nSorted Array in ascending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void selection_dsc(float []a) {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j] > a[min]) {
                    min = j;
                }
            }
            float t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.println("\nSorted Array in descending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[5];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = sc.nextFloat();
        }
        selection_asc(a);
        selection_dsc(a);
    }
}
