import java.util.Scanner;
public class pt_240_stack_using_linkedlist {
    Node top=null;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void push(Scanner sc)
    {
        System.out.println("Enter Element:");
        int ele=sc.nextInt();
        Node new_node=new Node(ele);
        if (top==null)
        {
            top=new_node;
        }
        else {
            new_node.next=top;
            top=new_node;
            System.out.println("Element Inserted in the stack!!\n");
        }
    }
    public void pop()
    {
        if (top==null)
        {
            System.out.println("Stack is Empty!!");
        }
        else {
            top=top.next;
            System.out.println("Element Deleted from the stack!!\n");
        }
    }
    public void display() {
        System.out.println("Stack Elements:");
        Node temp = top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public int  peek()
    {
        if(top==null)
        {
            return -1;
        }
        else {
            return top.data;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STACK OPERATIONS");
      pt_240_stack_using_linkedlist s=new pt_240_stack_using_linkedlist();
        boolean run = true;
        while (run) {
            System.out.println("1 for push\n2 for pop \n3 for display\n4 for peek \nPRESS ANY KEY TO BREAKING FROM THE LOOP!! ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.push(sc);
                case 2 -> s.pop();
                case 3 -> s.display();
                case 4 -> {
                    System.out.println("STACK TOP :" + s.peek() + "\n");
                }
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run = false;
                }
            }
        }
    }
}
