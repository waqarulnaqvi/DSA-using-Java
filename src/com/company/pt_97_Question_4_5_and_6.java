package com.company;
import java.util.*;
public class pt_97_Question_4_5_and_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Problem:4
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(i*i);
            System.out.print(i*i+" ");
        }
        System.out.println("\nSum of square of n number is "+sum);
        */

        /*Problem:5
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if(i%3==0)
            {
                sum+=(i*i*i);
                System.out.print(i*i*i+" ");
            }
        }
        System.out.println("\nSum of cube of n number which is divisible by 3 is "+sum);
         */

        /*Problem:6*/
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rem,odd=1,even=0,t=n;
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                even+=rem;
            }
            else{
                odd*=rem;
            }
            n=n/10;
        }
        System.out.println("Sum of all even number in \""+t+"\" is: "+even);
        System.out.println("Multiplication of all odd number in \""+t+"\" is: "+odd);
    }
}
