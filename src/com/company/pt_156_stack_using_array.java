package com.company;

import java.util.Scanner;
class stack3{
    int top=-1;
    Scanner sc;
    float a[]=new float[5];
    stack3(Scanner sc)
    {
        this.sc=sc;
    }
    public void push()
    {
       if(top==a.length-1)
       {
           System.out.println("Stack Overflow!!\n");
       }
       else
       {
           System.out.println("Enter element you wish to insert:");
           float item=sc.nextFloat();
           top=top+1;
           a[top]=item;
           System.out.println("ITEM INSERTED!!\n");
       }
    }
   public void pop()
   {
       if(top==-1)
       {
           System.out.println("Stack Underflow!!\n");
       }
       else
       {
           top=top-1;
           System.out.println("Item Deleted!!\n");
       }

   }
   public void display()
   {
       System.out.println("STACK Elements:");
       for (int i = top; i >=0 ; i--) {
           System.out.println(a[i]);
       }
   }
}

public class pt_156_stack_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack3 s = new stack3(sc);
        boolean run = true;
        while (run) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to display");
            System.out.println("ENTER ANY OTHER KEY TO EXIT ");
            System.out.println("Enter your choice:");
            int d = sc.nextInt();
            switch (d) {
                case 1 -> s.push();
                case 2 -> s.pop();
                case 3 -> s.display();
                default -> {
                    run = false;
                    System.out.println("EXIT SUCCESSFULLY!!\n");
                }
            }
        }
    }
}