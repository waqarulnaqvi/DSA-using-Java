package com.company;

//Question 1:
class Mythread4 extends Thread {
    @Override
    public void run() {
//        int i=0;
////        while (true) {
//        while (i<5000) {
//            System.out.println("Good Morning..");
//            i++;
//        }
    }
}
class Mythread5 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("Welcome..");
            i++;
        }
    }
}
//Question 2:
class Mythread6 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("Good Morning back..");
            i++;
        }
    }
}
class Mythread7 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("Welcome home ..");
            try {
                Thread.sleep(200);//sleep method will through an exception same as join that's why we use try and catch..
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
//Question 3:
class Mythread8 extends Thread {
    @Override
    public void run() {
        int i=0;
//        while (true) {
        while (i<5000) {
            System.out.println("Welcome home Waqarul..");
            i++;
        }
    }
}
public class pt_61_cwh_76_ch_13_practice_set {

    public static void main(String[] args) {
        //Question 1:
//        Mythread4 t1 = new Mythread4();
//        Mythread5 t2 =new Mythread5();
//        t1.start();
//        t2.start();

        //Question 2:
//        Mythread6 t1 = new Mythread6();
//        Mythread7 t2 =new Mythread7();
//        t1.start();
//        t2.start();

        //Question 3:
//        Mythread4 t1 = new Mythread4();
//        Mythread5 t2 =new Mythread5();
//        Mythread6 t3 = new Mythread6();
//        Mythread8 t4 =new Mythread8();
//        //NORMALLY priority of all thread method/function is 5..
////        t1.setPriority(3);
//        t1.setPriority(5);//The default priority that is assigned to a thread..
////        t2.setPriority(1);
//////        t3.setPriority(101);//Error max priority must not more than 10 or min priority not less than 1..
//////        t3.setPriority(11);//Error max priority must not more than 10 or min priority not less than 1..
//////        t3.setPriority(0);//Error max priority must not more than 10 or min priority not less than 1..
//////        t3.setPriority(-1);//Error max priority must not more than 10 or min priority not less than 1..
////        t3.setPriority(1);
////        t4.setPriority(3);
//        System.out.println(t1.getPriority());
////        System.out.println(t2.getPriority());
////        System.out.println(t3.getPriority());
////        System.out.println(t4.getPriority());
//
////        t1.start();
////        t2.start();
////        t3.start();
////        t4.start();
//
////        t1.getPriority(0);
////        t1.setPriority(Thread.MIN_PRIORITY);
////        t2.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);//The maximum priority that a thread can have..
////        Modifier and Type : static int..
////      if  Modifier and Type :pubic static final int..(than priority filed will be constant)..
//        t3.setPriority(Thread.MIN_PRIORITY);//The minimum priority that a thread can have..
//        //Modifier and Type : static int..
//        //if  Modifier and Type :pubic static final int..(than priority filed will be constant)..
//        t4.setPriority(Thread.NORM_PRIORITY);//The default priority that is assigned to a thread..
//        //if  Modifier and Type :pubic static final int..(than priority filed will be constant)..
//        //Modifier and Type : static int..
//
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());
//        System.out.println(t4.getPriority());

        //Question 4:
//         Mythread4 t1 = new Mythread4();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());

        //Question 5:
//        currentThread();//Returns a reference to the  currently executing thread object..
//        System.out.println(t1.currentThread().getState());//Error..
         Mythread4 t1 = new Mythread4();
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        System.out.println(t1.currentThread().getState());
        t1.start();
        System.out.println(t1.currentThread().getState());
        System.out.println(Thread.currentThread().getState());
    }
}