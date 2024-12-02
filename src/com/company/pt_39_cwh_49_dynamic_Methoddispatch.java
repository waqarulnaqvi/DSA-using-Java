package com.company;
class Phone{
    public void greet()
    {
        System.err.println("Good Morning");
    }
    public void name()
    {
        System.err.println("My phone is normal phone ");
    }
    public void hello()
    {
        System.err.println("Hello brother..");
    }
}
class SmartPhone extends Phone{
    @Override
    public void greet()
    {
        super.greet();
        System.err.println("Good Morning returns");
        super.greet();
    }
    public void swagat()
    {
        System.err.println("Aapka Swagat hai..");
    }
    @Override
    public void name()
    {
        System.err.println("My phone is Smartphone ");
    }
}
public class pt_39_cwh_49_dynamic_Methoddispatch{
    public static void main(String[] args) {
        //Dynamic Method dispatch is also known as Upcasting.. In java it is one of the ways in which java supports run time polymorphism..
        //In java object creation happened during run-time..
        //It is called dynamic Method dispatch..It is very useful during run time polymorphism..
        //Reference p=new Object();//leftside element is called reference and rightside element is called Object..

        Phone p=new SmartPhone();//Yes it is Allowed//IN this process object of (child-class)sub-class will execute..
        //Object creation is happening on the run time ,dynamic method dispatch is very useful to do a runtime polymorphism..
        p.greet();
        p.name();
        p.hello();
//      p.swagat();//Not Allowed

        System.err.println();
        SmartPhone s= new SmartPhone();
        //Object creation is happening on the run time ,dynamic method dispatch is very useful to do a runtime polymorphism..
//        s.greet();
//        s.name();
//        s.swagat();
        //Polymorphism Meaning ek cheez ke different form...
        //eg:overridden,dynamic method dipatch is very helpul to do a runtime Polymorphism &,overloading etc...
        //new Means object is created during runtime...
        //SmartPhone s= new Phone();//NOT Allowed
        //Phone pd=(Phone)new SmartPhone();//Run
      /*  SmartPhone s= (SmartPhone) new Phone();//ERORR
        Phone s= (SmartPhone) new Phone();//ERORR
        SmartPhone s= (Phone) new SmartPhone();//ERORR*/
        //Phone pd=(Phone)new SmartPhone();//Run
    }
}
