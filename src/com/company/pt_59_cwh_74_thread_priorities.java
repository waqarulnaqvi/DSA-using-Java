package com.company;
class Mythr extends Thread
{//hrr thread ke pass ek id bhi hoti hai..
    public Mythr(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        int i=3;
//        while (true)
        while (i<400)
        {
            System.out.println("I am a thread "+getName());
//            System.out.println("The id of the thread t is "+getId()+"\n");
//        System.out.println("The name of the thread t is "+getName()+"\n");
            i++;
        }
    }
}
public class pt_59_cwh_74_thread_priorities {
    public static void main(String[] args) {
        //Thread priority is also depend on cpu ,some cpu decide which thread is to be executed first and which thread to be executed next/last..
        Mythr t =new Mythr("Waqarul");
        t.start();
//        System.out.println("The id of the thread t is "+t.getId());
//        System.out.println("The name of the thread t is "+t.getName()+"\n");

        Mythr t1 =new Mythr("Azaan");
        t1.start();
//        System.out.println("The id of the thread t is "+t1.getId());
//        System.out.println("The name of the thread t is "+t1.getName()+"\n");

        Mythr t2 =new Mythr("Azaan Naqvi");
        t2.start();
//        System.out.println("The id of the thread t is "+t2.getId());
//        System.out.println("The name of the thread t is "+t2.getName()+"\n");

        Mythr t3 =new Mythr("Waqarul naqvi");
        t3.start();
//        System.out.println("The id of the thread t is "+t3.getId());
//        System.out.println("The name of the thread t is "+t3.getName());
        t3.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

    }
}