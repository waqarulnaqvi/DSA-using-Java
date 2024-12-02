package com.company;
import java.util.Scanner;
class Base {//super class or base class or parent class ..
    //if you don't write public before the class name than class access modifier is default..
//    int x;//default
  private  int x;
    public void setX(int x) {
        System.err.println("I am in base class (super class)  and setting value of x:");
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void printme()
    {
        System.err.println("I am Your Dad:");
    }
}
//sub class or child class or derived class..
//sub class extends super class..
//public means sub kuch access kar sakte hai..
class derived extends Base{
    int y;
    public void setY(int y) {
        System.err.println("I am in derived class(sub class) setting up the value of y:");
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
public class pt_35_cwh_45_inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creating an object of base class
        Base obj =new Base();
        obj.setX(50);
        System.err.println(obj.getX());
        //not possible because base class(super  class)  does not have y
//        obj.setY(2);
//        System.err.println(obj.getY());
        //Creating an object of derived class
        derived ob=new derived();
       ob.setX(5);
       System.err.println(ob.getX());
       ob.setY(2);
        System.err.println(ob.getY());
    }
}
//Quick Quiz:-
//class Animal {
//    //    int x;//default
//    private  int x;
//    public void setX(int x) {
//        System.err.println("Animals");
//        this.x = x;
//    }
//    public int getX() {
//        System.err.println("We are a good species than human because we don't destroy nature :");
//        return x;
//    }
//    public void printme()
//    {
//        System.err.println("I am Your Dad:");
//    }
//}
////sub class
////sub class extends super class..
////public means sub kuch access kar sakte hai..
//class dog extends Animal{
//    int y;
//    public void setY(int y) {
//        System.err.println("Bark:");
//        this.y = y;
//    }
//    public int getY() {
//        System.err.println("bau bau");
//        return y;
//    }
//}
//public class pt_35_cwh_45_inheritance {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //Creating an object of base class
//        Animal obj =new dog();
//        obj.setX(50);
//        System.err.println(obj.getX());
//        //not possible because base class(super  class)  does not have y
////        obj.setY(2);
////        System.err.println(obj.getY());
//        //Creating an object of derived class
//        dog ob=new dog();
//        ob.setX(5);
//        System.err.println(ob.getX());
//        ob.setY(2);
//        System.err.println(ob.getY());
//    }
//}
