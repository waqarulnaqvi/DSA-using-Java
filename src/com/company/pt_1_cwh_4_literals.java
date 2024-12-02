//anatomy of java program
//Documentation section--> optional
//Package Statement -->optional
//Import Statements-->optional
//Interface Statements-->optional
//class definition-->optional
//main method class -it is not optional it is essential, it is a entry point of java program..
//{
//    main method definition
//        }
//rules =suntax
// package com.company;//A package is Java is used to group related classes.Think of it as a folder in a file directory..
//package is also optional we can group classes in package..
public class pt_1_cwh_4_literals {//class ek template hoti hai jisse object bante hai
    //class group similar function and call when it required..
//    ex :-dictionary is a class
//    function is widthdraw ,borrow
//when we use stqtic function we don't need object..
//    void does'nt need any value in return
    public static void main(String[] args) {//default function
        //static,void, public,class is a reserved keyword of java program...
//main function is a starting point of a java  program
//      publc is a access modifier means yeah class ka method kahi se bhi access kaiya ja sakta hai
//static mumkin banata hai ki binna object bannaye yeah class ko run kar sakke
//        agar kissi  function ko class ke object se disassociate kar darna ho or at the same time wo class ke andar reside kar paye tum usko static method banna do...
//for classes PascalConvention
//for function camelCaseConvention
//      <datatype> <variablename> == <value>;
//        the value stored in a right hand side is called literals...
// A  constant value which can be assigned to the variable is called literals..
        //vaiables ko variable is liye kahte hai kyuki iski value ko change kiya ja sakta hai..
// documentation is a set of comments ex:-AUTHOR  name ,date,why you write code, what code do..
        int age=34;
//        white is not allowed in variable name or kissi bhi identifer me...
//        java language is statically typed means (you must be declared variable before use) aapko batana padhega ki yeah integer yeah float..
//       value ranges of short:- (2^8)/2 to (2^8)/2-1//-1 is;iye hota hai kyuki ek value 0 bhi hoti hai..
//  we can not find float,double value by this formula
        short a=44;
        char ch='a';
//        char value range between 0 to (2^16-1) (because java support unicode that's why size is double with the help of unicode we can use hindi ,urdu )..
//        ASCII character is  a subset of unicode character...
//        boolean size depends on JVM(machine) default value false...
//        (primitive data type java documentation page) if you want more details then search it on google otherwise cwh give full details...
       //search "docs.oracle" or search "java keyword +oracle" you will get more (official)information about keyword in java...
        long Long=777777L; //without "L" or "l" by default it is a integer...
        System.out.println(Long);
        float f1=5.6f;//f define float literals
        byte oo=34;// a integer literal
        double d1=4.660;//d or  D laggao ya na laggao tumhari marzi
        double d2=6.7D;
        double d3=6.888d;
        boolean yyy=true;
        System.out.println(a);
        java.lang.String str = "waqarul";
        System.out.println(str);


    }
}
