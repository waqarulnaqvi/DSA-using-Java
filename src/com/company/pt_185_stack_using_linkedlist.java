//import java.util.Scanner;
//
//public class stack_using_linkedlist {
//    Node top = null;
//    class Node {
//
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//        public void push(Scanner sc)
//        {
//
//            System.out.println("Enter a data:");
//            int data =sc.nextInt();
//            Node new_node=new Node(data);
//            if(top==null)
//            {
//                top=new_node;
//            }
//            else {
//                new_node.next=top;
//                top=new_node;
//            }
//            System.out.println("Element Inserted!!\n");
//
//        }
//        public void pop()
//        {
//            if(top==null)
//            {
//                System.out.println("Underflow!!\n");
//            }
//            else {
//                top=top.next;
//                System.out.println("Element Deleted!!\n");
//            }
//        }
//        public void display()
//        {
//            System.out.println("Stack elements:");
//            Node temp=top;
//            while (temp!=null)
//            {
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//            System.out.println();
//        }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("WELCOME TO THE STACK OPERATIONS");2
//        stack_using_linkedlist s=new stack_using_linkedlist();
//        boolean run=true;
//        while (run) {
//            System.out.println("1 for push\n2 for pop \n3 for display\n PRESS ANY KEY TO BREAKING FROM THE LOOP!! ");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> s.push(sc);
//                case 2 -> s.pop();
//                case 3 -> s.display();
//                default -> {
//                    System.out.println("Breaking from the loop!!");
//                    run=false;
//                }
//            }
//        }
//    }
//}