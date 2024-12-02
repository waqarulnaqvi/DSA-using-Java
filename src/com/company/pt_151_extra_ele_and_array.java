package com.company;

import java.util.Scanner;

public class pt_151_extra_ele_and_array {
    public static void begin_add(int n,int a[])
    {
      int b[]=new int[a.length+1];
      b[0]=n;
        for (int i = 0; i <a.length ; i++) {
            b[i+1]=a[i];
        }
        System.out.println("Array Elements:");
        for (int i:b) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void middle_add(int n,int a[])
    {
        int b[]=new int[a.length+1];
        int k=a.length/2;
        for (int i = 0; i <a.length ; i++) {
            if(k==i)
            {
                b[i]=n;
            }
            else if(k<i)
            {
                b[i]=a[i];
            }
            else {
                b[i+1]=a[i];
            }
        }
        System.out.println("Array Elements:");
        for (int i:b) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void last_add(int n,int a[])
    {
        int b[]=new int[a.length+1];
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i];
        }
        b[a.length]=n;
        System.out.println("Array Elements:");
        for (int i:b) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void any_index_add(Scanner sc,int n,int a[]){
      System.out.println("Enter index where you want to add array element:");
      int kk=sc.nextInt();
      int b[]=new int[a.length+1];
        for (int i = 0; i <kk ; i++) {
            b[i]=a[i];
        }
        a[kk-1]=n;
        for(int i=kk;i<b.length;i++)
        {
            b[i]=a[i-1];
        }
        System.out.println("Array Elements:");
        for (int i:b) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void start_middle_end_any_index(Scanner sc,int n,int []a)
    {
//        Begining:
        System.out.println("Array Elements:");
        for (int i = 0; i <a.length ; i++) {
           if(i==0){
            System.out.print(n);
        }
            System.out.print(" "+a[i]);
        }
        System.out.println();

//     Middle:
        int k=a.length/2;
        System.out.println("Array Elements:");
        for (int i = 0; i <a.length ; i++) {
            if(i==k){
                System.out.print(" "+n);
            }
            System.out.print(" "+a[i]);
        }
        System.out.println();

//Last:
        System.out.println("Array Elements:");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(" "+a[i]);
            if(i==a.length-1){
                System.out.print(" "+n);
            }
        }
        System.out.println();

//      Any Index:
        System.out.println("Enter index where you want to add array element:");
        int kk=sc.nextInt();
        System.out.println("Array Elements:");
        for (int i = 0; i <a.length ; i++) {
            if(i==kk){
                System.out.print(" "+n);
            }
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={34,4,33,3,6,7,5,8};
        System.out.println("Array Elements:");
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println("\nEnter array element you want to add:");
        int n=sc.nextInt();
/*Using 2 Array:
//        Begining:
        begin_add(n,a);

//        Middle:
        middle_add(n,a);

//        last:
        last_add(n,a);

//        Any Index:
        any_index_add(sc,n,a);
*/

/*Without Using 2 Array:*/
        start_middle_end_any_index(sc,n,a);
    }
}
