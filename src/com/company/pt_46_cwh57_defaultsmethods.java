package com.company;
//import java.awt.*;
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning..");
    }
    default void record4kvideo(){//you can override it
        greet();
        System.out.println("Recording 4K video...");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber)
    {
        System.out.println("Calling"+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}
class MySmartphone extends MyCellPhone implements camera,Wifi{
   @Override
    public void takesnap(){

//       super.greet();//you can't call private method/function in derived class even though if you extend the sub class or implement the interface..
   System.out.println("Taking Snap");
    }
    private void takesnap2(){
        System.out.println("Taking Snap2");
    }
    @Override
   public void recordvideo(){
        System.out.println("Recording video");
    }
//    @Override
//    public void record4kvideo(){//overriding default method and if you override default method than overridden method will call original default method will not call...
//        System.out.println("Recording 4K video returns...");
//    }
    @Override
    public String[] getNetwork() {
        System.out.println("Getting Lists of Network");
        String[] networklist={"jio 4G","airtel","vodaphone"};
        return networklist;
//        return new String[0];
    }
    @Override
   public  void connectToNetwork(String network){
        System.out.println("Connecting to"+network);
    }
//    public void record4Kvideo(){//it will override the record4kvideo method..
//        System.out.println("Recording 3k video..");
//    }
}
public class pt_46_cwh57_defaultsmethods {
    public static void main(String[] args) {

        MySmartphone ob=new MySmartphone();
//        obj.record4kvideo();
//        ob.greet();//Throws an Error (because you can't call private (function or method)..
//       ob.takesnap2();//Throws an Error (because you can't call private (function or method)..
//        you can directly call public and protected method/function but not private method/function..
        ob.record4kvideo();
        String[] ar=ob.getNetwork();
        for (String e:ar) {
            System.out.println(e);
        }
        MyCellPhone oo=new MySmartphone();//Dynamic method dispatch (Polymorphism)..
//        oo.greet();//Throws an Error (because you can't call private (function or method)..
  ob.record4kvideo();
        camera obj=new MySmartphone();//Dynamic method dispatch (Polymorphism)..
obj.record4kvideo();
        Wifi o=new MySmartphone();//Dynamic method dispatch (Polymorphism)..
o.getNetwork();
//you can implement polymorphism in java,In interfaces through Dynamic method dispatch  &,In inheritance through Dynamic method dispatch..
    }
}
