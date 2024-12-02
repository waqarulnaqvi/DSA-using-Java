//Implementing an Interface forces method implementation..
package com.company;
//java does not support multiple inheritance directly it support multiple inheritance through interface but c++ supports multiple inheritance directly..
interface Bicycle2{//interface method can not have body..
    //Interface Method by default public and if you put public in it than java compiler show it is redundant..
    int a=45;//(fields or property)it is constant and by default it is a final..
    void applyBrake(int decrement);//interface method by default public if you write public before the interface method it will be redundent..
    void speedup(int increment);
    private void greet(){
        System.err.println("Good Morning..");
    }
    default void greet2(){
        greet();
        System.err.println("Good Night..\n");
    }
}
class Avencycle2 implements Bicycle2{
    int a=5;//(field or property)you can override interfaces property..
    int speed =7;
    public void a(){
        System.err.println("ok");
    }
    @Override
    public void applyBrake(int d){
        System.err.println(speed=speed-d);
    }
    @Override
    public void speedup(int increment){
        System.err.println(speed=speed-increment);
    }
}
public class pt_45_cwh56_multipleinheritance {
    public static void main(String[] args) {
        Bicycle2 obj=new Avencycle2();//Dynamic Method dispatch..
//        ob.greet();-Throws an Error (because you can't call private (function or method) in the interface)..
        Avencycle2 obk=new Avencycle2();
//        ob.greet();-Throws an Error (because you can't call private (function or method) in the interface)..
        System.err.println(obj.a);;
        System.err.println(obk.a);;
        obj.greet2();
        obk.greet2();

    }
}
