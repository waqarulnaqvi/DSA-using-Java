package com.company;
import java.util.*;
class MythreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while ( i<400) {
            System.out.println("I am a thread1 not a threat1..");
            i++;
        }
    }
}class MythreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while ( i<400) {
            System.out.println("I am a thread2 not a threat2..");
            i++;
        }
    }
}
public class pt_57_cwh_71_thread_using_runnable_interface {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1=new MythreadRunnable1();
        //   bullet1.start();//Error you directly can't run start function/method when you are using runnable interface..
        Thread gun1 =new Thread(bullet1);
        gun1.start();

        MythreadRunnable2 bullet2=new MythreadRunnable2();
     //   bullet2.start();//Error you directly can't run start function/method when you are using runnable interface..
        Thread gun2 =new Thread(bullet2);
        gun2.start();
    }
}
