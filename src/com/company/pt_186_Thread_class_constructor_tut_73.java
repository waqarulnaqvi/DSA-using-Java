class MyThr extends Thread{
    public MyThr(String name)
    {
        super(name);
    }
//      public MyThr(Runnable r,String name)
//    {
//        super(name);
//    }
    @Override
    public void run() {
        int i = 0;
        while (i < 9999) {
            System.out.println("Multi 11" + i);
            i++;
        }
    }
}
public class pt_186_Thread_class_constructor_tut_73 {
    public static void main(String[] args) {
        MyThr t=new MyThr("Waqarul");
//        t.start();
        System.out.println("The id of this thread is "+t.getId());
        System.out.println("The class of this thread is "+t.getClass());
        System.out.println("The name of this thread is "+t.getName()+"\n");

        MyThr t1=new MyThr("Azaan");
//        t1.start();
        System.out.println("The id of this thread is "+t1.getId());
        System.out.println("The class of this thread is "+t1.getClass());
        System.out.println("The name of this thread is "+t1.getName()+"\n");

        MyThr t2=new MyThr("Naqvi");
//        t1.start();
        System.out.println("The id of this thread is "+t2.getId());
        System.out.println("The class of this thread is "+t2.getClass());
        System.out.println("The name of this thread is "+t2.getName()+"\n");

    }
}
