package com.company;
class RunnableInterface implements Runnable {

    RunnableInterface(String name)
    {
        super();
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 23232) {
            System.out.println("11 is running");
            System.out.println("I am the alpha");
            i++;
        }
    }
}
class RunnableInterface1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 23232) {
            System.out.println("12 is running");
            System.out.println("I am a bad boy");
            i++;
        }
    }
}
public class pt_173_Multitthreading_with_runnable_interface {
    public static void main(String[] args) {
        RunnableInterface bullet1=new RunnableInterface("waqarul");
        RunnableInterface1 bullet2=new RunnableInterface1();
Thread t1=new Thread(bullet1);
        System.out.println("The id of the thread t is "+ t1.getId());
        t1.start();
        System.out.println("The id of the thread t is "+ t1.getId());
        System.out.println("The name of the thread t is "+t1.getName());
Thread t2=new Thread(bullet2);
        System.out.println("The id of the thread t is "+ t2.getId());
        t1.start();
        System.out.println("The id of the thread t is "+ t2.getId());
        System.out.println("The name of the thread t is "+t2.getName());
        //        System.out.println(t1);
//        System.out.println(t2);
        t1.start();
        t2.start();

    }
}
