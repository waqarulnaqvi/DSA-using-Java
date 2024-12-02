//import java.util.Scanner;
//
//public class linkedlist_using_liinear_queue {
//    Node f=null;
//    Node r=null;
//    private int size=0;
//
//    class Node{
//        Node next;
//        int data;
//
//        public Node(int data) {
//            this.data = data;
//            this.next=null;
//            size++;
//        }
//    }
//    public void enqueue(Scanner sc)
//    {
//        System.out.println("Enter Element:");
//        int data=sc.nextInt();
//        Node new_node=new Node(data);
//        if(f==null)
//        {
//            f=new_node;
//            r=new_node;
//        }
//        else {
//            r.next=new_node;
//            r=new_node;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//
//    public void dequeue()
//    {
//        if(f==null)
//        {
//            System.out.println("Underflow!!\n");
//        }
//        else {
//            f=f.next;
//            size--;
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
//        Node f1=f;
//        while(f1!=r)
//        {
//            System.out.println(f1.data);
//          f1=f1.next;
//        }
////        System.out.println(f1.data);//same
//        System.out.println(r.data);//same
//        System.out.println();
//
//        System.out.println("Queue Elements:");
//        Node temp=f;
//        while(temp!=null)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//    public void size()
//    {
//        System.out.println("Current size of queue is "+size+"\n");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        linkedlist_using_liinear_queue s=new linkedlist_using_liinear_queue();
//        boolean run=true;
//        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
//        while (run) {
//            System.out.println("1 for enqueue\n2 for dequeue\n3 for display\n4 for queue size\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> s.enqueue(sc);
//                case 2 -> s.dequeue();
//                case 3 -> s.display();
//                case 4 ->s.size();
//                default -> {
//                    System.out.println("Breaking from the loop!!");
//                    run=false;
//                }
//            }
//        }
//    }
//}