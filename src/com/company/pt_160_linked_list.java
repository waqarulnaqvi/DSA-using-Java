package com.company;
import java.util.Scanner;
public class pt_160_linked_list {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
    public void creation(Scanner sc) {
        int data, n;
        do {
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("do you want to continue if yes enter 1:");
            n = sc.nextInt();
        }
        while (n==1);
    }
    public  void traverser()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("linkedlist does not exists");
        }
        else {
            {
                while(temp!=null)
                {
                    System.out.println(temp.data);
                temp=temp.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    pt_160_linked_list ob =new pt_160_linked_list();
    ob.creation(sc);
    ob.traverser();
    }
}
