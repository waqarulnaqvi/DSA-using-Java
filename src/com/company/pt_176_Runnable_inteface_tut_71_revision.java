//class Multi1 implements Runnable {
//
////    Multi1(Runnable r,String name)
////    {
////        super(name);
////    }
//    @Override
//    public void run() {
//        int i = 0;
//        while (i < 9999) {
//            System.out.println("Multi 11" + i);
//            i++;
//        }
//    }
//}
//
//public class pt_176_Runnable_inteface_tut_71_revision implements Runnable{
//    @Override
//    public void run()
//    {
//        int i=0;
//        while(i<9999)
//        {
//            System.out.println("Thread"+i);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
////        Multi1 t1=new Multi1(11,"@32");
//        Multi1 t1=new Multi1();
//        t1.run();//it runs like a normal method first print t1(run) all elements than t2(run) all elements..
//        Thread gun1=new Thread(t1);
//        Runnable_inteface_tut_71_revision t2=new Runnable_inteface_tut_71_revision();
//        t2.run();//it runs like a normal method first print t1(run) all elements than t2(run) all elements..
//        Thread gun2=new Thread(t2);
////        gun1.run();//it runs like a normal method first print gun1(run) all elements than gun2(run) all elements..
////        gun2.run();//it runs like a normal method first print gun1(run) all elements than gun2(run) all elements..
////        gun1.start();
////        gun2.start();
//        System.out.println("The id of this thread is"+gun1.getId());
//        System.out.println("The id of this thread is"+gun2.getId());
//        System.out.println("The id of this thread is"+gun1.getId());
//        System.out.println("The id of this thread is"+gun2.getId());
////        Multi t2=new Multi();
////        t2.start();
//    }
//}
