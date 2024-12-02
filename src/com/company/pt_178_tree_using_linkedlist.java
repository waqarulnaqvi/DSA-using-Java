package com.company;

import java.util.Scanner;

public class pt_178_tree_using_linkedlist {

    Scanner sc;
    node root=null;
//     node left=null;
//   node right=null;
    pt_178_tree_using_linkedlist(Scanner sc)
    {
        this.sc=sc;
    }
    static class node{
        //    14 55
        node left;
        int data;
        node right;

        node(int data)
        {
            this.left=null;
            this.data=data;
            this.right=null;
        }
    }

 static class BinaryTree
    {
        static int indx=-1;
        public static node buildTree(int nodes [])
        {
            indx++;
            if(nodes[indx]==-1)
            {
                return null;
            }
            node newNode=new node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
    }
//    public void insertelement()
//    {
//        System.out.println("Enter Element:");
//        int data=sc.nextInt();
//        tree newnode=new tree(data);
//        if(root==null)
//        {
//            root=newnode;
//       left=newnode;
//       right=newnode;
//        }
//        System.out.println("1)leftchild\n2)rightchild\n");
//        int ele=sc.nextInt();
//        switch (ele) {
//            case 1 ->{
//                left.prev=newnode;
//                left=newnode;
//            }
//            case 2 ->{
//                right.next=newnode;
//                right=newnode;
//            }
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int nodes[]={1,2,4,23,2,4,3234,23224,3,223,1,2,1,2,1,2,1,2,1,2,1,2,1,2,2};
BinaryTree tree=new BinaryTree();
node root=tree.buildTree(nodes);
        System.out.println(root.data);
        //        DQ s = new DQ();
//        boolean run = true;
//        System.out.println("WELCOME TO THE LINEAR QUEUE OPERATIONS");
//        while (run) {
//            System.out.println("1 for enqueue_front\n2 for enqueue_rear\n3 for dequeue_front\n4 for dequeue_rear\n5 for display\n6 for current size of DQ\nPRESS ANY KEY TO BREAKING FROM THE LOOP!!");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> s.enqueuefront(sc);
//                case 2 -> s.enqueuerear(sc);
//                case 3 -> s.dequeuefront();
//                case 4 -> s.dequeuerear();
//                case 5 -> s.display();
//                case 6 -> {
//                    System.out.println("Current size of DQ: " + s.size+"\n");
//                }
//                default -> {
//                    System.out.println("Breaking from the loop!!");
//                    run = false;
//                }
//            }
//        }
    }
}
