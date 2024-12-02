package com.company;

import java.util.Scanner;
//throws means aapka program yeah specific exception ko throw kar sakta hai throw means aapka program yeah specific exception ko throw karega..
//Custom Exception class..
//The Throw keyword is used to throw an exception explicitly by the programmer..
//throws is Warning/information that the exception this type of exception might occur throw is a printing the Exception custom & built_in etc..
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative!";
    }
}
public class pt_67_cwh_84_throw_vs_throws {
    //throws means aapka program yeah specific exception ko throw kar sakta hai throw means aapka program yeah specific exception ko throw karega..
    //The Throw keyword is used to throw an exception explicitly by the programmer..
    //throws is Warning/information that the exception this type of exception might occur throw is a printing the Exception custom & built_in etc..
    public static double area(float r) throws NegativeRadiusException
    {
        if(r<0)
        {
            throw new NegativeRadiusException();
        }
        double result= Math.PI *r *r;
        return result;
    }
//    public static int divide(int a,int b) throws NegativeRadiusException,ArithmeticException{//Run..
    public static int divide(int a,int b) throws ArithmeticException{
//    public static int divide(int a,int b) throws ArithmeticException("Divided by 0"){//not valid code Error:
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
//        int c=divide(6,0);
//        System.out.println(c);
        Scanner sc =new Scanner(System.in);

        try {
     int c=divide(6,0);
     System.out.println(c);
 }
 catch (Exception e)
 {
     System.out.println("Divided by 0 Exception");
 }

// float f1=sc.nextInt();//Run..
// float f1=sc.nextDouble();//Error..
        System.out.println("Enter a radius:");
 float f1=sc.nextFloat();
 try {
     System.out.println("Area of circle : "+area(f1));
 }
catch (Exception e)
{
//    System.out.println(e.toString());
    System.out.println(e.getMessage());
//    System.out.println(e);
}
    }
}
