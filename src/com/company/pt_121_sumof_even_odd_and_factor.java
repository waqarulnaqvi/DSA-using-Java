package com.company;
import java.util.Scanner;
public class pt_121_sumof_even_odd_and_factor {
    static void sumof_even_odd(int n){
        int sum1=0,sum2=0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
//            System.out.println("sum of even no. = "+sum1 +"\nsum of odd no. = "+sum2);
        }
        System.out.println("sum of even no. = "+sum1 +"\nsum of odd no. = "+sum2);
    }
    static  void factor(int n){
        System.out.printf("factor of %d is",n);
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                System.out.print (" "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:-");
      int n=sc.nextInt();
//      question :1
      sumof_even_odd(n);
//      question:2
      factor(n);
    }
}
