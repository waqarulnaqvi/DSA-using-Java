
//1 h 14 min

import java.util.Scanner;
//12 39
//1 54

//10 19
class MyStack {
    int a[];
    int f=-1,r=-1;
    Scanner sc;
    public MyStack() {
        this.a=new int[5];
    }

    public void push(int x) {
        if(f==0 && r==a.length-1)
        {
            System.out.println("Overflow!!\n");
        }
        else if(f==-1){
            r++;
            f++;
            a[f]=x;
            a[r]=x;
            System.out.println("Element Inserted!!\n");
        }
        else {
            r++;
            while (f!=r)
            {
                int t=a[f+1];
                a[f+1]=a[f];
                a[f]=t;
                f++;
            }
            f=0;
            a[f]=x;
            System.out.println("Element Inserted!!\n");
        }
    }

    public int pop() {
        if(f==-1 && r==-1)
        {
            System.out.println("Underflow!!\n");

        }
        else if(f==r)
        {
            f=-1;
            r=-1;
            return a[r+1];
        }
        r--;
        return a[r+1];
    }

    public int top() {
     return a[f];
    }

    public boolean empty() {
     return false;
    }



    public void display()
    {
        System.out.println("Stack Elements:");
        for (int i = f; i <=r ; i++) {
            System.out.println(a[f]);

        }
    }
}
public class pt_258_implement_stack_using_queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STACK OPERATIONS");
        MyStack s = new MyStack();
        boolean run = true;
        while (run) {
            System.out.println("1 for push\n2 for pop \n3 for display\n4 for peek \nPRESS ANY KEY TO BREAKING FROM THE LOOP!! ");
            int n = sc.nextInt();
            switch (n) {

                case 1 -> {
                    System.out.println("Enter an Element:");
                    int ele= sc.nextInt();
                    s.push(ele);
                }
                case 2 -> s.pop();
                case 3 -> s.display();
                case 4 -> {
                    System.out.println("STACK TOP :" + s.top() + "\n");
                }
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run = false;
                }
            }
        }
    }
}
