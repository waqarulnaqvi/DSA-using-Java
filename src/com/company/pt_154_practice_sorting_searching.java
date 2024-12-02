package com.company;
import java.util.*;
public class pt_154_practice_sorting_searching {
    public static void Select_sort(int []a)
    {
        for (int i = 0; i <a.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
             int t=a[i];
             a[i]=a[min];
             a[min]=t;
            }
        System.out.println("\n\nSorted Array using Selection sort:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void Insertion_sort(int []a)
    {
        for (int i = 1; i <a.length ; i++) {
        int key=a[i];
        int j=i-1;
        while(j>=0 && key<a[j])
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
        }
        System.out.println("\n\nSorted Array using Insertion sort:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void linear(int ele,int []a) {
        int found = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                System.out.printf("%d found at index %d\n", ele, i);
                found = 1;
                break;
            }
        }
        if (found!=1) {
            System.out.println("Element not found!");
        }
    }
    public static void binary(int ele,int []a) {
        int low = 0, found = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ele > a[mid]) {
                low = mid + 1;
            } else if (ele < a[mid]) {
                high = mid - 1;
            } else if (ele == a[mid]) {
                System.out.printf("%d found at index %d\n", ele, mid);
                found = 1;
                break;
            }
        }
        if (found!=1) {
            System.out.println("Element not found!");
        }
    }
    public static void linear_practice(int ele,int []a) {
        int found = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                if(found==0) {
                    System.out.printf("%d found at index %d", ele, i);
                    found = 1;
                    continue;
                }
                System.out.printf(" and %d",i);
            }
        }
        if (found!=1) {
            System.out.println("Element not found!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int []a={1,12,23,33,44,6,1,1,4,3,2,44};
//        int []a={};
        System.out.println("Original Array:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
//        Select_sort(a);
        Insertion_sort(a);

        System.out.println("\n\nOriginal Array:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println("\n\nEnter element you want to search:");
        int e=sc.nextInt();
        binary(e,a);
//        linear_practice(e,a);
//        linear(e,a);
        }
    }