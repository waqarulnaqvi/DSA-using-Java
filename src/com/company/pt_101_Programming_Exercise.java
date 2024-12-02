package com.company;

import java.util.Scanner;

public class pt_101_Programming_Exercise {
    public static void print_prime(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (j == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void reverse_a_number(int n)
    {
        int rem,rev=0;
        int k=0;
        int t=n;
        while(t>0)
        {
            k++;
            t=t/10;
        }
        while(n>0)
        {
           rem=n%10;
           rev+=rem*Math.pow(10,k-1);
           n=n/10;
           k--;
        }
        System.out.println("Reversed number is:"+rev);
    }
    public static void digit_occured(int n,int digit)
    {
        int rem,count=0;
        while(n>0)
        {
            rem=n%10;
            if(rem==digit)
            {
                count++;
            }
            n=n/10;
        }
        if(count>0)
        {
            System.out.println("Unit Digit Number is in the Number");
            System.out.println("It occured: "+count+" times");
        }
        else {
            System.out.println("Unit Digit Number is not in the Number");
        }
    }
    public static void sum_of_series_pt_1(int n)
    {
        int k=1;
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            System.out.print(k+"\t");
            sum=sum+k;
            k=k+i;
            if(k>n)
            {
                break;
            }
        }
        System.out.println("\nSum of series is: "+sum+"\n");
    }
    public static void sum_of_series_pt_2(int n)
    {

        long k=10,series=11,sum=0;
        for (int i = 0; i <n; i++) {
            System.out.print(series+"\t");
            sum+=series;
            k=k*10;
            series+=k;
        }
        System.out.println("\nSum of series is: "+sum+"\n");
    }
    public static void sum_of_series_pt_3(int n)
    {

        long k=10,sum=0;
        for (int i = 0; i <n; i++) {
            System.out.print(k+"\t");
            sum+=k;
            k=k*10;

        }
        System.out.println("\nSum of series is: "+sum+"\n");
    }
    public static void sum_of_series_pt_4(int n)
    {

        long k=10,sum=0;
        for (int i = 1; i <=n; i++) {
            if(i%2==0||i==1) {
                System.out.print(k + "\t");
                sum+=k;
            }
            else {
                System.out.print(-k + "\t");
                sum+=-k;
            }
            k=k*10;
        }
        System.out.println("\nSum of series is: "+sum+"\n");
    }

    public static void sum_of_series_pt_5(int n)
    {

        double k=10,sum=0;
        for (int i = 1; i <=n; i++) {
            if(i%2==0) {
                System.out.print(1/-k + "\t");
                sum+=1/-k;
            }
            else {
                System.out.print(1/k + "\t");
                sum+=1/k;
            }
            k=k*10;
        }
        System.out.println("\nSum of series is: "+sum+"\n");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*Problem:1
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        print_prime(n);
       */

       /*Problem:2
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        reverse_a_number(n);
        */

      /*Problem:3
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a unit digit number:");
        int digit=sc.nextInt();
        if(digit>9)
        {
            System.out.println("Please Enter a unit digit number..");
           return;
        }
        digit_occured(n,digit);
       */

        /* Problem:11*/
        System.out.println("Enter n number:");
        int n=sc.nextInt();
//        pattern:1
        sum_of_series_pt_1(n);

//        pattern:2
        sum_of_series_pt_2(n);

//        pattern:3
        sum_of_series_pt_3(n);

//        pattern:4
        sum_of_series_pt_4(n);

//        pattern:5
        sum_of_series_pt_5(n);

    }
}
