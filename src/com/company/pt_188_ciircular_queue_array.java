//
//import  java.util.Scanner;
//class circular_queue {
//    int a[]=new int[4];
//    int f=-1,r=-1;
//    public void dequeue()
//    {
//        if(f==-1 && r==-1 )
//        {
//            System.out.println("Underflow!\n");
//        }
//        else if (f==r)
//        {
//            System.out.println("Element Deleted!!\n");
//            f=r=-1;
//        }
//        else {
//            f=(f+1)%a.length;
//            System.out.println("Element Deleted!!\n");
//        }
//    }
//    public void enqueue(Scanner sc)
//    {
//        if(f==(r+1)%a.length)
//        {
//            System.out.println("Overflow!\n");
//            return;
//        }
//        System.out.println("Enter a  element:");
//        int ele= sc.nextInt();
//        if(f==-1 && r==-1) {
//            f++;
//            r++;
//            a[f]=ele;
//        }
//        else {
//            r=(r+1)%a.length;
//            a[r]=ele;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//    public void display()
//    {
//        if(f==-1 && r==-1)
//        {
//            System.out.println("NO ELEMENT IN THE QUEUE!!\n");
//            return;
//        }
//        int i;
//        System.out.println("Queue Elements:");
//        for (i = f; i !=r ; i=(i+1)%a.length) {
//            System.out.println(a[i]);
//        }
//        System.out.println(a[i]+"\n");
//    }
//}
//public class ciircular_queue_array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        circular_queue s=new circular_queue();
//        boolean run=true;
//        System.out.println("WELCOME TO THE CIRCULAR QUEUE OPERATIONS");
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