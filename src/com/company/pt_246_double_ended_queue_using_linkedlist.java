import java.util.Scanner;

public class pt_246_double_ended_queue_using_linkedlist {
//    240c
    int size=0;
    node f=null;
    node r=null;
    class node{
        int data;
        node next,prev;
        node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
            size++;
        }
}

public void enqueuefront(Scanner sc)
{
    System.out.println("Enter data:");
    int data=sc.nextInt();
    System.out.println("Element Inserted in the DQ!!\n");
    node newnode=new node(data);
    if(f==null && r==null)
    {
        f=newnode;
        r=newnode;
    }
    else {
        newnode.next=f;
        f.prev=newnode;
        f=newnode;
    }
}
public void enqueuerear(Scanner sc)
{

    System.out.println("Enter data:");
    int data=sc.nextInt();
    System.out.println("Element Inserted in the DQ!!\n");
    node newnode=new node(data);
    if(f==null && r==null)
    {
        f=newnode;
        r=newnode;
    }
    else
    {
        newnode.prev=r;
        r.next=newnode;
        r=newnode;
    }
}
public void dequeuefront()
{
    if(f==null && r==null)
    {
        System.out.println("Underflow!!\n");
    }
    else {
        f=f.next;
        if(f!=null) {
        f.prev=null;
        }
            System.out.println("Element Deleted from the DQ!!\n");
        if(f==null)
        {
            r=null;
        }
        size--;
    }
}
public void dequeuerear()
{
    if(f==null && r==null)
    {
        System.out.println("Underflow!!\n");
    }
    else {

        r=r.prev;
        if(r!=null) {
            r.next = null;
        }
        if (r==null)
        {
            f=null;
        }
        System.out.println("Element Deleted from the DQ!!\n");
        size--;
    }
}
public void display()
{
    if (f==null && r==null)
    {
        System.out.println("No Element in the Queue!!\n");
        return;
    }


    System.out.println("Queue Elements:");
 node f1=f;
    while(f1!=r)
    {
        System.out.println(f1.data);
        f1=f1.next;
    }
//        System.out.println(f1.data);//same
    System.out.println(r.data);//same
    System.out.println();

    System.out.println("Queue Elements:");
  node temp=f;
    while (temp.next!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println(temp.data);
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pt_246_double_ended_queue_using_linkedlist s = new pt_246_double_ended_queue_using_linkedlist();
        boolean run = true;
        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
        while (run) {
            System.out.println("1 for enqueue_front\n2 for enqueue_rear\n3 for dequeue_front\n4 for dequeue_rear\n5 for display\n6 for current size of DQ\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueuefront(sc);
                case 2 -> s.enqueuerear(sc);
                case 3 -> s.dequeuefront();
                case 4 -> s.dequeuerear();
                case 5 -> s.display();
                case 6 -> {
                    System.out.println("Current size of DQ: " + s.size+"\n");
                }
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run = false;
                }
            }
        }
    }
}

