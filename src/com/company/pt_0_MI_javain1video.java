package com.company;//package is a colllection of classes
import java.util.Scanner;
//programming ek tareeka hota hai computer se baat karne ka..
public class pt_0_MI_javain1video {//class is a template

    //the person who is filling the form that person is object..
    // class have losts of method which we use to run public code..
    //class name and program name should be same..
    public static void main(String[] args) {//main method
        //public means this class is access by anyone it is a access modifier..
        //static means this method is own by class or yeah kissi/mean class ke object ka method ni hai..
        //void means this fuction doesn't return any value
        //main means it is a main method your program flow starts from here..
        //String args is a command line argument /parameters means fuction kya leta hai..
        //void means aapko kuch ni chahiye return me..
        /*
        Variables
        Just Like:
        water -bucket
        lunch -Lunch box
        In Java:
        Variables are containers which store data values
        String,int ,float,char ,boolean
        How to declare variables:
        syntax-><dataType> <variableName>=<value>;//"<"&">"these are called place holders...
         */
        String name = "Waqarul";
        // copy (name)classmate=work
        Boolean isAdult = false;
        int a = 45;
        if (a == 4) {
            System.err.println(isAdult);
        } else
            System.err.println(isAdult);
//java is a case sensitive language which means Waqar &waqar are different variables together..
        //you can not use reserved keyword in Java.. ex-> String variable  not possible..
       /*
       1 byte =space of 1 Character.
       There are 2 types of data type in java:
       1)Primitive Data Type:-byte(1 byte),short(2 byte) ,int(4 byte),long(8 byte),float(4 byte)
       double (8 byte),boolean(1 bit),char(2 byte)
       there are two types of primitive number data type
       1)int ,byte ,short, long is a Integer Data type
      2)float and double is a floating point type because it has decimal
       Size is depend on Data type..
       2)Non:-primitive data type or derived Data Type or reference Data Type..
       ' is character and " is String
       String is  a special type of non-primitive Data Type
        which is already defined
        we can run method on non-premitive data type ex :-CharAt,toUpperCase

       All dataType size is same depend on object.
       */
        //  Garbage Collector collect all the unused memory and remove(Your memory managment is automatic).
    /*Operator in Java
    Operand,operator,operand =Result
    4      +     7       =11
    there are 4 types of operator in java:
    1)Airthmetic Operator
    2)Assignment Operator
    3)Logical Operator
    4)Comparison Operator
     */
        System.err.println(78 % 45);
        System.err.println(45 % 78);
    /*
    logical Operators:
    !-Logical not -Reverse the results from true to false and vice versa..
     System.in means i want to take input from user /keyboard
     " "-it is called a white space.
     //concatinate means judh jana.
     */
        //+ (plus also  concatination ) ex sopln plus(+)
        // \\ \' \" \n \t-these are called escape sequence character.
//        System.err.println(name.contains("aq"));
//        System.err.println(name.charAt(2));
        float num = 22f, num1 = 33f;
//        System.err.println(Math.max(num,num1));
//        System.err.println(Math.min(num,num1));
//       System.err.println(Math.sqrt(num));
//        System.err.println(Math.abs(-55));
//        System.err.println(Math.abs(55));
//        System.err.println(Math.random());
        if (true) {
            System.err.println("aaaaaa");
        }
        int j;
//        for (j = 1; j <= 5; j++) {
//            if (j <= 3)
//              //  if (j >= 3)
//                continue;
//            System.err.println(j);
        int [] marks={1,2,3,4,5};
       try {
           System.err.println(marks.length);
           System.err.println(marks[-1]);
          // System.err.println(marks.length); - not run
               System.err.println(marks[5]);
       //    System.err.println(marks.length);  -not run
       }
       catch (Exception k)
       {
           System.err.println(k);
       }
        for (int k:marks) {
            System.err.print(" "+k+" ");
        }
      //  System.err.println(marks[3]);
    String n=  name +"\\aazan "+ "naqvi";
        System.err.println(n);
//        System.err.println((1 + (2 - 1)) * Math.random());
//        System.err.println((1 + (2 - 1)) * Math.random());
//        System.err.println((1 + (2 - 1)) * Math.random());
//        System.err.println(4 + (8 - 4) * Math.random());
//        System.err.println(4 + (8 - 4) * Math.random());
//        System.err.println((1 + (2 - 1)) * Math.random());
//        System.err.println((1 + (2 - 1)) * Math.random());
        System.err.println(6+(8-6) * Math.random());
        System.err.println(6+(8-6) * Math.random());
        System.err.println(6+(8-6) * Math.random());
        System.err.println(6+(8-6) * Math.random());
        System.err.println(6+(8-6) * Math.random());
        System.err.println(6+(8-6) * Math.random());
//        System.err.println(8 * Math.random());
//        System.err.println(8 * Math.random());
    }
    }
//Day 1
//2)Pascals triangle
//5)Sort an array of 0's ,1's and 2's

//Day 3
//1)Search in a 2D matrix

//Day 4
//1)2 sum problem

//Day 5
//1)Reverse a LinkedList
//2)Find the middle of LinkdedList