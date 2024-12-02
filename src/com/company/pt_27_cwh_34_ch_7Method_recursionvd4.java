package com.company;
import java.util.Scanner;
public class pt_27_cwh_34_ch_7Method_recursionvd4 {
    //video:4
    static int factorial(int a) //recursive approach
    {
        //factorial(n)=n*n-1*n-2.....1
        //factorial(5!)=5*4*3*2*1=120
//        System.err.println("factorial");-it print 5 times factorial function in a program..
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return factorial(a - 1) * a; //n value must be >= 1 then this formula works..
        }
    }

    static int fact_iteration(int a) {//iterative approach
        //  System.err.println("factorial");
        int fact = 1;
//        if (a == 0 || a == 1) {
//            return 1;
//        } else {

        for (int i = a; i > 0; i--)//1 to n
        {
            fact *= i;

        }
        return fact;
//        }
        //   return fact;

    }

    static int fibo(int a) {
        if (a == 1 || a == 2)
            return 1;
        else if (a == 0)
            return 0;
        else
            return fibo(a - 1) + fibo(a - 2);
    }

    static int fibo1(int a) {
        if (a == 0 || a == 1)
            return a;
        else
            return fibo(a - 1) + fibo(a - 2);
    }

    static int fibo2(int a) {
        if (a <= 1)
            return a;
        else
            return fibo2(a - 1) + fibo2(a - 2);
    }
    static int dp[]=new int[38];
    static int tribo(int a) {
//        if(dp[a]!=0) //as your wish you want to use this code.
//        {
//            return dp[a];
//        }
        if (a <=2) {//index starts from 0
            return a;
        }
//        if (a <=3) {//index starts from 1
//            return a-1;
//        }
        else {
            return tribo(a-1)+tribo(a-2)+tribo(a-3);
        }
    }
    static  int fibo3(int a)
    {
        if(a==1)
            return 0;
        else if(a==2)
            return 1;
        else
            return fibo3(a-1)+fibo3(a-2);
    }
    static void fiboitr(int num) {
        int pre = 0, cur = 1,next;
        System.err.print(pre + " " + cur+ " ");
        for (int i = 2; i < num; i++) {
            next = pre + cur;
            pre = cur;
//            int t=pre;
//            System.err.println(t);
            cur = next;
//        next=pre;
            System.err.print(next + " ");
        }
    }
    static void fiboitr2(int n){
      int a=0 ,b=1,c;
        System.err.println();
        System.err.print("0 1 ");
      for(int i=2;i<n;i++)
      {
          c=a+b;
          System.err.print(c+" ");
          a=b;
          b=c;
      }

    }
    static void tribon(int n){
      int a=0 ,b=1,c=2,d;
        System.err.print("\n0 1 2 ");
      for(int i=3;i<=n;i++)
      {
          d=a+b+c;
          System.err.print(d+" ");
          a=b;
          b=c;
          c=d;
      }

    }
//    Scanner sc=new Scanner(System.in);
//  int i=sc.nextInt();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the value to be make its factorial ");
        int n =sc.nextInt ();
//      System.err.println(factorial(n));
//        System.err.println(fact_iteration(n));
//        System.err.println(fibo(n));
//        System.err.println(fibo1(n));
//        System.err.println(fibo2(n));
//        System.err.println(fibo3(n));
//       fiboitr(n);
//       fiboitr2(n);
       tribon(n);
//       int a= (int) 4.5;
        System.err.println("\n"+tribo(n));
     // ch7Methodvd4 obj=new ch7Methodvd4();
    //    System.err.println(  obj.factorial(4));
      // int k= obj.factorial(4);
    }
}

