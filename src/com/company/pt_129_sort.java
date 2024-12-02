package com.company;
import java.util.Scanner;
public class pt_129_sort {
   static void Bubble(int ...arr)
    {
        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    static void Selection(int ...arr)
    {
        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
           int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
                int t=arr[min];
                arr[min]=arr[i];
                arr[i]=t;
            }
        }
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    static void Inserton(int ...arr)
    {
        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        for (int i = 1; i <arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Bubble(2,3,45,3,2,23,1,35,23);
//        Inserton(33,4,2,2,2,3,45,3,32,1,0);
        Selection(33,23,2,11,2,-11,-8,3,3,4,0);
    }
}
