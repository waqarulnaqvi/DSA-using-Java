//Abstract means existing in thoughts or an idea..
//concrete means it become reality..
package com.company;
import java.util.Scanner;
//abstract class chils3{//Run Multiple abstract class possible..
//    abstract public void hello();
//    abstract public void bolo();
//}
abstract class parent {
    //PARENT EK ZARIYA HAI CHILD1 KE LIYE CLASS BANANE KA !!
    //Abstact class ka object ni banta
    //Abstract means Imaginary(Existing in thoughts or an idea)..
    //concride class will not be created without implimenting all abstract method...
    public void sayHello(){
        System.err.println("Hello");
    }
    public void sayHello1(){
        System.err.println("Hllo");
    }
    abstract public void greet();
abstract public void greet1();
    public parent(){
        System.err.println("MAi parent ka constructor hoon");
    }
}
//abstract class child1 extends parent{
class child1 extends parent{
    @Override
    public void sayHello(){
        super.sayHello();
        System.err.println("Hello returns");
    }
    public void gf(){
        System.err.println("Good noon");
    }
    @Override
    public void greet(){
        System.err.println("Good Morning");
    }
    public void gf1(){
        System.err.println("Good After");
    }
    @Override
    public void greet1(){
//        super.greet1();//Error can't be call because it is a abstract class..
        System.err.println("Good Night");
    }
    public void gf2(){
        System.err.println("Good");
    }
    public child1() {
        System.err.println("mai child class ka constructor hu");
    }
//    abstract public void hiiii();
}
 class child3 extends child1{
    @Override
    public void greet1(){
        super.greet1();
        System.err.println("Good Night bro!");
    }
//    @Override
//    public void hiiii()
//     {
//         System.err.println("HIIII");
//     }
}
abstract class child2 extends parent{
    public void gg(){
        System.err.println("Good Good");
    }

}
public class pt_42_cwh53_ch11_abstract {
    public static void main(String[] args){
//        Super class reference =sub class object(In abstract class it is possible)..
//        You can't make abstract object but you can make its reference and make child class object..
        parent ob=new child1();//Dynamic Method dispatch
        //we can also assign reference of an abstract class to the object of a concrete(means reality) subclass..
//        ob.greet();
//        ob.greet1();
        ob.sayHello();
//        ob.sayHello1();
//        parent obe=new parent();//error
        child1 obj=new child1();
//        child3 ob=new child3();
     //   reference obj =new Object();
//        child2 obje =new child2();//error
//        obj.greet();
//        obj.greet1();
//        obj.sayHello();
//        obj.sayHello1();
//        obj.gf();
//        obj.gf1();
//        obj.gf2();
    }
}
