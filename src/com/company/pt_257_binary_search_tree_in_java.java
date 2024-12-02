package com.company;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;

public class pt_257_binary_search_tree_in_java {
//23 14 to 24 34
    static class Node{
        //successful
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
//            this.left=null;      this.right=null;//by default null
        }
}

public static Node insert(Node root,int val)
    {//successful
        //time complexity of inserting a node is O(height) or O(log n)
        if(root == null)
        {
            root=new Node(val);
        }
        else if (root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else if (root.data<val)
        {
            root.right=insert(root.right,val);
        }
        return root;
    }

public static void inorder(Node root)
{//successful
if (root==null)
{
    return;
}
    inorder(root.left);
    System.out.print(root.data+"  ");
    inorder(root.right);
}

public static void preorder(Node root)
{//successful
if (root==null)
{
    return;
}
    System.out.print(root.data+"  ");
    preorder(root.left);
    preorder(root.right);
}

public static void postorder(Node root)
{//successful
if (root==null)
{
    return;
}
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+"  ");
}


    public static boolean search(Node root,int data)
    {//successful
        if(root==null)
        {
            return false;
        } else if (root.data>data) {
            return search(root.left,data);
        } else if (root.data<data) {
            return search(root.right,data);
        }
        else {
            return true;
        }
    }
//

    public static Node delete(Node root,int val)
    {//successfull
//        The time complexity in deletion of the tree is O(n).
        if(root==null)
        {
            return null;
    }
        else if (root.data> val) {
            return delete(root.left,val);
        }
        else if (root.data <val) {
            return delete(root.right,val);
        }
        else {
            //root.data=value;
            //case 1:
            if(root.left==null && root.right==null)
            {
                return null;
            }
//case 2:
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
//   case 3:
            else {
                Scanner sc=new Scanner(System.in);
        System.out.println("It is an internal node so you can replace the deleted node either its inordersuccessor or inorderpredecceso\n 1 for inorder predecessor\n 2 for inorder successor :");
        int choice=sc.nextInt();
        if(choice==1) {
            Node ip=inorderpredicissor(root.left);
            root.data=ip.data;
            root.left=delete(root.left,ip.data);
        }
        else {
            Node is=inordersuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right,root.data);
        }
        }
            }
        return root;
        }

    public static void  printInRange(Node root,int X,int Y) {
//        Successful
        //Method:1
        if(root!=null) {
            if (root.data >= X && root.data <= Y) {
                printInRange(root.left, X, Y);
                System.out.print(root.data+"   ");
                printInRange(root.right, X, Y);
            } else if (root.data < X) {
                printInRange(root.right, X, Y);
            } else {
                printInRange(root.left, X, Y);
            }
        }
//        Method:2
        //        if (root == null) {
//            return;
//        } if (root.data >= X && root.data <= Y) {
//            printInRange(root.left, X, Y);
//            System.out.print(root.data+" ");
//            printInRange(root.right, X, Y);
//        } else if (root.data > Y) {
//            printInRange(root.left, X, Y);
//        } else
//        {
//            printInRange(root.right,X,Y);
//        }

    }

           public static Node inordersuccessor(Node root)
           {
           while (root.left!=null)
           {
               root=root.left;
           }
           return root;
           }

    public static Node inorderpredicissor(Node root)
    {
while (root.right!=null)
{
    root=root.right;
}
        return root;
    }

    static int index=0;
    public static void printPath(ArrayList<Integer> path)
    {//Successful
                index++;
        System.out.println("Path "+index+":");
        for (int i = 0; i <path.size() ; i++) {
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer> path)
    {//Successful
//
        if(root==null)
        {
            return;
        }
        path.add(root.data);
 if(root.left==null && root.right==null)
 {//leaf:
     printPath(path);
//     index++;
//     System.out.println("Path "+index+":");
//     for (int i = 0; i <path.size() ; i++) {
//         System.out.print(path.get(i)+" ");
//     }
//     System.out.println();
//     System.out.println();
 }
 else {//non-leaf:
     printRoot2Leaf(root.left,path);
     printRoot2Leaf(root.right,path);
 }
 path.remove(path.size()-1);
    }



    public static void main(String[] args) {
//
////        in bst inorder traversal always gives a sorted sequence.
////        search complexity in binary search tree is big O(height of the tree ) or O(logn).
////        most problems could be solved using recursion in bst.
////        in skewed tree worst case of  time search  complexity is O(n)
   int values[]={5, 2,7,1,3,6,8};

        Node root=null;
        for (int i = 0; i <values.length ; i++) {
            root=insert(root,values[i]);
        }

//        inorder(root);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();

//        System.out.println(search(root,3));
//     delete(root,7);
//        inorder(root);
//        System.out.println();

//        System.out.println(delete(root,4));
//        inorder(root);
//        System.out.println();
////
//        System.out.println(delete(root,5));
//        inorder(root);
//        System.out.println();
//
//        System.out.println(delete(root,1));
//        inorder(root);
//        System.out.println();

//        11 27

//Question 1
//            X=6 & Y=10

            System.out.println("The tree data will be printed in a range betweeen 2 to 6 :");
            printInRange(root,2,6);
        System.out.println();
        System.out.println();
//Question 2
//            root to leaf path
//            P1 :8 ->5 -> 3
//            P2 :8 ->5 -> 6
//            P3 :8 ->10 ->11 ->14
//            we will perform backtracking here.
//            It is like a preorder traversal :Root(add),left subtree and ,right subtree.
printRoot2Leaf(root,new ArrayList<>());
    }

}
