//import java.util.Scanner;
//public class circular_queue_using_linkedlist {
//   Node f=null;
//   Node r=null;
//    class Node{
//        Node next;
//        int data;
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//
//    public void enqueue(Scanner sc)
//    {
//        System.out.println("Enter a number:");
//        int data=sc.nextInt();
//         Node new_node=new Node(data);
//        if(f==null)
//        {
//            f=new_node;
//            r=new_node;
////            r.next=f;
//        }
//        else {
//          r.next=new_node;
//          r=new_node;
//          new_node.next=f;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//    public void dequeue()
//    {
//        if(f==null)
//        {
//            System.out.println("Underflow!!\n");
//        }
//        else if(f==r)
//        {
//            System.out.println("Element Deleted!!\n");
//            f=r=null;
//        }
//        else {
//
//            f=f.next;
//            r.next=f;
//            System.out.println("Element Deleted!!\n");
//        }
//    }
//    public void display()
//    {
//        if (f==null)
//        {
//            System.out.println("No Element in the Queue!!\n");
//            return;
//        }
//        System.out.println("Queue Elements:");
//        Node temp=f;
//        while (temp.next!=f)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        System.out.println(temp.data);
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       circular_queue_using_linkedlist s=new circular_queue_using_linkedlist();
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
