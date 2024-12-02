import java.util.Scanner;
class DQ{
    int f=-1,r=-1,size=0;
    int a[]=new int[5];
    public void enqueuefront(Scanner sc)
    {
        if(f==r+1 || (f==0 && r==a.length-1))
        {
            System.out.println("Overflow!!\n");
        }
        else {
            size++;
            System.out.println("Enter Element:");
            int ele=sc.nextInt();
            if(f==-1 && r==-1)
            {
                f++;
                r++;
                a[f]=ele;
            }
            else if(f==0)
            {
                f=a.length-1;
                a[f]=ele;
            }
            else{
                f=f-1;
                a[f]=ele;
            }
            System.out.println("Element Inserted in the Dqueue from the front!!\n");
        }
    }
    public void enqueuerear(Scanner sc)
    {
        if(f==r+1 || (f==0 && r==a.length-1))
        {
            System.out.println("Overflow!!\n");
        }
        else {
            size++;
            System.out.println("Enter Element:");
            int ele=sc.nextInt();
            if(f==-1 && r==-1)
            {
                f++;
                r++;
                a[f]=ele;
            }
            else if(r==a.length-1)
            {
                r=0;
                a[r]=ele;
            }
            else{
                r=r+1;
                a[r]=ele;
            }
            System.out.println("Element Inserted in the queue!!\n");
        }
    }

    public void dequeuerear()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Underflow!!\n");
       return;
        }
        size--;
       if(f==r) {
            System.out.println("Element Deleted from the queue from rear!!\n");
            r=f=-1;
        return;
        }
        else if(r==0) {
         r=a.length-1;
            System.out.println("Element Deleted from the queue from rear!!\n");
        }
        else {
            r=r-1;
            System.out.println("Element Deleted from the queue from rear!!\n");
        }
    }
    public void dequeuefront()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Underflow!!\n");
        return;
        }
        size--;
        if(f==r) {
            System.out.println("Element Deleted from the queue from front!!\n");
            r=f=-1;
        }
        else if(f==a.length-1) {
            f=0;
            System.out.println("Element Deleted from the queue from front!!\n");
        }
        else {
            f=f+1;
            System.out.println("Element Deleted from the queue from front!!\n");
        }
    }
    public void display()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("No Elements in the DQ!!\n");
            return;
        }
        System.out.println("DQ Elements:");
        int i;
        for (i = f; i !=r ; i=(i+1)%a.length) {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[i]+"\n");
    }

}
public class pt_243_double_ended_queue_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DQ s = new DQ();
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
