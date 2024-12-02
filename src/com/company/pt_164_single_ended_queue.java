package com.company;

import java.util.Scanner;

public class pt_164_single_ended_queue {
    Node front=null;
    Node rear=null;
    private int size=0;
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
//            size++;
        }
    }
    public void enqueue(Scanner sc)
    {
        System.out.println("Enter data:");
        int data=sc.nextInt();
        System.out.println("Element Inserted!!\n");
        Node new_node= new Node(data);
        size++;
        if(front==null)
        {
            front=new_node;
            rear=new_node;
        }
        else {
            rear.next = new_node;
            rear=new_node;
        }
    }
    public void dequeue()
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
    public void peek()
    {
        Node front1=front;
        if(front1==null )
        {
            System.out.println("NO ELEMENT IN THE QUEUE!!\n");
        return;
        }
      //Method:1
        System.out.println("QUEUE ELEMENTS:");

        Node rear1=rear;
       while(front1!=rear1)
       {
           System.out.println(front1.data);
        front1=front1.next;
        }
        System.out.println(front1.data);
        System.out.println();

//     Method:2
        System.out.println("QUEUE ELEMENTS:");
       Node temp=front;
       while(temp!=null)
       {
           System.out.println(temp.data);
           temp=temp.next;
       }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pt_164_single_ended_queue s=new pt_164_single_ended_queue();
        int ex;
        do {
            System.out.println("Which operation do you wish to perform:");
            System.out.println("1)enqueue\n2)dequeue\n3)peek\n4)size of queue ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueue(sc);
                case 2 -> s.dequeue();
                case 3 -> s.peek();
                case 4 -> System.out.println("QUEUE SIZE :"+s.getSize()+"\n");
                default -> System.out.println("WRONG CHOICE!!");

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
