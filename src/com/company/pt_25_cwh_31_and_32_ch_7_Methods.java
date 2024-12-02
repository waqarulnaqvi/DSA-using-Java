package com.company;
//arguments are actual/actual parameters/value/global values..
//parameters are formal/formal parameters/value/local values..
public class pt_25_cwh_31_and_32_ch_7_Methods {
    //video:1
//method 1
//    static int logic(int a, int b) {
//        int z;
//        if (a > b) {
//            z = a * b;
//        } else {
//            z = a + b;
//        }
//        return z;
//    }
//
//    public static void main(String[] args) {
//      pt_25_cwh_31_and_32_ch_7_Methods obj=new pt_25_cwh_31_and_32_ch_7_Methods();
//        int x = 2, y = 4;
//        int k;
////        k = logic(x, y);//run..
//        k = obj.logic(x, y);//run..
//        int x1 = 4, y1 = 2;
//        int c1 = obj.logic(x1, y1);//run..
////        int c1 = logic(x1, y1);//run..
//        System.out.println(k);
//        System.out.println(c1);
//    }
//}
//    method 2
//  int logic(int a,int b){
//        int z;
//       // a=20;b=10;
//        if (a > b) {
//            z = a * b;
//        } else {
//            z = a + b;
//
//        }
//       // a=44;
//       // z=39;
//        return z;
//    }

//    public static void main(String[] args) {
//     int x=2,y=4;
//     int k;
//        System.err.println(x+" "+y);//" "-it means String lagana
//     //method invocation using object creation
//        ch_7_Methods obj=new ch_7_Methods();
//        ch_7_Methods ob=new ch_7_Methods();
//     k=obj.logic(x,y);
//     int x1=4,y1=2;
//     int c1=ob.logic(x1,y1);
//        System.err.println(k);
////        System.err.println(c1);
//        System.err.println(ob.logic(x1,y1));
//    }
//}
//video 2:
    //you can do method overloading by changing the return type of the function you can only do a method overloading by changing the argument/formal parameter..
    static void joke (int a)//(int a is parameters)..
    {
        System.err.println("I AM a good boy");
    }
    static void truth () {
        System.err.println("I AM a badass");
    }
    static int  change2(int [] k)//(int [] k is parameters)..
    {
        k[0]=420;
   return 0;
    }
//    static void  change2(int [] k) {//parameter is in the brackets whose value we don't know until method/function call.
//        k[0]=420;
//    }
    static int  change2(int kk) {
        kk=455;
        return kk;
    }
        static int change ( int k,int kk,int jj)
        {
            k = 45;
            kk=44;
            jj=4444;
            System.err.println("I AM a badass");
            return 0;
//            return kk;
//            return jj;

        }

  int logic(int a,int b){
        int z;
     // System.err.println("correct answer is:");
       // a=20;b=10;
        if (a > b) {
            z = a * b;
       //     System.err.println("hello");
        } else {
            z = a + b;
         //   System.err.println("hii");

        }
       // a=44;
       // z=39;
        return z;
     // System.err.println("hii");
    }
    int logic(int a){
        int z=a;
        // System.err.println("correct answer is:");
        // a=20;b=10;
        // a=44;
        // z=39;
        return z;
        // System.err.println("hii");
    }
    static int logikc(int a,int b){
        int z;
        System.err.println("I am a 75 percent evil and 75 percent good personality ");
        if (a > b) {
            z = a * b;
            System.err.println("hiiii");
        } else {
            System.err.println("hyyy");
            z = a + b;

        }
        return z;
    }
//    static int logikc(int a){
//        int z=a;
//        System.err.println("I am a 75 percent evil and 75 percent good personality ");
//        if (a > b) {
//            z = a * b;
//            System.err.println("hiiii");
//        } else {
//            System.err.println("hyyy");
//            z = a + b;
//
//        }
//        return z;
//    }
//    Method Overloading
    static void foo()
    {
        System.err.println("Good Morning Waqarul Hasan Naqvi");
    }
    static void foo(String a)//int a is a parameter (jiski value abhi pata ni)
    {
        System.err.println("Good Morning "+a);
    }
//    static void foo(int a, int b)//int a is a parameter (jiski value abhi pata ni)
//    {
//        System.err.println("Good Morning "+a+" and "+b);
//    }
    static int foo(int a, int b)//Error
    {
        System.err.println("Good Morning "+a+" and "+b);
    return 0;
    }
static void foo(int a, int b,int c)//int a is a parameter (jiski value abhi pata ni)
{
    System.err.println("Good Morning "+a+" and "+b+ " and "+c);
}

   public static void main(String[] args) {
     int x=2,y=4,z=0;

// int l=  change(x,y,z);
//       System.err.println(x);
    int   k[]={1,2,3,3,3,33,6546};
      System.err.println("Before method call : "+k[0]+" "+k[1]);//array passes the copy of reference where address is stored
//      change2(k[6]);//Run value won't change of the k[0] because array is passed array reference is not passed or array address is not passed..
//      change2(k[0]);//Run value won't change of the k[0] because array is passed array reference is not passed or array address is not passed..
//      change2(k[3]);//Run value won't change of the k[0] because array is passed array reference is not passed or array address is not passed..
//      change2(k[1]);//Run value won't change of the k[0] because array is passed array reference is not passed or array address is not passed..
//      change2(k[7]);//Error..
//      change2(k[-2]);//Error..
       //reference means wo kissi cheez ki baat kar raha hai..
      change2(k);//(value of k,and k is a arguments)..
      //value changes of k[0] because reference is copied and address of the array is passed in the change2.
       System.err.println("After Method call : "+k[0]+" "+k[1]);
       int kk=-45;
       System.err.println("Before method call : "+kk);
       change2(k);//object is copied.
       System.err.println("After Method call : "+kk);;//Integer passes the copy of Integer object.
       System.err.println(change2(kk));
       int kl=420;
       System.err.println("Before method call : "+kl);
       change2(k);//arguments is k,arguments are actual!
       System.err.println("After Method call : "+kl);;
       System.err.println(change2(kl));
////       System.err.println(change2(k));
////        it changes because I passed the address
//
//        System.err.println(k[0]);
////        System.err.println(change(x));
//        System.err.println(x+" "+y);//" "-it means String lagana
////     method invocation using object creation-
//       pt_25_cwh_31_and_32_ch_7_Methods obj=new pt_25_cwh_31_and_32_ch_7_Methods();
//       pt_25_cwh_31_and_32_ch_7_Methods ob=new pt_25_cwh_31_and_32_ch_7_Methods();
//int   k1=obj.logic(x,y);
//int l1=ob.logic(3);
//int j=logikc(x,y);
//     int x1=4,y1=2;
//     int c1=ob.logic(x1,y1);
//     System.err.println(k1);
// System.err.println(c1);
//        System.err.println(k1);
//        System.err.println(c1);
//     System.err.println(k1);
//        System.err.println(c1);
//  System.err.println(ob.logic(x1,y1));
//
//         System.err.println(ob.logic(x1,y1));
//       System.err.println(ob.logic(x,y));
//      joke(x);
//        truth();
//       logikc(x,y);
//        logikc(x1,y1);
////        Method overloading
////        sirf parameters change karke overloading kar sakte hai return type change karke ni
////        example static void foo(int a);
////        and static int foo(int a);
////        both are same Not applicable for overloading
//
////        int kk=90;
//String str="Azaan Naqvi";
//foo();
//foo(10,20);
//foo(10,420,55);
//foo("\"waqarul\"");//3000 is arguments! arguments are actual value!
//   foo(str);
    }
}