package com.company;
import java.util.Scanner;
//question 1 & 2:
abstract class pen {
  abstract void write();
  abstract void refill();
  void hiii(){
      System.out.println("HIII");
  }
}
class fountainpen extends pen {
    @Override
    void refill() {
        System.out.println("Refill..");
    }

    @Override
    void write() {
        System.out.println("Write..");
    }
   void changenib()
   {
       System.out.println("Changing the nib..");
   }
    void pencil() {
        System.out.println("sharp the pencil..");
    }
}

//question 3 & 5:
interface BasicAnimal{
    void eat();
    void sleep();
    private void fight(){
        System.out.println("Fighting for dominance");
    }
   default void love(){
        fight();
       System.out.println("loving each other..");
   }
}
abstract class Monkey{
    void jump(){
        System.out.println("jumping..");
    }
    void bite(){
        System.out.println("bitting...");
    }
    abstract void speak();
}
class Human extends Monkey implements BasicAnimal{
   @Override
    public void eat()
    {
        System.out.println("Eating food..");
    }
    @Override
    public void sleep()
    {
        System.out.println("Sleeping..");
    }
    @Override
    void speak(){
        System.out.println("Talking each other..");
    }
}

//Question 4:
abstract class Telephone{
   abstract void ring();
   abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing..");
    }
    @Override
    void lift(){
        System.out.println("lifting a call..");
    }
    @Override
    void disconnect(){
        System.out.println("Call is disconnected..");
    }
}

//Question 6&7:
interface TvRemote{
    void normalTv();
}
interface SmartTvRemote extends TvRemote{
    @Override
    void normalTv();
    void youtube();
}
class Tv implements SmartTvRemote,TvRemote{
    @Override
   public void normalTv(){
       System.out.println("Normal Tv shows..");
    }
    @Override
   public void youtube(){
       System.out.println("Youtube videos..");
    }
}

public class pt_49_cwh_60_ch11practiceset {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

//    Question 1:
    pen obj=new fountainpen();//Dynamic Method dispatch(Polymorphism)..
//    obj.write();
//    obj.refill();
        obj.hiii();
////    obj.pencil();//error due to dynamic method dispatch (polymorphism)..
////    obj.changenib();//error due to dynamic method dispatch (polymorphism)..

//    Question 2:
        fountainpen ob=new fountainpen();
        ob.hiii();
//        ob.write();
//        ob.refill();
//        ob.pencil();
//        ob.changenib();

//        question 3 & 5:
        BasicAnimal o1=new Human();
//        o1.jump();//you can't use monkey class method in BasicAnimal Interface reference..
//        System.out.println("\nProperties of basic animal:");
////        BasicAnimal o2=(BasicAnimal)new Monkey();//possible
//        o1.eat();
//        o1.sleep();
////        o1.bite();//error due to dynamic method dispatch (polymorphism)..
////        o1.jump();//error due to dynamic method dispatch (polymorphism)..
////       o1.speak();//error due to dynamic method dispatch (polymorphism)..
//        o1.love();

        Monkey o2=new Human();
        o2.jump();
//        System.out.println("\nProperties of Monkey:");
////        o2.eat();//error due to dynamic method dispatch (polymorphism)..
////        o2.sleep();//error due to dynamic method dispatch (polymorphism)..
//        o2.bite();
//        o2.jump();
//        o2.speak();
////        o2.love();//error due to dynamic method dispatch (polymorphism)..

        Human o3=new Human();
//        System.out.println("\nProperties of Human extends from Monkey and inherit from BasicAnimal:");
//        o3.eat();
//        o3.sleep();
//        o3.bite();
//        o3.jump();
//        o3.speak();
//        o3.love();

//        Question 4:
        Telephone t=new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();

//        Question 6&7:
        TvRemote o4 =new Tv();
////        TvRemote oe =new SmartTvRemote();//Error..
//        o4.normalTv();

        SmartTvRemote o5=new Tv();
//       o5.normalTv();
//       o5.youtube();
    }
}
