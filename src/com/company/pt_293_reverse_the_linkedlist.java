package com.company;

public class pt_293_reverse_the_linkedlist {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    ListNode top;
    public void push(int data)
    {
        ListNode stack=new ListNode(data);
        if (top==null) {
            top = stack;
        }
        else {
            top.next=stack;
            top=stack;
        }
    }

    public ListNode topvalue()
    {
        top=top.next;

        return top;

    }
    public static void Output(ListNode head) {

        while(head!=null)
        {
            System.out.println("head :"+head.val);
            head=head.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
       ListNode node=new ListNode(5);
       ListNode node2=new ListNode(4,node);
       ListNode node3=new ListNode(3,node2);
       ListNode node4=new ListNode(2,node3);
       ListNode head=new ListNode(1,node4);

       pt_293_reverse_the_linkedlist obj=new pt_293_reverse_the_linkedlist();


        Output(head);
        //Brute force approach:
//       ListNode temp=head;
//       while (temp!=null)
//       {
//           obj.push(temp.val);
//           temp=temp.next;
//       }
//
//        temp=head;
//        while (temp!=null)
//        {
//            head= obj.topvalue();
//            head=head.next;
//            temp=temp.next;
//        }
//
//        Output(head);

//        Optimal Solution:

        ListNode temp=head;
        ListNode front=null;

        ListNode prev=null;
        while(temp!=null)
        {
          front=temp.next;
          temp.next=prev;
          prev=temp;
          temp=front;
        }

        Output(prev);
    }
}
