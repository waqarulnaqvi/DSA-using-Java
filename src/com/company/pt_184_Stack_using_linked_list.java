//import java.util.Scanner;
//
//public class Stack_using_linked_list {
//    Node top=null;
//    static class Node{
//        Node next;
//        int data;
//
//        public Node(int data) {
//            this.data = data;
//            this.next=null;
//        }
//    }
//
//    public void push(Scanner sc){
//        System.out.println("Enter Element:");
//        int ele=sc.nextInt();
//        Node new_node=new Node(ele);
//        if(top==null) {
//            top = new_node;
//        }
//        else {
//          new_node.next=top;
//          top=new_node;
//        }
//        System.out.println("Element Inserted!!\n");
//
//    }
//    public void pop()
//    {
//        if(top==null)
//        {
//            System.out.println("Underflow!!\n");
//        }
//        else {
//            top=top.next;
//            System.out.println("Element Deleted!!\n");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("WELCOME TO THE STACK OPERATIONS");
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