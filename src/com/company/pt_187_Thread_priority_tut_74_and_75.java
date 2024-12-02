//class MyThr1 extends Thread{
//    public MyThr1(String name)
//    {
//        super(name);
//    }
//    //      public MyThr(Runnable r,String name)
////    {
////        super(name);
////    }
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 9999) {
//            try {
//                Thread.sleep(455);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Multi 11 " + i+this.getName());
//            i++;
//        }
//    }
//}
//class MyThr12 extends Thread{
//    public MyThr12(String name)
//    {
//        super(name);
//    }
//    //      public MyThr(Runnable r,String name)
////    {
////        super(name);
////    }
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 9999) {
//            System.out.println("Multi 11 " +i+ this.getName());
//            i++;
//        }
//    }
//}
//public class Thread_priority_tut_74_and_75 {
//    public static void main(String[] args) {
//        MyThr1 t1=new MyThr1("Naqvi1");
//        MyThr1 t2=new MyThr1("Hello2");
//        MyThr1 t3=new MyThr1("Waqar3 (most important)");
//        MyThr1 t4=new MyThr1("Azaan4");
//        MyThr1 t5=new MyThr1("Abbas5");
////       t3.setPriority(Thread.MAX_PRIORITY);
////       t1.setPriority(Thread.MIN_PRIORITY);
////       t2.setPriority(Thread.NORM_PRIORITY);
////       t4.setPriority(Thread.MIN_PRIORITY);
////       t5.setPriority(Thread.MIN_PRIORITY);
//        MyThr12 t6=new MyThr12("Clever6");
//        t6.start();
//        t1.start();
//       try {
//           t1.join();//t1 jab tak khatam ni hoga tab tak koi or object run ni ho sakta..
//       }
//catch (Exception e)
//{
//    System.out.println(e);
//}
//
////        t2.start();
////        t3.start();
////        t4.start();
////        t5.start();
//    }
//}