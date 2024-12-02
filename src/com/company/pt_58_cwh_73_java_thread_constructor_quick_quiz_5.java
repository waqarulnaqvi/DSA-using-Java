//package com.company;
//class Mythr extends Thread
//{//hrr thread ke pass ek id bhi hoti hai..
//    public Mythr(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//    int i=3;
////        while (true)
////        while (i<400)
////        {
//            System.out.println("I am a thread");
////            System.out.println("The id of the thread t is "+getId()+"\n");
////            i++;
////        }
//    }
//}
//public class pt_58_cwh_73_java_thread_constructor_quick_quiz_5{
//    public static void main(String[] args) {
//       Mythr t =new Mythr("Waqarul");
//       t.start();
////       t.start();//if you start same thread 2 or more time than error..
//        System.out.println("The id of the thread t is "+t.getId());
////       t.start();//if you start same thread 2 or more time than error..
//        System.out.println("The name of the thread t is "+t.getName()+"\n");
//
//        Mythr t1 =new Mythr("Azaan");
//       t1.start();
//        System.out.println("The id of the thread t is "+t1.getId());
//        System.out.println("The name of the thread t is "+t1.getName());
//
//    }
//}

//quick_quiz_5:
class MythreadRunnable4 extends Thread implements Runnable{
        public MythreadRunnable4(String name)
    {
        super(name);
    }
    @Override
    public void run() {
//        int i=0;
//        while ( i<400) {
            System.out.println("I am a thread1 not a threat1..");
//        System.out.println("The id of the thread t is "+getId());
//        System.out.println("The name of the thread t is "+getName()+"\n");
//            i++;
//        }
    }
}class MythreadRunnable3 extends Thread implements Runnable{
    public MythreadRunnable3(String name)
    {
        super(name);
    }
    @Override
    public void run() {
//        int i=0;
//        while ( i<400) {
            System.out.println("I am a thread2 not a threat2..");
//        System.out.println("The id of the thread t is "+getId());
//        System.out.println("The name of the thread t is "+getName()+"\n");
//            i++;
//        }
    }
}
public class pt_58_cwh_73_java_thread_constructor_quick_quiz_5 {
    public static void main(String[] args) {
//        MythreadRunnable4 bullet1=new MythreadRunnable4("Waqarul");
//        Thread gun1 =new Thread(bullet1);
//        gun1.start();
//        System.out.println("The id of the thread t is "+gun1.getId());
//        System.out.println("The name of the thread t is "+gun1.getName()+"\n");

//        bullet1.start();
//        System.out.println("The id of the thread t is "+bullet1.getId());
//        System.out.println("The name of the thread t is "+bullet1.getName()+"\n");
//
//        MythreadRunnable3 bullet2=new MythreadRunnable3("Azaan");
//        Thread gun2 =new Thread(bullet2);
//        gun2.start();
//        System.out.println("The id of the thread t is "+gun2.getId());
//        System.out.println("The name of the thread t is "+gun2.getName()+"\n");

//          bullet2.start();
//        System.out.println("The id of the thread t is "+bullet2.getId());
//        System.out.println("The name of the thread t is "+bullet2.getName()+"\n");

        MythreadRunnable4 bullet1=new MythreadRunnable4("Waqarul");
        bullet1.start();
        System.out.println("The id of the thread t is "+bullet1.getId());
        System.out.println("The name of the thread t is "+bullet1.getName()+"\n");
//
        Thread gun1 =new Thread("Waqarul");
        gun1.start();
        System.out.println("The id of the thread t is "+gun1.getId());
        System.out.println("The name of the thread t is "+gun1.getName()+"\n");

        Thread gun2 =new Thread("Azaan");
        gun2.start();
        System.out.println("The id of the thread t is "+gun2.getId());
        System.out.println("The name of the thread t is "+gun2.getName()+"\n");
//
        MythreadRunnable3 bullet2=new MythreadRunnable3("Azaan");
        bullet2.start();
        System.out.println("The id of the thread t is "+bullet2.getId());
        System.out.println("The name of the thread t is "+bullet2.getName());
    }
}
