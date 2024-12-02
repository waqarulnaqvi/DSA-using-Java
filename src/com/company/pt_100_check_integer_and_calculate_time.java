package com.company;

import java.util.Scanner;

public class pt_100_check_integer_and_calculate_time {
    public static void check_integer(double num)
    {
        int number=(int)num;
        if(number==num)
        {
            System.out.println("Entered number is an Integer number..");
        }
        else {
            System.out.println("Entered number is not an Integer number..");
        }
    }
    //Method:1
    public static void calculate_time1(int hour,int min,int sec)
    {
        while(sec>59){
            min=min+1;
            sec=sec-60;
        }
        while(min>59)
        {
            hour=hour+1;
            min=min-60;
        }
        System.out.printf("%d h %d min %d sec\n",hour,min,sec);
    }
    //Method:2
    public static void calculate_time(int hour ,int min,int sec)
    {

        while(true) {
            if (sec > 59) {
                min = min + 1;
                sec = sec - 60;
            } else if (min > 59) {
                hour = hour + 1;
                min = min - 60;
            } else {
                break;
            }
        }
        System.out.printf("%d h %d min %d sec\n",hour,min,sec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Problem:1
        System.out.println("Enter a number:");
        double num=sc.nextDouble();
        check_integer(num);
         */

        /*Problem:2*/
        System.out.println("Enter a hours:");
        int hour=sc.nextInt();
        System.out.println("Enter a minutes:");
        int min=sc.nextInt();
        System.out.println("Enter a seconds:");
        int sec=sc.nextInt();
        //Method:1
        calculate_time(hour,min,sec);
        //Method:2
        calculate_time1(hour,min,sec);

    }

}
