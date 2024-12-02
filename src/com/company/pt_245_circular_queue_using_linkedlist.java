import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class pt_245_circular_queue_using_linkedlist {
Node f=null;
Node r=null;
private int size=0;
    class Node{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        size++;
    }
}

public void enqueue(Scanner sc)
{
    System.out.println("Enter Element:");
    int ele=sc.nextInt();
   Node nextnode=new Node(ele);
    if(f==null && r==null)
    {
        f=nextnode;
        r=nextnode;
        nextnode.next=f;
    }
    else {
        r.next=nextnode;
        r=nextnode;
        nextnode.next=f;
    }
}
public void dequeue()
{
    if(f==null && r==null) {
        System.out.println("Underflow!!\n");
    }
    else if(f==r)
    {
        System.out.println("Element Deleted from the CircularQ!!\n");
        f=r=null;
        size--;
    }
    else {
        f=f.next;
        r.next=f;
        System.out.println("Element Deleted from the CircularQ!!\n");
        size--;
    }
//23 14 24 26
}
    public void display()
    {
        if (f==null && r==null)
        {
            System.out.println("No Element in the Queue!!\n");
            return;
        }


        System.out.println("Queue Elements:");
        Node f1=f;
        while(f1!=r)
        {
            System.out.println(f1.data);
            f1=f1.next;
        }
//        System.out.println(f1.data);//same
        System.out.println(r.data);//same
        System.out.println();


        System.out.println("Queue Elements:");
        Node temp=f;
        while (f!=temp.next)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
        System.out.println();


        System.out.println("Queue Elements:");
        Node temp1=f;
        Node temp2=f;
        while(temp2!=temp1.next)
        {
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
        System.out.println(temp1.data);
        System.out.println();
    }

    public void size()
    {
        System.out.println("Current size of Queue is :"+size);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pt_245_circular_queue_using_linkedlist s=new  pt_245_circular_queue_using_linkedlist();
        boolean run=true;
        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
        while (run) {
            System.out.println("1 for enqueue\n2 for dequeue\n3 for display\n4 for queue size\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueue(sc);
                case 2 -> s.dequeue();
                case 3 -> s.display();
                case 4 ->s.size();
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run=false;
                }
            }
        }
    }
}