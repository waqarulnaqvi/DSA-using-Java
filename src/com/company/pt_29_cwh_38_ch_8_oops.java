//we write methods and varible in camel case in java..
package com.company;//oops connect the programming language to the real world..
//oops is supported by java,python &,c++ etc..
//bina classes ke jo programming karte usse hum procedural programming kehte jaise bina classes ke hum procedural programming karte hum c++ me or python me etc..
//java is not 100 percent object oriented programming language..
//we can use only 1 public in 1 java file..
//An object is an instantiation of a class..
//object class se banni hui real world entity hai.
//memory is allocated only after object instantiation..
//class is an blueprint of an object.

//public class Employee {//Error ek program me sirf ek hi class public ho sakta..
 class Employee {
    int id;
    String name;
/*    String name;
     name=new String("Hiiii");*///Error
//    String name=new String("Hiiii");

//    int salary;
  /*  int salary;
   salary=34000;*///Error..
  int salary=34000;

    public void printDetails() {
        System.err.println("My id is:" + id);
        System.err.println("My name is :" + name);
        System.err.println("Salary:"+salary);
    }

    public int Getsal() {
       // System.err.println("Salary:"+salary);
        return salary;
   }

}
public class pt_29_cwh_38_ch_8_oops {
    //object oriented programming tries to map code instructions with real world making the code short and easier to understand.
    //solving a program with object is called object oriented programming..
    public static void main(String[] args) {
   //object oriented programming implement DRY :- Do not Repeat Yourself..
   /*Noun ->class->employee
   Adjective->Attributes->name ,age , salary
   verb->Methods ->getsalary(),increments()
    */
        //Any real world object = Properties +function(Behavior)
       // Object in OOps =Attributes +Method(function)
        System.err.println("This is our custom class");
        Employee obj =new Employee();//Instantiating a new Employee object..
      //Setting Attributes and Setting property...
        obj.printDetails();
        Employee ob =new Employee();
        //Setting property/Attributes for obj...
        obj.id=12;
//        obj.name=new String("Waqarul");
        obj.name="Waqarul";
        System.err.println("Salary before update is "+obj.salary);
        obj.salary=14;
        obj.printDetails();
//        obj.salary;
        System.err.println(obj.id);
        System.err.println(obj.name);
       // obj.printDetails();
        //Setting Attributes/property for an object..
        ob.id=13;
        ob.name="Azaan";
     //  System.err.println(obj.salary);
          ob.salary=24;
        //Printing the Attributes/property..
        System.err.println(obj.id);
       System.err.println(obj.name);
//  obj.printDetails();
//        int sal=obj.Getsal();
//        System.err.println(sal);
//        ob.printDetails();
//        System.err.println(ob.Getsal());
        }
}
