package com.company;
import java.util.Scanner;
class MyException1 extends Exception{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class votemaxageException extends Exception{
    @Override
    public String toString()
    {
        return "Age can not be less than 18";
    }

    @Override
    public String getMessage() {
        return "make sure your age is legal";
    }
}
public class pt_170_exception_and_used_defined_exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
//        try {
//            System.out.println("100/n = "+100/n);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//            System.out.println("Zero se divide ni ho sakta!!");
//        }

if(n<18)
{
    try {
        throw new votemaxageException();
//        throw new ArithmeticException("This is an Exception!!"); //unreachable statement..
//        throw new MyException1(); //unreachable statement..
//        System.out.println("Hello"); //unreachable statement..
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        System.out.println(e);//toString() wala method run hoga...
        e.printStackTrace();//printStackTrace() help us to find which error occured in which line..
        System.out.println("Finished!!");
    }
}
        System.out.println("Yes Finished");
//if(n<9)
//{
//    try {
//        throw new ArithmeticException("This is an Exception!!");
////        throw new MyException1(); //unreachable statement..
////        System.out.println("Hello"); //unreachable statement..
//    }
//    catch (Exception e)
//    {
//        System.out.println(e.getMessage());
//        System.out.println(e.toString());
//        System.out.println(e);//toString() wala method run hoga...
//        e.printStackTrace();//printStackTrace() help us to find which error occured in which line..
//        System.out.println("Finished!!");
//    }
//    System.out.println("Yes Finished");
//}
    }
}
