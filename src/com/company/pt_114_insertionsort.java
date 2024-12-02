package com.company;
import java.util.Scanner;
    class pt_114_insertionsort{
//        Method:1
        static void sort(int []a){
            for(int i=1;i<a.length;i++) {
              int t=a[i];
              int j=i-1;
                  while(j>=0&&a[j]>t){
                        a[j+1]=a[j];
                  j--;
                    }
                  a[j+1]=t;
                }
            System.out.println("\nAfter sorting:");
            for (int e:a){
                System.out.print(" "+e);
            }
        }
//        Method:2
        static void sort1(int []a){
            for(int i=1;i<a.length;i++) {
              int t=a[i];
              int k=a[i];
              int j=i-1;
                  while(j>=0&&a[j]>t){
                        t=a[j];
                  j--;
                    }
                  a[j+1]=k;
                }
            System.out.println("\nAfter sorting:");
            for (int e:a){
                System.out.print(" "+e);
            }
        }
        static void sort2(int []a){
            for(int i=1;i<a.length;i++) {
              int t=a[i];
              int j=i-1;
                  while(j>=0&&a[j]>t){
                        t=a[j];
                  j--;
                    }
                  a[j+1]=a[i];
                }
            System.out.println("\nAfter sorting:");
            for (int e:a){
                System.out.print(" "+e);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a element of array:");
            int a [] = {44,33,2,11,4,5};
            System.out.println("Before sorting:");
            for (int k:a) {
                System.out.print(" "+k);
            }
            sort( a);
            sort1(a);
            sort2(a);
        }
    }

