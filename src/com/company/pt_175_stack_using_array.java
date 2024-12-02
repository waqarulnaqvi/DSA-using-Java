package com.company;

import java.util.Scanner;

class stack1{
    int top=-1;
    int a[];
    int i=0;
    stack1(int n)
    {
        a=new int[n];
    }
    public void push(Scanner sc)
    {
        if(top==a.length-1)
        {
            System.out.println("STACK OVERFLOW!!");
        return;
        }
        System.out.println("Enter data:");
        int data =sc.nextInt();
        a[i]=data;
        i++;
        System.out.println("Element Inserted!!");

    }
    public  void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow!!");
            return;
        }
        top=top+1;
        System.out.println("Element deleted!!");
    }
    public void display()
    {
        System.out.println("Stack Elements");
        for (int j = top; j <a.length ; j++) {
            System.out.println(a[j]);
        }
        System.out.println();
    }
}
public class pt_175_stack_using_array {
    public static void main(String[] args) {

    }
}
