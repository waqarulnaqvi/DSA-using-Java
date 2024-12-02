package com.company;
import java.util.Scanner;
class Base1 extends Derive
{
    public int x;
    public Base1( )
    {
        System.err.println("i am a constructor:");
    }
    public Base1(int a ) {
        super(a,67);
        System.err.println("i am an overloaded constructor :"+a);
    }
    public Base1(int a ,int y) {
        System.err.println("i am an overloaded constructor :"+a+" and "+ y);
    }
}
class Derive  {
    public int y=6;
    public Derive() {
        // super(10);
        //     super(20,10);
//        this.y = y;
        System.err.println("i am a derived constructor");
    }
    public Derive(int x,int y)
    {
        //super(x,y);
        System.err.println("i am an overloaded constructor of derive :"+x+" and "+ y);
    }
}
class child extends Base1{
    public child()
    {
        //  super(5,6);
        System.err.println("I am a child of derive");
    }
    public child(int a,int b,int c){
        super(a);
        System.err.println("I am overloaded child of derive with value of a,b,c as:"+a+","+b+" and "+c);
    }
}
public class pt_36_cwh_46_construc_in_inherit {
    public static void main(String[] args) {
         Base1 obj = new Base1(3);
        //  Derive ob = new Derive(1,43);
//        child obk=new child(6,8,9);
    }
}


//package com.company;
//class Base2
//{
//private int x;
//   Base2(){
//       System.out.println("I am a base class non-parameterized Constructor");
//   }
//    public Base2(int x) {
//        this.x=x;
//        System.out.println("I am a base class parameterized constructor:");
//    }
//}
//class Derive2 extends Base2
////    Note:when there are multiple constructors in the parent class the constructor without any parameters is called from the child class .
////    If we want to call the constructor with parameters from the parent class , we can use super keyword..
////   super(a,b);
//{
////    Base class non-parameterized constructor automatically invoke..
////    but we should make derive class constructor to invoke base class parameterized constructor with the help of super keyword..
// private int y;
//    public Derive2(int x,int y) {
//       super(x);
//        this.y=y;
//        System.out.println("I am a Derived class parameterized constructor");
//    }
//    public Derive2(){
////        super(33);//you can also called Base class parameterized constructor in Derived class non-parameterized constructor..
////       super(); //likho ya na likho koi dikkat ni hai base class non-parameterized constructor automatically invoke..
//        System.out.println("I am a Derived class non-parameterized constructor");
//    }
//}
//class ChildDerive2 extends Derive2
//{
//    private int z;
//    public ChildDerive2(int x,int y,int z) {
//        super(x,y);
//        this.z=z;
//        System.out.println("I am a Child Derived class parameterized constructor");
//    }
//    public ChildDerive2(){
////        super(33);
//        System.out.println("I am a Child Derived class non-parameterized constructor");
//    }
//}
//public class pt_36_cwh_46_construc_in_inherit {
//    public static void main(String[] args) {
//
////        Non-parameterized Constructor..
//        System.out.println("Non-parameterized Constructor");
//        //Base2 obj = new Base2();
////        Derive2 ob = new Derive2();
//        ChildDerive2 o = new ChildDerive2();
//
// //        Parameterized Constructor..
//        System.out.println("\nParameterized Constructor");
////        Base2 obj1 = new Base2(4);
////        Derive2 ob1 = new Derive2(22,4);
//        ChildDerive2 o1 = new ChildDerive2(3,3,4);
//    }
//}
