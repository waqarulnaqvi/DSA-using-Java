package com.company;
public class pt_231_yt_short_12 {
        static int sum(int a , int b)
    {
        return a+b;
    }

      static int sum(int ...arr)
          //Available as int []arr;
      {
          int sum = 0;
          for (int i = 0; i < arr.length; i++) {
              sum += arr[i];

          }
          return sum;
      }

    public static void main(String args[]) {

        //Variable Arguments (varargs)
        System.out.println("Welcome to Varargs Tutorial:");
        System.out.println("The sum of 8 and 5 is :"+sum (8,5));
        System.out.println("The sum of 1 is :"+ sum(1) );
        System.out.println("The sum of 4,3 and 5 is :"+ sum(4,3,5));
        System.out.println("The sum of 9 ,3,2 and 5 is :"+ sum(9,3,2,5));
    }
}