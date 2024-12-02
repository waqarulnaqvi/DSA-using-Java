package com.company;

public class pt_130_fibo_tribo_ams_factorial {
    static void fibo (int n)
    {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i <=n ; i++) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    static void tribo (int n)
    {
        int a=0,b=1;int c=2;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i = 3; i <=n ; i++) {
            int d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
    static int recfibo(int n)
    {
        if(n<=1){
            return n;
        }
        else {
            return recfibo(n-1)+ recfibo(n-2);
        }
    }
    static int rectribo(int n)
    {
        if(n<=2){
            return n;
        }
        else {
            return rectribo(n-1)+ rectribo(n-2)+rectribo(n-3);
        }
    }
    static int recnat(int n)
    {
        if(n==1){
            return n;
        }
        else {
            return n+ recnat(n-1);
        }
    }
    static void fact(int n)
    {
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+"is"+fact);
    }

    static int recfact(int n)
    {
       if(n<=1){
           return 1;
        }
       else {
           return n* recfact(n-1);
       }
    }
    static void ams(int n)
    {
        int t=n,rem,l=0,sum=0;
        while (t>0)
        {
            t=t/10;
            l++;
        }
        t=n;
        while (t>0)
        {
            rem=t%10;
            sum+=Math.pow(rem,l);
             t=t/10;
        }
        if (sum==n)
        {
            System.out.println("Amstrong number:");
        }
        else {
            System.out.println("not an amstrong number:");
        }
    }
    static void ams2(int n)
    {
        int t=n,rem,l=0,ams=0;
        while (t>0)
        {
            t=t/10;
            l++;
        }
        t=n;
        while (t>0)
        {
            rem=t%10;
           int mul=1;
            for (int i = 0; i <l ; i++) {
                mul*=rem;
            }
            ams+=mul;
             t=t/10;
        }
        if (ams==n)
        {
            System.out.println("Amstrong number:");
        }
        else {
            System.out.println("not an amstrong number:");
        }
    }
    public static void main(String[] args) {
        fibo(10);
        System.out.println("\n\n"+recfibo(4));
        System.out.println();
        tribo(10);
        System.out.println("\n\n"+rectribo(4));


        System.out.println("sum of natural number"+recnat(4));

//      fact(5);
//      fact(4);
//      fact(3);

//        System.out.println("factorial of "+5+" is "+ recfact(5));
//        System.out.println("factorial of "+4+" is "+ recfact(4));
//        System.out.println("factorial of "+3+" is "+ recfact(3));

//        ams(153);
//        ams(9);
//        ams(100);

//        ams2(153);
//        ams2(9);
//        ams2(100);
    }
}
