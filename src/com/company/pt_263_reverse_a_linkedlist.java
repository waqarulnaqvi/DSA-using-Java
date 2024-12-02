public class pt_263_reverse_a_linkedlist {

    static class node{
        node next;
        int data;

        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static int index=-1;
    public static node data(int a[])
    {
        index++;
        node newnode=new node(a[index]);

//        Method :1
//        if(index==a.length-1)
//        {
////            newnode.next=null;
//            return newnode;
//        }
//        else {
//          newnode.next=data(a);
//            return newnode;
//        }

//Method :2
        if(index!=a.length-1)
        {
            newnode.next=data(a);

        }
        return newnode;
    }

    public static node display(node top)
    {
        if(top==null)
        {
            return null;
        }
        else {
            System.out.print(top.data+" ");
            return display(top.next);
        }
    }
    public static void reversedisplay(node top)
    {
        if(top.next==null)
        {
            return;
        }
        else {
            display(top.next);
            System.out.print(top.data+" ");
        }
    }
//    Reverse a Linked List
//    Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.
//
//            Examples:
//
//    Input Format:
//    head = [3,6,8,10]
//    This means the given linked list is 3->6->8->10 with head pointer at node 3.
//
//    Result:
//    Output = [10,6,8,3]
//    This means, after reversal, the list should be 10->6->8->3 with the head pointer at node 10.
//17 39
    public static void main(String[] args) {
        int a[]={3,6,8,10};
        node top=data(a);
//        System.out.println(top.data);
//        System.out.println(top.next.data);
//        System.out.println(top.next.next.data);
//        System.out.println(top.next.next.next.data);

  display(top);
        System.out.println();
  reversedisplay(top);
    }
}
