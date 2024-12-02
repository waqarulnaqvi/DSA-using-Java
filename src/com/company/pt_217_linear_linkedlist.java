//import java.util.Scanner;
//
//public class pt_217_linear_linkedlist {
//    Node head=null;
//    class Node{
//        Node next;
//        int data;
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public void insert_bottom(Scanner sc){
//        System.out.println("Enter data:");
//        int data=sc.nextInt();
//        Node new_node=new Node(data);
//        if(head==null)
//        {
//            head=new_node;
//        }
//        else {
//            Node temp=head;
//            while(temp.next!=null)
//            {
//                temp=temp.next;
//            }
//            temp.next=new_node;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//    public void insert_top(Scanner sc){
//        System.out.println("Enter data:");
//        int data=sc.nextInt();
//        Node new_node=new Node(data);
//        if(head==null)
//        {
//            head=new_node;
//
//        }
//        else {
//            new_node.next=head;
//            head=new_node;
//        }
//        System.out.println("Element Inserted!!\n");
//    }
//    public void delete_top()
//    {
//        if(head==null)
//        {
//            System.out.println("Linkedlist is empty!!\n");
//        }
//        else {
//            head=head.next;
//            System.out.println("Element Deleted!!\n");
//        }
//    }
//    public void delete_bottom()
//    {
//        if(head==null)
//        {
//            System.out.println("Linkedlist is empty!!\n");
//        }
//        else {
//            System.out.println("Element Deleted!!\n");
//            if(head.next==null)
//            {
//                head=null;
//                return;
//            }
//        Node temp=head;
//        Node ptr=temp.next;
//        while (ptr.next!=null)
//        {
//            temp=ptr;
//           ptr=ptr.next;
////            temp=temp.next;
//        }
//        temp.next=null;
//        }
//    }
//    public void display()
//    {
//        System.out.println("LINEAR LINKED LIST ELEMENTS:");
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        linear_linkedlist s=new linear_linkedlist();
//        boolean run=true;
//        System.out.println("WELCOME TO THE LINEAR LINKED LIST OPERATIONS");
//        while (run) {
//            System.out.println("1 for insert from the top\n2 for insert from the bottom\n3 for delete from the top \n4 for delete from the bottom\n5 for display\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> s.insert_top(sc);
//                case 2 ->s.insert_bottom(sc);
//                case 3 -> s.delete_top();
//                case 4 -> s.delete_bottom();
//                case 5 -> s.display();
//                default -> {
//                    System.out.println("Breaking from the loop!!");
//                    run=false;
//                }
//            }
//        }
//    }
//}











//class Node {
//    public static Node head;
//    String data;
//    Node next;
//
//    public Node(String data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    //add first,last
//    public void addFirst(String data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//    public void addLast(String data)
//    {
//        Node newNode=new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node currNode = head;
//        while (currNode.next!=null)
//        {
//            currNode=currNode.next;
//        }
//    }
//}