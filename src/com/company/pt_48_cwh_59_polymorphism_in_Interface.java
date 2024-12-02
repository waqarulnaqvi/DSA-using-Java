//Implementing an Interface forces method implementation..
package com.company;
//import java.awt.*;
interface Camera1{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning..");
    }
    default void record4kvideo(){//you can override it..
        greet();
        System.out.println("Recording 4K video...");
    }
}
interface Wifi1{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class  MyCellPhone1{
    void callNumber(int phonenumber)
    {
        System.out.println("Calling "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}
class MySmartphone1 extends MyCellPhone1 implements Camera1,Wifi1{
    @Override
    void pickCall() {
        System.out.println("Diconnecting..");
    }
    @Override
    public void takesnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordvideo(){
        System.out.println("Recording video");
    }
    @Override
    public String[] getNetwork() {
        System.out.println("Getting Lists of Network");
        String[] networklist={"jio 4G","airtel","vodaphone"};
        return networklist;
    }
    @Override
    public  void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
   public void gps()
   {
       System.out.println("Connecting location on google Map..");
       }
}

 class pt_48_cwh_59_polymorphism_in_Interfaces {
    public static void main(String[] args) {

        MyCellPhone1 n=new MyCellPhone1();
        n.callNumber(5656);
        n.pickCall();

        MyCellPhone1 k=new MySmartphone1();//this is a Smartphone but use it as a Cellphone..
        //Dynamic method dispatch (Polymorphism)..
        //This reference is only used to call overriden method in the subclass(Smartphone)..
        k.pickCall();
        k.callNumber(420);
//        k.takesnap();//Throws an error due to dynamic Method dispatch you can't use Smartphone Method..
//        k.gps(); //Throws an error due to dynamic Method dispatch you can't use Smartphone Method..

//        MySmartphone1 k1=new MyCellPhone1();//not allowed

        MySmartphone1 o =new MySmartphone1();
//        o.takesnap();
//        o.connectToNetwork("airtel");
//        o.gps();

//        This is a Smartphone but use it as a Camera..
        Camera1 ob=new MySmartphone1();//this is a Smartphone but use it as a Camera..
        //Dynamic method dispatch (Polymorphism)..
//        System.out.println();
//        ob.takesnap();
////        ob.connectToNetwork("airtel");--Throws an error
////        ob.gps();--Throws an error

//        This is a Smartphone but use it as//this is a Smartphone but use it as a Wifi.. a Wifi..
        Wifi1 obj=new MySmartphone1();
        //Dynamic method dispatch (Polymorphism)..
//        System.out.println();
////        obj.takesnap(); --Throws an error
//        obj.connectToNetwork("airtel");
////        obj.gps(); --Throws an error

            }
        }