package com.company;

public class pt_26_cwh_33_ch_7_Method_varargsvd3 {
//    static int sum(int a , int b)
//    {
//        return a+b;
//    }
//    static int sum(int a , int b,int c)
//    {
//        return a+b+c;
//    }
//      static int sum(int a , int b,int c,int d) {
//          return a + b + c+d;
//     }
//      static int sum(int ...arr)
//          //Available as int []arr;
//      {
//          int sum = 0;
//          for (int e : arr) {
//              sum += e;
////                    for (int i=0;i<arr.length;i++)
////                    {
////                        sum+=arr[i];
//
//         //     return sum;
//          }
//            return sum;
//      }
//  static int sum(int a,int b,int ...arr)
//          //Available as int []arr;
//      {
//          int sum = a+b;
//          for (int e : arr) {
//              sum += e;
////                    for (int i=0;i<arr.length;i++)
////                    {
////                        sum+=arr[i];
//
//         //     return sum;
//          }
//            return sum;
//      }
//    static  int sum(int ...arr ){
//        int r=0;
//        for (int e:arr)
//        {
//            r+=e;
//        }
//        return r;
//    }
//    static  int sum(int a, int ...arr ){//then 1 arguments will be compulsory.
//
//        for (int e:arr)
//        {
//            a+=e;
//        }
//        return a;
//    }
public static int sum(int a,int ...arr)
//int ...arr is Available as int []arr;
{

    for (int e : arr) {
        a+= e;
//                    for (int i=0;i<arr.length;i++)
//                    {
//                        sum+=arr[i];

        //     return sum;
    }
    return a;
}
          public static void main(String args[]) {

        //Variable Arguments (varargs)
        System.err.println("Welcome to Varargs Tutorial:");
        System.err.println("The sum of 8 and 5 is :"+sum (8,5));
        System.err.println("The sum of 1 is :"+ sum(1) );
//           System.err.println("The sum of Nothing is  :"+sum (    ));//sum of nothing is 0.
        System.err.println("The sum of 4,3 and 5 is :"+ sum(4,3,5));
        System.err.println("The sum of 9 ,3,2 and 5 is :"+ sum(9,3,2,5));
    }
}