package com.company;

import java.util.Scanner;
class queue2{
    Scanner sc;
    int f=-1,r=-1;
    float a[]=new  float[4];
    queue2(Scanner sc)
    {
        this.sc=sc;
    }
    public void enqueue()
    {
        if(f==(r+1)%a.length)
        {
            System.out.println("Overflow!!\n");
        }
        else {
            System.out.println("Enter element you wish to insert:");
            float ele =sc.nextFloat();
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
                a[r]=ele;
            }
            else {
                r=(r+1)%a.length;
                a[r]=ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void dequeue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("CIRCULAR QUEUE UNDERFLOW!!\n");
        }
        else if (f==r) {
            System.out.println("CIRCULAR QUEUE UNDERFLOW!!\n");
        }
        else {
            f=(f+1)%a.length;
            System.out.println("Element Deleted!!\n");
        }
    }

    public void display()
    {
        System.out.println("Circular Queue Elements:");
        int i;
        for ( i = f; i !=r ; i=(i+1)%a.length) {
            System.out.println(a[i]);
        }
        System.out.println(a[i]);
        System.out.println("\n");
    }
}
public class pt_158_circular_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean run = true;
        int d;
        queue2 q=new queue2(sc);
        while (run) {
            System.out.println("Enter 1 to enqueue");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to display");
            System.out.println("ENTER ANY OTHER KEY TO EXIT ");
            System.out.println("Enter your choice:");
            d = sc.nextInt();
            switch (d) {
                case 1 -> q.enqueue();
                case 2 -> q.dequeue();
                case 3 -> q.display();
                default -> {
                    run = false;
                    System.out.println("EXIT SUCCESSFULLY!!");
                }
            }
        }
    }
}