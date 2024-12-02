//setDaemon(boolean on) Daemon thread is a background thread that have least priority..
//resume() is a depricated method so please don't use it. depricated method means this method was to be removed/suspended..
package com.company;
class Mythr1 extends Thread {//hrr thread ke pass ek id bhi hoti hai..

    @Override
    public void run() {
//        while (true){
        int i = 3;
        while (i < 400) {
            System.out.println("I am a thread " + getId());
             try {
//                 Thread.sleep(344);//it will sleep this method for 344 milli second..
                 Thread.sleep(30);//it will sleep this method for 30 milli second..
//                 Thread.sleep(3);//it will sleep this method for 3 milli second..
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
    class Mythr2 extends Thread {//hrr thread ke pass ek id bhi hoti hai..

        @Override
        public void run() {
//            while(true){
            int i = 3;
            while (i < 400) {
                System.out.println("threading " + getId());
                i++;
            }
        }
    }
    public class pt_60_cwh_75_thread_methods {
        public static void main(String[] args) {
            //t agar infinite loop hua or aap agar join method/function ka use kar rhe hue to kabhi bhi t1 ko mauka hi ni milega..
            Mythr1 t = new Mythr1();
            Mythr2 t1 = new Mythr2();
            t.start();
//            try {
//                t.join();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            t.join();//Error Because there is a chances of thread to be occured..
            t1.start();
        }
    }
