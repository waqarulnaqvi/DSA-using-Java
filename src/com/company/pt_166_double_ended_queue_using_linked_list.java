package com.company;
import java.util.Scanner;
public class pt_166_double_ended_queue_using_linked_list {
    static Node front=null;
    static Node rear=null;
    public static int size;
    static  class Node{
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    static class Double_queue{
        public void enqueue_front(Scanner sc)
        {
            System.out.println("Enter data:");
            int data=sc.nextInt();
            System.out.println("Element Inserted!!\n");
           Node new_node=new Node(data);
//        size++;
            if(front==null)
            {
                front=new_node;
                rear=new_node;
            }
            else {
                new_node.next=front;
                front=new_node;
            }
        }

        public void enqueue_rear(Scanner sc)
        {
            System.out.println("Enter data:");
            int data=sc.nextInt();
            System.out.println("Element Inserted!!\n");
            Node new_node=new Node(data);
//        size++;
            if(front==null)
            {
                front=new_node;
                rear=new_node;
            }
            else {
                rear.next=new_node;
                rear=new_node;
            }
        }
        public void dequeue_front()
        {
            if(front==null )
            {
                System.out.println("Underflow!!\n");
            }
             else {
                size--;
                front=front.next;
                System.out.println("Element Deleted!!\n");
            }
        }
        public void dequeue_rear()
        {
            if(front==null )
            {
                System.out.println("Underflow!!\n");
            }
            else {
                Node temp=front;
          while (temp.next!=rear)
          {
              temp=temp.next;
          }
          temp.next=null;
          rear=temp;
          size--;
          System.out.println("Element Deleted!!\n");
            }
        }
        public void peek()
        {

          Node front1=front;
            if(front1==null )
            {
                System.out.println("NO ELEMENT IN THE QUEUE!!\n");
                return;
            }
            System.out.println("QUEUE ELEMENTS:");
          Node rear1=rear;
            while(front1!=rear1)
            {
                System.out.println(front1.data);
                front1=front1.next;
            }
            System.out.println(front1.data);
            System.out.println();


        }
        public int getSize() {
            return size;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Double_queue s=new   Double_queue ();
        int ex;
        do {
            System.out.println("Which operation do you wish to perform:");
            System.out.println("1)enqueue_front\n2)enqueue_rear\n3)dequeue_front\n4)dequeue_rear\n5)peek\n6)size of queue ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueue_front(sc);
                case 2 -> s.enqueue_rear(sc);
                case 3 ->s.dequeue_front();
                case 4 ->s.dequeue_rear();
                case 5 -> s.peek();
                case 6 -> System.out.println("QUEUE SIZE :"+s.getSize()+"\n");
                default -> {
                    System.out.println("WRONG CHOICE!!");
                }
            }
            System.out.println("If you wish to exit press 0");
            ex = sc.nextInt();
        }
        while (ex != 0);
        {
            System.out.println("EXIT SUCCESSFULLY!!");
        }
    }
}

