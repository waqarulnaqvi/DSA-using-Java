
package com.company;
 import java.util.Scanner;

public class pt_143_ds_linear_search {
    public static void linear_search(int k,int ...a) {//varargs..

        System.out.println("Array Elements::");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int found =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k)
            {
                System.out.printf("\n\n%d Element found at index %d\n",k,i);
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
 linear_search(n,12,40,3,23,232,2,8,890,12);
//        linear_search(n,b);//Run..
//        linear_search(n,b,34);//Error..

    }
}
