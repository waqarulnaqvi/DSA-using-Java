package com.company;
import java.util.Scanner;

    public class pt_144_ds_binary_search{
        public static void binary_search(int k,int ...a) {//varargs..

            System.out.println("Array Elements::");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }

            int found =0;
            int low=0;
            int high=a.length-1;

            while (low<=high)
            {
                int mid=(low+high)/2;
                if(k<a[mid])
                {
                    high=mid-1;
                }
                else if (k>a[mid]) {
                    low=mid+1;
                }
                else if(k==a[mid]){
                    System.out.printf("\n\n%d Element found at index %d\n",k,mid);
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                System.out.println("\n\nElement Not found!");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        int a[] = new int[5];
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < a.length; i++) {
//            System.out.printf("a[%d]=", i);
//            a[i] = sc.nextInt();
//        }

            int b[]={32,4,3,2};
            System.out.println("Enter element which you want to search:");
            int n=sc.nextInt();
            binary_search(n,2,4,6,8,12,34,56,79,89,90,100);//In binary search array element must be sorted..
//        binary_search(n,b);//Run..
//        binary_search(n,b,34);//Error..

        }
    }
