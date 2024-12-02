package com.company;
class Myth extends Thread{
Myth(String name)
{
    super(name);
}
public void run(){
    int i=0;
    System.out.println("Thank you!!");
//    while(i<34343){
//        System.out.println("I am a thread!!");
//        i++;
//    }
}
}
public class pt_174_Multitthreading_Constructor {
    public static void main(String[] args) {
        Myth t=new Myth("Harry");
        Myth t1=new Myth("Waqarul");
        t.start();
        System.out.println("The id of the thread t is "+ t.getId());
        t1.start();
        System.out.println("The id of the thread t is "+ t1.getId());
        System.out.println("The name of the thread t is "+t1.getName());

    }
}
