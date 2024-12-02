package com.company;

import java.util.Scanner;

public class pt_65_cwh_82_nested_try_catch_quick_quiz_6 {
    public static void main(String[] args) {

 /*       int a[]=new int[3];
        a[0]=34;
        a[1]=3;
        a[2]=343;
//        a[3]=33;//Error Index 3 out of bounds for length 3..
//        a[4]=53;//Error Index 3 out of bounds for length 3..
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the array:");
        int n =sc.nextInt();
        System.out.println("Enter the number you want to divide the value with:");
        int number =sc.nextInt();
        //Nested try catch:
        //In most of the cases you don't go above 2 level try catch same as you don't go above 2D matrix in most of the cases..
        try {
            try {
                System.out.println("The value at array index entered is :"+a[n]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException! level 2 exception is:");
                System.out.println(e);
            }
             System.out.println("The value of 1500/number is " +150/number );
        }
//        catch (ArithmeticException e) {
//            System.out.println("ArithmeticException! and the exception is:");
//            System.out.println(e);
//        }
        catch(Exception e)
        {
            System.out.println("Some other Exception occured! level 1 exception is:");
            System.out.println(e);
        }
          System.out.println("Thanks for using this program :)..");*/

/*   quick_quiz_6:(my logic)
   WAP that allows you to keep accessing an array until a valid index is given by the user..
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        a[0]=34;
        a[1]=3;
        a[2]=343;
        while (true)
        {
            System.out.println("Enter the index of the array:");
            int n =sc.nextInt();
            try {
                System.out.println("The value at array index entered is :"+a[n]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exists!");
//                System.out.println("ArrayIndexOutOfBoundsException! level 2 exception is:");
//                System.out.println(e);
            }
        }
         System.out.println("Thanks for using this program :)..");*/

/*   quick_quiz_6:(cwh logic)
   WAP that allows you to keep accessing an array until a valid index is given by the user..*/
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        a[0] = 34;
        a[1] = 3;
        a[2] = 343;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the index of the array:");
            int n = sc.nextInt();
            System.out.println("Enter the number you want to divide the value with:");
            int number = sc.nextInt();
            //Nested try catch:
            //In most of the cases you don't go above 2 level try catch same as you don't go above 2D matrix in most of the cases..
            try {
                try {
                    System.out.println("The value at array index entered is :" + a[n]);
                    flag=false;//run: it will print the next condition than exit the loop if the condition is true..
//                    break;//run: it won't print the next condition and exit the loop immediately if the condition is true..
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exists!\nlevel 2 Exception..");
//                    System.out.println("ArrayIndexOutOfBoundsException! level 2 exception is:");
//                    System.out.println(e);
                }
                System.out.println("The value of 1500/number is " +1500/number );
            } catch (Exception e) {
                System.out.println("Some other Exception occured! level 1 exception is:");
                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program :)..");
    }
}
