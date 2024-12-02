package com.company;
import java.util.Scanner;

public class pt_142_ds_insertion_sort {
    public static void insertion_asc(int []a) {

        for (int i = 1; i <a.length ; i++) {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key ;
        }
        System.out.println("\nSorted Array in ascending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void insertion_dsc(int []a) {
        for (int i = 1; i <a.length ; i++) {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]<key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key ;
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
      insertion_asc(a);
      insertion_dsc(a);
    }
}
