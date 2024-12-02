
import  java.util.Scanner;
class double_ended_queue_using_array {
    int a[]=new int[4];
    int f=-1,r=-1;
    public void dequeuefront()
    {
        if(f==-1 && r==-1 )
        {
            System.out.println("Underflow!!\n");
        }
        else if(f==r)
        {
            System.out.println("Underflow!!\n");
            f=-1;
            r=-1;
        }
        else if(f==a.length-1)
        {
            f=0;
            System.out.println("Element Deleted!!\n");
        }
        else {
            f++;
            System.out.println("Element Deleted!!\n");
        }
    }
    public void dequeuerear()
    {
        if(f==-1 && r==-1 )
        {
            System.out.println("Underflow!!\n");
        }
        else if(f==r)
        {
            System.out.println("Underflow!!\n");
          f=r=-1;
        }
        else if(r==0) {
          r=a.length-1;
            System.out.println("Element Deleted!!\n");
        }
        else {
            r=r-1;
            System.out.println("Element Deleted!!\n");
        }
    }
    public void enqueuefront(Scanner sc) {
        if (f == r + 1 || (f == 0 && r == a.length - 1)) {
            System.out.println("Overflow!!\n");
        } else {
            System.out.println("Enter a  element:");
            int ele = sc.nextInt();
            if (f == -1 && r == -1) {
                f++;
                r++;
                a[f] = ele;
            } else if (f==0) {
                f=a.length-1;
                a[f] = ele;
            } else {
                f=f-1;
                a[f] = ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void enqueuerear(Scanner sc) {
        if (f == r + 1 || (f == 0 && r == a.length - 1)) {
            System.out.println("Overflow!!\n");
        } else {
            System.out.println("Enter a  element:");
            int ele = sc.nextInt();
            if (f == -1 && r == -1) {
                f++;
                r++;
                a[f] = ele;
            } else if (r == a.length - 1) {
                r = 0;
                a[r] = ele;
            } else {
                r = r + 1;
                a[r] = ele;
            }
            System.out.println("Element Inserted!!\n");
        }
    }
    public void display()
    {
        int i;
        System.out.println("Queue Elements:");
        for (i = f; i !=r ; i=(i+1)%a.length) {
            System.out.println(a[i]);
        }
        System.out.println(a[i]+"\n");
    }
}
public class pt_193_double_ended_queue_using_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double_ended_queue_using_array  s=new double_ended_queue_using_array ();
        boolean run=true;
        System.out.println("WELCOME TO THE D QUEUE OPERATIONS");
        while (run) {
            System.out.println("1 for enqueue_front\n2 for enqueue_rear\n3 for dequeue_front\n4 for dequeue_rear\n5 for display\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueuefront(sc);
                case 2 ->s.enqueuerear(sc);
                case 3 -> s.dequeuefront();
                case 4 -> s.dequeuerear();
                case 5 -> s.display();
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run=false;
                }
            }
        }
    }
}