package com.company;
import java.util.*;
/*Exceptions in Java:-An Exception is an event that occurs when a program is executed disrupting the normal flow of instructions.
There are mainly 2 Types of exceptions in Java:
1)Checked Exceptions ->* A checked Exception is a type of exception that must be either caught or declared in the method in which it is thrown. for example , the java.io.IOException is a checked exception..
* Compile time Exceptions(Handled by Compiler).(compiler interest leta hai isko theek karne me like (join and delay function in thread that will thrown exception so compiler recommend use it under try catch etc)IDEA show red line under that and while compiling compiler show alert message if try catch will not use by the programmer..
2)Unchecked Exceptions ->Runtime Exceptions.(compiler ni interest leta hai isko theek karne me like array out of bound or (divided by 0)Arithmetic Exception etc)..
 */

public class pt_63_cwh_80_try_Catch_block {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int a=sc.nextInt();
        System.out.println("Enter a number 2:");
        int b=sc.nextInt();
//        System.out.println("division of a and b is "+a/b);
//      System.out.println("Add of a and b is "+a+b);it concatinate value of a and b..
try {
    System.out.println("division of a and b is "+a/b);
}
catch (Exception e)
 //  here Exception is a object and here exception object name is e and which can be changed to any valid variable name..
//  Exception is a class in java..
{
    System.out.println("We failed to divide. Reason: ");
    System.out.println(e);
}
        System.out.println("End of the program..");
    }
}
