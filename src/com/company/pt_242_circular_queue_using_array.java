import java.util.Scanner;
class CirularQ{
    int f=-1,r=-1,s=0;
    int a[]=new int[5];
    public void enqueue(Scanner sc) {

        if (f == (r + 1) % a.length) {
            System.out.println("Overflow!!\n");
            return;
        }
        System.out.println("Enter a Element:");
        int ele = sc.nextInt();
        s++;
        if (f == -1 && r == -1) {
            r++;
            f++;
            a[r] = ele;
        } else {
            r=(r+1)%a.length;
            a[r]=ele;
        }
        System.out.println("Element Inserted in the CircularQ!!\n");
    }

    public void dequeue()
    {
    if(f==-1 && r==-1){
        System.out.println("Underflow!!\n");

    } else if (f==r) {
        System.out.println("Element Deleted from the CircularQ!!\n");
        f=r=-1;
        s--;
    }
    else{
        f=(f+1)%a.length;
        System.out.println("Element Deleted from the CircularQ!!\n");
        s--;

    }
    }
    public void display()
    {
                if(f==-1&&r==-1) {
                    System.out.println("NO ELEMENT IN THE QUEUE!!\n");
                    return;
                }

        System.out.println("CircularQ Elements:");
        int i;
        for (i = f; i !=r ; i=(i+1)%a.length) {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[i]);
        System.out.println();
    }
}

public class pt_242_circular_queue_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CirularQ s=new CirularQ();
        boolean run=true;
        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
        while (run) {
            System.out.println("1 for enqueue\n2 for dequeue\n3 for display\n4 for size\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueue(sc);
                case 2 -> s.dequeue();
                case 3 -> s.display();
                case 4 ->{
                    System.out.println("Current size of the CircularQ :"+s.s);
                }
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run=false;
                }
            }
        }
    }
}
