//class natural extends Thread
//{
//    @Override
//    public void run()
//    {
//        for (int i = 1; i <=100 ; i++) {
//            System.out.println("natural = "+i);
//        }
//    }
//}
//class even extends Thread
//{
//    @Override
//    public void run()
//    {
//        for (int i = 2; i <= 100; i+=2) {
//            System.out.println("even = "+i);
//        }
//    }
//}
//
//class prime extends Thread
//{
//    @Override
//    public void run()
//    {
//        int flag=0;
//        for (int i = 2; i <100; i+=1) {
//            for (int j = 2; j <=100 ; j++) {
//                if (i % j == 0 && i != j) {
//                    flag = 1;
//                    break;
//                }
//            }
//                if (flag==0)
//                {
//                    System.out.println("prime = "+i);
//                }
//                flag=0;
//            }
//        }
//    }
//
//public class even_prime_natural {
//    public static void main(String[] args) {
//        natural n=new natural();
//        n.start();
//        prime p=new prime();
//        p.start();
//        even e=new even();
//        e.start();
//    }
//}
