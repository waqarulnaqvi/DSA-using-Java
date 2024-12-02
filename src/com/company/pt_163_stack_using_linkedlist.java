package com.company;

import java.util.Scanner;

public class pt_163_stack_using_linkedlist {
    private int size = 0;
    Node top;

   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
//        size++;        }
        }
    }

    public int getSize() {
        return size;
    }
    public void push(Scanner sc) {
        size++;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        Node new_data = new Node(data);
        System.out.println("Element Inserted!\n");
        if (top == null) {
            top = new_data;
            return;
        }
//        new_data.next = top;
//        top = new_data;
    Node curr=top;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=new_data;

    }

    public void pop() {
        if (top == null) {
            System.out.println("STACK IS EMPTY!!\n");
            return;
        }
        size--;
        if (top.next == null) {
            top = null;
            System.out.println("Element deleted!\n");
            return;
        }
        Node second_last = top;
        Node last = top.next;
        while (last.next != null) {
            second_last = second_last.next;
            last = last.next;
        }
        second_last.next = null;
        System.out.println("Element Deleted!\n");
    }

    public void peek() {
        Node  curr = top;
        if(curr==null)
        {
            System.out.println("STACK IS EMPTY!!\n");
            return;
        }
        System.out.println("STACK Elements:");

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//     pt_163_stack_using_linkedlist ll[]=new pt_163_stack_using_linkedlist[5];
        pt_163_stack_using_linkedlist s = new pt_163_stack_using_linkedlist();

        int ex;
        do {
            System.out.println("Which operation do you wish to perform:");
            System.out.println("1)push\n2)pop\n3)peek\n4)size of stack ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.push(sc);
                case 2 -> s.pop();
                case 3 -> s.peek();
                case 4 -> System.out.println("STACK SIZE :"+s.getSize()+"\n");
                default -> {
                    System.out.println("WRONG CHOICE!!");
                }
            }
            System.out.println("If you wish to exit press 0");
            ex = sc.nextInt();
        }
        while (ex != 0);
         {
            System.out.println("EXIT SUCCESSFULLY!!");
        }
//        System.out.println("EXIT SUCCESSFULLY!!");
    }
}

