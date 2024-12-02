//Interface dictionary meaning Interface is a point where 2 systems meet and interact..
//Example :- Tv remote button is an interface to interact with tv and you..
//Implementing an Interface forces method implementation..
package com.company;
interface Bicycle{//interface method can not have body
    //   final  int a=45;(By default final)
    int a=45;//(fields or property)it is constant
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle extends Bicycle{
    void blowhorn();
    void blowhorn1();

}
//class Avencycle implements Bicycle,HornBicycle{
class Avencycle implements HornBicycle{ //Run because HornBicycle extends Bicycle..
    int speed =7;
//    a=34;//Error because a is defined in interface whose variable is constant and it can not be updated..
    public void a(){
        System.err.println("ok the value of a is "+a);
    }
    @Override
    public void applyBrake(int d){
        System.err.println(speed=speed-d);
    }
    @Override
    public void speedup(int increment) {
        System.err.println(speed = speed - increment);
    }
    @Override
      public   void blowhorn()
    {
            System.err.println("Blow Horn");
    }
       @Override
       public void blowhorn1(){
            System.err.println("stop Horn");
    }
}
public class pt_44_cwh55_AbstractvsInterface {
    public static void main(String[] args) {
//        like abstract class interface reference also possible and its object is not possible..
//Bicycle ob=new Bicycle();--Error

        Bicycle obj=new Avencycle();//Dynamic Method dispatch..
        //we can also assign reference of an abstract class to the object of a concrete(means reality) subclass..
        System.err.println("\n Super(interface) class object and Sub class reference(Dynamic Method Dispatch)");
        obj.applyBrake(44);
        obj.speedup(33);
        // obj.a();--Error due to dynamic method dispatch..

        System.err.println("\n Super(interface) class object and Sub class reference(Dynamic Method Dispatch)");
        HornBicycle ob=new Avencycle();//Dynamic Method dispatch..
        ob.blowhorn();
        ob.blowhorn1();
        // ob.a();--Error due to dynamic method dispatch..

        System.err.println("\n Sub class object and Sub class reference");
        Avencycle obk=new Avencycle();
        obk.a();
        obk.applyBrake(33);
        obk.speedup(3);
        obk.blowhorn();
        obk.blowhorn1();

//        You can create property in interfaces..
//        System.err.println(obk.a);
//        System.err.println(obj.a);

//        You can't modify the properties in Interfaces as they are final..
//        obj.a=45;-Error
//        obk.a=45;-Error because a value is final in interface (by default)..


//        obj.speed=45;-Error because this property is defined in a subclass
//        System.err.println("\nBefore updating property");
//        System.err.println("original speed = "+obk.speed);
//        obk.speedup(42);

//        obk.speed=44;
//        System.err.println("\nAfter updating property");
//        System.err.println("New speed = "+obk.speed);
//        obk.speedup(42);
    }
}

