package com.company;
import java.util.Scanner;
public class pt_161_singly_linkedlist {
    Node head;
    private int size;
    pt_161_singly_linkedlist()
    {
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    //add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;//storing address in the head..
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;//storing head address in the current Node..
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //delete first
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty!!");
            return;
        }
        head=head.next;
        size--;
    }
    //delete last
    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("The list is empty!!");
        return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
//            size--;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
//        size--;
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("LINKED LIST IS EMPTY!!");
            return;
        }
        Node currNode=head;//storing head address in the current Node..
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode =currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pt_161_singly_linkedlist ll =new pt_161_singly_linkedlist();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("waqarul");
        ll.addLast("naqvi");
        ll.printList();
        System.out.println("Size is :"+ll.getSize());


        ll.addFirst("male");
        ll.addFirst("alpha");
        ll.printList();
        System.out.println("Size is :"+ll.getSize());

        ll.deletefirst();
        ll.printList();
        System.out.println("Size is :"+ll.getSize());

        ll.deletelast();
        ll.printList();
        System.out.println("Size is :"+ll.getSize());

        ll.deletelast();
        System.out.println("Size is :"+ll.getSize());

        ll.deletelast();
        System.out.println("Size is :"+ll.getSize());

        ll.deletelast();
        System.out.println("Size is :"+ll.getSize());

        ll.deletelast();
        System.out.println("Size is :"+ll.getSize());

    }
}
