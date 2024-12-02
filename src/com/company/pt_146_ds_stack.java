package com.company;


//import java.util.*;//don't use it when you are using professional program because it increase the size of the program by importing unused packages which is not a good practice..

import java.util.Scanner;
import java.util.Stack;

public class pt_146_ds_stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnode = new Node(data);
            System.out.println("Element Inserted!!\n");
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
     Stack s=new Stack();
        s.push(3);
        s.push(4);
        s.push(21);
        s.push(1);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
