package com.company;

public class pt_168_sum_of_array_index {
    static int[] running_Sum(int []a)
    {

        int num[]={1,2,3,4};
        /*method:1
          int sum=1;
        a[0]=num[0];
        for (int i = 1; i <num.length ; i++) {
            sum+=num[i];
            a[i]=sum;
        }
        */
        /*method:2*/
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
            a[i]=sum;
        }
        return  a;
    }
    public static void main(String[] args) {
        int x[]=running_Sum(new int[4]);
//        int a[]={4,45,55,5};
//        System.out.println(a);
//        System.out.println(x);
        for (int i = 0; i <x.length ; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
