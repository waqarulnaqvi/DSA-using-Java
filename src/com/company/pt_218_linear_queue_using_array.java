//import  java.util.Scanner;
//class linear_queue {
//    int a[]=new int[4];
//    int f=-1,r=-1;
//    public void dequeue()
//    {
//        if(f==-1 && r==-1 )
//        {
//            System.out.println("Underflow!\n");
//        }
//        else {
//            f=f+1;
//            System.out.println("Element Deleted!!\n");
//        }
//    }
//    public void enqueue(Scanner sc)
//    {
//        if(r==a.length-1)
//        {
//            System.out.println("Overflow!\n");
//            return;
//        }
//        System.out.println("Enter a  element:");
//        int ele= sc.nextInt();
//        if(f==-1 && r==-1) {
//        f++;
//        r++;
//        a[f]=ele;
//        }
//        else {
//            r++;
//            a[r]=ele;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//    public void display()
//    {
//        System.out.println("Queue Elements:");
//        for (int i = f; i <=r ; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println();
//    }
//}
//public class linear_queue_using_array{

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        linear_queue s=new linear_queue();
//        boolean run=true;
//        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
//        while (run) {
//            System.out.println("1 for enqueue\n2 for dequeue\n3 for display\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> s.enqueue(sc);
//                case 2 -> s.dequeue();
//                case 3 -> s.display();
//                default -> {
//                    System.out.println("Breaking from the loop!!");
//                    run=false;
//                }
//            }
//        }
//    }
//}