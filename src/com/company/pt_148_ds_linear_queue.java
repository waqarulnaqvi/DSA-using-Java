package com.company;

import java.util.Scanner;
 class queue{
    int a[]=new int[4];
    int f=-1,r=-1;
    public void enqueue(Scanner scc)
    {
        if(r==a.length-1)
        {
            System.out.println("Overflow!!\n");
        }
        else {
            System.out.println("Enter data:");
            int data=scc.nextInt();
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
                a[r]=data;
            }
            else {
                r=r+1;
                a[r]=data;
            }
            System.out.println();
        }
    }
    public void dequeue()
    {
//        if(f==-1 && r==-1 || f==a.length)
        if(f==-1 && r==-1 )
        {
            System.out.println("Underflow!!\n");
        }
        else{
            f=f+1;
            System.out.println("Item deleted!!\n");
        }
    }
    public void display()
    {
        System.out.println("QUEUE ELEMENTS:");
        for (int i = f; i <=r ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n");
    }
}
public class pt_148_ds_linear_queue {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);
        boolean run = true;
        int d;
        queue q=new queue();
        while (run) {
            System.out.println("Enter 1 to enqueue");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to display");
            System.out.println("ENTER ANY OTHER KEY TO EXIT ");
            System.out.println("Enter your choice:");
            d = ssc.nextInt();
            switch (d) {
                case 1 -> q.enqueue(ssc);
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
