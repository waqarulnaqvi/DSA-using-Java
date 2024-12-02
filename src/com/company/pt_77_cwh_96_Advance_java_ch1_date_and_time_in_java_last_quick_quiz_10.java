package com.company;

public class pt_77_cwh_96_Advance_java_ch1_date_and_time_in_java_last_quick_quiz_10 {
    public static void main(String[] args) {
//        Date in java is stored in the form of long number.This long number holds the number
//        of miliseconds passed since 1 Jan 1970..
//        System.currentTimeMillis();//this function give the number of millisecond since 1 jan 1970 till now..
//        There are 1000 milliseconds in 1 seconds..
        System.out.println("Number of millisecond since 1 jan 1970 till now : "+System.currentTimeMillis()+" milliseconds.");
        System.out.println("Number of years since 1 jan 1970 till now : "+System.currentTimeMillis()/1000/3600/24/365+" years.");
        System.out.println("Number of months  since 1 jan 1970 till now : "+System.currentTimeMillis()/1000/3600/24+" months.");
        System.out.println("Number of hours since 1 jan 1970 till now : "+System.currentTimeMillis()/1000/3600+" hours.");
        System.out.println("Number of minutes since 1 jan 1970 till now : "+System.currentTimeMillis()/1000/60+" minutes.");
        System.out.println("Number of second since 1 jan 1970 till now : "+System.currentTimeMillis()/1000+" seconds");

/*   last_quick_quiz_10:
      Is it safe to store the number of ms in a variable of type long?
      yes,it is safe because maximum value of long is 9223372036854775807..
      */
      int k=Integer.MAX_VALUE;
      int k1=Integer.MIN_VALUE;
        System.out.println(k);
        System.out.println(k1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
