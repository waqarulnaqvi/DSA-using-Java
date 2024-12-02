//package com.company;
//
//import java.util.Scanner;
//
//class stack1{
//    int n=10;
//    int top=-1;
//    int a[]=new int[n];
//    void push()
//    {
//        if(top==n-1)
//        {
//            System.out.println("Overflow");
//        }
//        else {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter data:");
//            int i=sc.nextInt();
//            top=top+1;
//            a[top]=i;
//            System.out.println("item inserted");
//        }
//
//    }
//    void pop(){
//        if(top==-1)
//        {
//            System.out.println("Underflow");
//        }
//        else {
//            top=top-1;
//            System.out.println("item deleted");
//        }
//    }
//    void display()
//    {
//        System.out.println("items are:");
////        for (int val:a)
////        {
////            System.out.println(val);
////        }
//        for (int i = top; i >=0 ; i--) {
//            System.out.println(a[i]);
//        }
//    }
//}
//public class pt_147_ds_stack_using_array {
//    public static void main(String[] args) {
//        stack1 s = new stack1();
//        int d,l;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter 1 to push");
//            System.out.println("Enter 2 to pop");
//            System.out.println("Enter 3 to display");
//            System.out.println("Enter your choice:");
//            d = sc.nextInt();
//            switch (d) {
//                case 1 -> s.push();
//                case 2 -> s.pop();
//                case 3 -> s.display();
//            }
//            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU");
//            System.out.println("ENTER ANY KEY TO EXIT ");
//            l = sc.nextInt();
//
//        }
//        while (l == 0);
//        {
//            System.out.println("EXIT SUCCESSFULLY!!");
//        }
//    }
//}

package com.company;

import java.util.Scanner;
class stack2{
    int top=-1;
    int []a=new int[6];

    public void push()
    {
        if(top==a.length-1)
        {
            System.out.println("Overflow!!\n");
        }
        else {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Data");
            int l=sc.nextInt();
            top=top+1;
            a[top]=l;
            System.out.println("Item Inserted!!\n");
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow!!\n");
        }
        else {
            top=top-1;
            System.out.println("Item deleted!!\n");
        }
    }
    public void display()
    {
        System.out.println("STACK ELEMENTS:");
        for (int i = top; i >=0 ; i--) {
            System.out.println(a[i]);

        }
        System.out.println("\n");
//        System.out.println();
//        for(int i:a)
//        {
//            System.out.println(i);
//        }
    }

}
public class pt_147_ds_stack_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack2 s = new stack2();
        int d, l;

//Method:1
//        do {
//            System.out.println("Enter 1 to push");
//            System.out.println("Enter 2 to pop");
//            System.out.println("Enter 3 to display");
//            System.out.println("Enter your choice:");
//            d = sc.nextInt();
//            switch (d) {
//                case 1 -> s.push();
//                case 2 -> s.pop();
//                case 3 -> s.display();
//            }
//            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU");
//            System.out.println("ENTER ANY KEY TO EXIT ");
//            l = sc.nextInt();
//
//        }
//        while (l == 0);
//        {
//            System.out.println("EXIT SUCCESSFULLY!!");
//        }
//    }

//Method:2
        boolean run = true;
        while (run) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to display");
            System.out.println("ENTER ANY OTHER KEY TO EXIT ");
            System.out.println("Enter your choice:");
            d = sc.nextInt();
            switch (d) {
                case 1 -> s.push();
                case 2 -> s.pop();
                case 3 -> s.display();
                default -> {
                    run = false;
                    System.out.println("EXIT SUCCESSFULLY!!");
                }
            }
        }
    }
}
