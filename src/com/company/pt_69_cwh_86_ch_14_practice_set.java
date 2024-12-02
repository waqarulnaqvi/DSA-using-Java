package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxretriesreachedException extends InputMultiplicationLessthan7000Exception//Run: Extend another class/(custom Exception class) in same package..
//class MaxretriesreachedException extends Exception
{
    @Override
    public String toString() {
//        super.toString();//do nothing..
        return "MaxretriesreachedException..\n";
    }
    @Override
    public String getMessage() {
//        super.getMessage();//do nothing..
        return "MaxretriesreachedException..\n";
    }
}
public class pt_69_cwh_86_ch_14_practice_set {
    //Question 4:
    public static void guess_the_valid_array_index() throws MaxretriesreachedException {
//    public static void guess_the_valid_array_index()  {//Error: unreported exception must be thrown
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int i = 0;
        while (i < 5) {
            try {
                Scanner sc=new Scanner(System.in );
                System.out.println("Enter the value of index");
                int index =sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
               //break;//break statement only exit from the while loop not the function Exception still occur..
                return;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }

        throw new MaxretriesreachedException();
        //1) Without thrown function won't run. if you use (try catch or not in the main program) you must use thrown because of this exception..
        //2) if you try catch here than without thrown it will run..
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

  //Question 1:WAP to demonstrate syntax,logical & runtime errors..
//    Syntax Error:
//    int a=3
//     Logical Error:(print odd number instead of prime number)..
//        System.out.println("Enter n number ");
//        int n =sc.nextInt();
//        System.out.println("Prime number till n number is :");
//        int k=0;
//        System.out.print("2\t");
//        for (int i = 1; i <=n ; i++) {
//            k=2*i+1;
//            System.out.print(k+"\t");
//        }
//     Runtime Error:
//Runtime error is happening due to Exception like wrong input,divided by 0 etc etc it can be cured with the help of Exception handling ..
        //Example :ArithmeticException divided by 0(Exception in thread "main" java.lang.ArithmeticException: / by zero)..
//         System.out.println("Enter a number ");
//         int a =sc.nextInt();
//        System.out.printf("5000/%d = %d\n",a,5000/a);

        //Question 2:
//        //IllegalArgumentException &, InputMismatchException:
//
//            System.out.println("Enter a number:");
//            int b1= sc.nextInt();
//            if(b1==0)
//            {
//                System.out.println("Hava a worst day");
//            }
//            else {
//                try{
//                    throw new IllegalArgumentException();//you can throw illegal argument exception wherever you want that input is not correct according to your requirement/needs..
//            }
//                catch (IllegalArgumentException e)
//                {
//                    System.out.println("hehe");
//                }
//        }
//
//        //InputMismatchException:
//        try{
//            System.out.println("Enter a number:");
//            int b= sc.nextInt();
//            if(b==0)
//            {
//                System.out.println("Hava a bad day");
//            }
//            else {
//                System.out.println("good bye forever");
//            }
//        }
//        catch (InputMismatchException e)
//        {
//            System.out.println(e);
//        }
//
//        //NullPointerException:
//       try{
//            String ch=null;
//            if(ch.equals("Hii"))
//            {
//                System.out.println("Hava a good day");
//            }
//            else {
//                System.out.println("good bye");
//            }
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println(e);
//        }
//
//       //ArithmeticException:
//         System.out.println("Enter a number:");
//         int a =sc.nextInt();
//         try {
//             System.out.printf("5000/%d = %d\n", a, 5000 / a);
//         }
//         catch (ArithmeticException e)
//         {
//             System.out.println("haha");
//         }

        //Question 3:(My solution)
//        int a[] = new int[3];
//        a[0] = 34;
//        a[1] = 3;
//        a[2] = 343;
//        boolean flag = true;
//        while (flag) {
//            System.out.println("Enter the index of the array:");
//            int n = sc.nextInt();
//            System.out.println("Enter the number you want to divide the value with:");
//            int number = sc.nextInt();
//            //Nested try catch:
//            //In most of the cases you don't go above 2 level try catch same as you don't go above 2D matrix in most of the cases..
//            try {
//                try {
//                    System.out.println("The value at array index entered is :" + a[n]);
//                    flag=false;//run: it will print the next condition than exit the loop if the condition is true..
////                    break;//run: it won't print the next condition and exit the loop immediately if the condition is true..
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Sorry this index does not exists!\nlevel 2 Exception..");
//                }
//                System.out.println("The value of 1500/number is " +1500/number );
//            } catch (Exception e) {
//                System.out.println("Some other Exception occured! level 1 exception is:");
//                System.out.println(e);
//            }
//        }
//        System.out.println("Thanks for using this program :)..");

        //Question 3:(cwh solution)
//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        int index;
//        int i = 0;
//        while(flag && i<5){
//            try {
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
////       if(i==5){//Run..
//        if(i>=5){//Run..
//            System.out.println("Error");
//        }

        //Question 4:
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        int index;
//        int i = 0;
//        while( i<5){
//            try {
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
// //     if(i>=5){//Run..
//        if(i==5){//Run..
//            try
//            {
//                throw new MaxretriesreachedException();
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
//        }

        //Question 5:
            try
            {
            guess_the_valid_array_index();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
//        finally {//u can not use (try with finally) here because you thrown the exception you have to use catch block..
//                System.out.println("run");
//            }

        }
    }


