package com.company;

import java.util.Scanner;
        import java.lang.Math;
public class pt_102_someone_else_logic {

    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int j = 0; j < n ;j++){
            i+=j;
            sum += i;
            System.out.print( i+" ");
        }
        System.out.println("\nsummation : " + sum );
/*
    // 1 + 11 + 111 + 1111 + .....
    long i = 0;
    long sum = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
for(int j = 0; j < n; j++){
        i += Math.pow(10, j);
        System.out.print(i+" ");
        sum += i;
        }
        System.out.println("\nsummation :" + sum);

// x + x^2 + x^3 + .....
        double i = 0;
        int j = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for n : ");
        int n = sc.nextInt();
        System.out.print("enter a value for x: ");
        int x = sc.nextInt();
        for(j = 1; j < n; j++){
        i = Math.pow(x, j);
        System.out.print(i+" ");
        sum += i;
        }
        System.out.println("\nsummation :" + sum);

// x + x^2 - x^3 + x^4 - x^5 + ......
        double i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for n : ");
        int n = sc.nextInt();
        System.out.println("enter a value for x: ");
        int x = sc.nextInt();
        double sum = 0;
        for (int j = 1; j < n; j++) {
            i = Math.pow(x, j);
            if (j % 2 == 0 || j == 1) {
                sum += i;
                System.out.print(i + " ");
            } else {
                sum -= i;
                System.out.print(-i + " ");
            }
        }
            System.out.println("\nsummation :" + sum);

// 1/x - 1/x^2 + 1/x^3 - 1/x^4 +.....
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for n : ");
        int n = sc.nextInt();
        System.out.print("enter a value for x: ");
        int x = sc.nextInt();
        for(int j = 1; j < n; j++) {
          double i = 1 / Math.pow(x, j);
            if (j % 2 == 0) {
                sum -= i;
                System.out.print(-i+" ");
            } else {
                sum += i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nsummation :" + sum);
 */
        }
    }