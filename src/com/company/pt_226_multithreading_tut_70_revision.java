//public void hello(int a)//parameters are formal
//hello(3);//arguments are actual
//concurrency ek time pe ek task kar rhe but manage kar rhe multiple computation ko..
//parallelism ek particular instance pe app multiple task kar rhe ..
//With the help of parallelism we can achieve multithreading..
class Multi extends Thread{
    @Override
    public void run()
    {
//        int i=0;
//        while(i<9999)
//        {
//            System.out.println("Multi 11" +i);
//            i++;
//        }
    }
}
public class pt_226_multithreading_tut_70_revision extends Thread {
    @Override
    public void run()
    {
//        int i=0;
//        while(i<9999)
//        {
//            System.out.println("Thread"+i);
//            i++;
//        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getState()+"fgsfsd");
        pt_226_multithreading_tut_70_revision t1=new pt_226_multithreading_tut_70_revision();
        System.out.println(Thread.currentThread().getState()+"fgsfsd");
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState()+"fgsfsd");
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState()+"fgsfsd");
        Multi t2=new Multi();
        t2.start();
        System.out.println(Thread.currentThread().getState()+"fgsfsd");
        System.out.println(t1.getState());
//       t1.run();//it runs like a normal method first print t1(run) all elements than t2(run) all elements..
//       t2.run();//it runs like a normal method first print t1(run) all elements than t2(run) all elements..
        System.out.println("The id of this thread is"+t1.getId());
        System.out.println("The id of this thread is"+t2.getId());
        System.out.println("The id of this thread is"+t1.getId());
        System.out.println("The id of this thread is"+t2.getId());
        System.out.println(t1.getState());
    }
}
