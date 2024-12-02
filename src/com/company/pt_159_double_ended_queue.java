package com.company;
//Double ended queue have the property of both stack and queue i.e. LIFO and FIFO property..
//there are 2 types of double ended queue:
//1)input restricted queue :insertion can be allowed only from one end only and deletion can be allowed from both end..
//2)output restricted queue :deletion can be allowed only from one end only and insertion can be allowed from both end..
//double ended queue have the application of both stack and queue:
//1)it can be used to perform both undo and redo operation..
//2)dequeue can be used as a palindrome checker means it you read string from front and if you read string from rear than it would be same..
//it is used in multi-process scheduling..(this complete process is known as A-steal Algorithm for job scheduling)..
import java.util.Scanner;
class Double_ended_queue{
    Scanner sc;
    float a[]=new float[5];
    int f=-1,r=-1;
    Double_ended_queue(Scanner sc)
    {
        this.sc=sc;
    }
    public void dequeue_from_front()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("DOUBLE ENDED QUEUE QUEUE UNDERFLOW!!\n");
        }
        else if (f==r) {
            System.out.println("DOUBLE ENDED QUEUE UNDERFLOW!!\n");
            f=r=-1;
        }
        else if(f==a.length-1) {
            f=0;
            System.out.println("Element deleted!!\n");
        }
        else {
            f++;
            System.out.println("Element deleted!!\n");
        }
    }
    public void dequeue_from_rear()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("DOUBLE ENDED QUEUE QUEUE UNDERFLOW!!\n");
        }
        else if (f==r) {
            System.out.println("DOUBLE ENDED QUEUE UNDERFLOW!!\n");
            f=r=-1;
        }
        else if(r==0)
        {
            r=a.length-1;
            System.out.println("Element deleted!!\n");
        }
        else {
            r--;
            System.out.println("Element deleted!!\n");
        }
    }
    public void enqueue_from_front()
    {
        if((f==(r+1))||(f==0 && r==a.length-1))
        {
            System.out.println("Overflow!!\n");
        }
        else{
            System.out.println("Insert Element:");
            float ele =sc.nextFloat();
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
                a[f]=ele;
            }
            else if(f==0){
                f=a.length-1;
                a[f]=ele;
            }
            else {
                f=f-1;
                a[f]=ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void enqueue_from_rear()
    {
        if((f==r+1)||(f==0 && r==a.length-1))
        {
            System.out.println("Overflow!!\n");
        }
        else{
            System.out.println("Insert Element:");
            float ele =sc.nextFloat();
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
                a[r]=ele;
            }
            else if(r==a.length-1)
            {
                r=0;
                a[r]=ele;
            }
            else {
                r=r+1;
                a[r]=ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void display()
    {
        System.out.println("DOUBLE-ENDED QUEUE ELEMENTS:");
        int i;
        for ( i = f; i !=r ; i=(i+1)%a.length) {
            System.out.println(a[i]);
        }
        System.out.println(a[i]);
        System.out.println();
    }
}
public class pt_159_double_ended_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean run = true;
        int d;
        Double_ended_queue q=new Double_ended_queue(sc);
        while (run) {
            System.out.println("Enter 1 to enqueue from front");
            System.out.println("Enter 2 to enqueue from rear");
            System.out.println("Enter 3 to dequeue from front");
            System.out.println("Enter 4 to dequeue from rear");
            System.out.println("Enter 5 to display");
            System.out.println("ENTER ANY OTHER KEY TO EXIT ");
            System.out.println("Enter your choice:");
            d = sc.nextInt();
            switch (d) {
                case 1 -> q.enqueue_from_front();
                case 2 -> q.enqueue_from_rear();
                case 3 -> q.dequeue_from_front();
                case 4 -> q.dequeue_from_rear();
                case 5 -> q.display();
                default -> {
                    run = false;
                    System.out.println("EXIT SUCCESSFULLY!!");
                }
            }
        }
    }
}