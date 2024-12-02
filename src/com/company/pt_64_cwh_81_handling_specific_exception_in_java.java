package com.company;

import java.io.IOException;
import java.util.Scanner;

public class pt_64_cwh_81_handling_specific_exception_in_java {
    public static void main(String[] args) {
        int a[]=new int[3];
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
        try {
            System.out.println("The value at array index entered is :"+a[n]);
            System.out.println("The value of array value/number is "+a[n]/number);
        }

//        catch(Exception e)//Error: ArrayIndexOutOfBoundsException, ArithmeticException and IOException has already been caught..
//        {
//            System.out.println("Some other Exception occured! and the exception is:");
//            System.out.println(e);
//        }
//         catch (ArithmeticException e) {
//            System.out.println("ArithmeticException! and the exception is:");
//            System.out.println(e);
//        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException! and the exception is:");
            System.out.println(e);
        }
//        catch(IOException e){//Error: java.io.IOException is never thrown in body of corresponding try statement..
//            // it contained in import java.io.IOException;(package)..
//            System.out.println(e);
//        }
        catch(Exception e)
        {
            System.out.println("Some other Exception occured! and the exception is:");
            System.out.println(e);
        }
    }
}
