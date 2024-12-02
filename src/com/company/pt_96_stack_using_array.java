package com.company;

import java.util.Scanner;

//top hamesha index ko represent karta hai..
class stack {
    int top=-1;
  int n=5;
  int a[]=new int[n];
    void push() {
        Scanner sc =new Scanner(System.in);
        if(top==(a.length-1))
        {
            System.err.println("Overflow");
        }
        else {
            System.out.println("Enter data");
            int i =sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");
        }}
    void pop()
    {
        if(top==-1)
        {
            System.err.println("Underflow");
        }
        else {
            top=top-1;
//            n=n-1;
            System.out.println("Item deleted");
        }
    }
    void display()
    {
        System.out.println("items are:");
//        for (int var:a) {
//            System.out.print(var+"\t");
//        }
//        System.out.println();
        for (int i = top; i >=0 ; i--) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
public class pt_96_stack_using_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Method 1:
// //       System.out.println("Enter the length of the array:");
// //      int n = sc.nextInt ();
//        stack ob=new stack();
//        Boolean b=true;
//        while (b)
//        {
//            System.out.println("1)push\n2)pop\n3)display\n press any key for break..");
//            int s=sc.nextInt();
//      switch (s)
//      {
//          case 1 ->ob.push();
//          case 2 ->ob.pop();
//          case 3 ->ob.display();
//          default -> b=false;
//      }
//        }
// Method 2:
        stack ob=new stack();
        Boolean b=true;int s,m;
     do
        {
            System.out.println("1)push\n2)pop\n3)display\n press any key for break..");
             s=sc.nextInt();
      switch (s)
      {
          case 1 ->ob.push();
          case 2 ->ob.pop();
          case 3 ->ob.display();
      }
//            System.out.println("Enter 0 to go back to the main menu");
//            System.out.println("enter any key to exit");
//            m=sc.nextInt();
        }
//     while (m==0);
     while (s<=3);
        System.out.println("EXIT SUCCESSFULLY!!");
    }
}
