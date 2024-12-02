//Interface dictionary meaning: Interface is a point where 2 systems meet and interact..
//Example :- Tv remote button is an interface to interact with tv and you..
//Implementing an Interface forces method implementation..
package com.company;
interface Bicycle1{//interface method can not have body
//    int a=45;//(fields or property)it is constant and by default it is a final..
    final int a=45;//final is redundent here..
    void applyBrake(int decrement);
    void speedup(int increment);
//    void hello()//Error: we can't create normal method/function in the interface..
//    {
//        System.out.println("hello");//Error: interface does'nt have any body..
//    }
}
abstract class cycle1 implements Bicycle1{
    void a(){
        System.err.println("ok the value  of a returns of cycle 1 is "+a);
    }
public void hehe()
{
    System.err.println("HEHE!");
}
}
class cycle2 extends cycle1{
     int speed =7;
//    final int speed =7;//You can make any variable final(constant) in a class..
    @Override
    public void applyBrake(int d){
        System.err.println(speed=speed-d);
    }
    @Override
    public void speedup(int increment){
        System.err.println(speed=speed-increment);
    }
    @Override
    void a(){
        super.a();
        System.err.println("ok i am cycle 2  a = "+a);
    }
    void hello_shallo()
    {
        System.err.println("Hello shallow");
    }
}
class Avencycle1 implements Bicycle1{
    int speed =7;
     void a(){
        System.err.println("ok the value of a is "+a);
    }
    @Override
    public void applyBrake(int d){//interface ke agar aap method implement kar rhe to aapko access modifier public bannana padhega default method  ni ho sakte interface me..
//          void applyBrake(int d){//interface all method must be public..
        System.err.println(speed=speed-d);
        System.err.println("interface variable");
    }
    @Override
    public void speedup(int increment){
        System.err.println(speed=speed-increment);
    }
}
public class pt_43_cwh54_interface {
    public static void main(String[] args) {
//        like abstract class interface reference also possible and its object is not possible..
//Bicycle1 ob=new Bicycle1();--Error

        Bicycle1 obj=new Avencycle1();//Dynamic Method dispatch is allowed in the interface..
        //we can also assign reference of an abstract class to the object of a concrete(means reality) subclass..
//        System.err.println("\n Super(interface) class object and Sub class reference(Dynamic Method Dispatch)");
//        obj.applyBrake(44);
//        obj.speedup(33);
        // obj.a();--Error due to dynamic method dispatch..

//        System.err.println("\n Sub class object and Sub class reference");
        Avencycle1 obk=new Avencycle1();
        obk.a();
//        obk.applyBrake(33);
//        obk.speedup(3);

//        You can create property in interfaces..
//        System.err.println(obk.a);
//        System.err.println(obj.a);

//        You can't modify the properties in Interfaces as they are final..
//        obj.a=45;-Error
//        obk.a=45;-Error because a value is final in interface (by default)..
//        obj.speed=45;-Error because this property is defined in a subclass
        obk.speed=45;  //because this property is defined in a subclass

        Bicycle1 ooo =new cycle2();//allowed..
//        ooo.applyBrake(23);
        cycle1 oooo =new cycle2();
      oooo.a();
      oooo.hehe();
//        oooo.hello_shallo();
      cycle2 ooooo =new cycle2();
        ooooo.hello_shallo();

    }
}
