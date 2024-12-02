package com.company;

import java.util.Scanner;
class queue1{
    Scanner sc;
    int f=-1,r=-1;
    float a[]=new  float[4];
    queue1(Scanner sc)
    {
        this.sc=sc;
    }
    public void enqueue()
    {
        if(r==a.length-1)
        {
            System.out.println("LINEAR QUEUE OVERFLOW!!\n");
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
                r++;
                a[r]=ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void dequeue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("LINEAR QUEUE UNDERFLOW!!\n");
        }
        else if (f==a.length) {
            System.out.println("NOTHING TO DELETE!!\n");
        }
         else {
            f++;
            System.out.println("Element Deleted!!\n");
        }
    }

    public void display()
    {
        System.out.println("Linear Queue Elements:");
        for (int i = f; i <=r ; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }
}
public class pt_157_linear_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean run = true;
        int d;
        queue1 q=new queue1(sc);
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
