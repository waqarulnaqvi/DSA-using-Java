//    void sum(int a,int b)//parameters are a&,b..
// sum(5,7); 5&, 7 are arguments, arguments are actual or actual values are called arguments..
//    concurrency and parallelism difference is same as the arguments and parameters difference..

/*Concurrency is the task of running and managing the multiple computations at the same time.
 While parallelism is the task of running multiple computations simultaneously.Concurrency is the task
 of running and managing the multiple computations at the same time. While parallelism is the task of running
 multiple computations simultaneously.Concurrency is the task of running and managing the multiple computations
 at the same time. While parallelism is the task of running multiple computations simultaneously.Concurrency
 is the task of running and managing the multiple computations at the same time.
 While parallelism is the task of running multiple computations simultaneously.
 */
package com.company;

class Mythread1 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("My thread1 is running..");
            System.out.println("I am little angry..");
        i++;
        }
    }
}
class Mythread2 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("My thread2 is running..");
            System.out.println("I am still angry..");
            i++;
        }
    }
}
public class pt_56_cwh_70_threading {

public static void main(String[] args) {
    Mythread1 t1 =new Mythread1();
    Mythread2 t2 =new Mythread2();
//    t1 and t2 alternative run honge kyuki hum threading ka use kar rhe hai..
   t1.start();//ek thread ko start karne ke liye humme start method chalana padhta hai..
   //start method thread ko internally call kar leta hai apne hisab se..
//    yeah saari implimentation thread.java me hai thread method/function ki..
    t2.start();
}
}
