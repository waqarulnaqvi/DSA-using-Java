package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class pt_79_cwh_98_Advance_java_ch1_the_calender_class {
    public static void main(String[] args) {
        //Calender class is a abstract class in java..
        //Gregorian Calender class is a concrete class and sub class of calender..
        Calendar c =Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getClass());
        System.out.println(c.getCalendarType());//Gregorian Calender is a normal calender that world uses..
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID()+"\n");

        Calendar c1 =Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getTimeInMillis());
        System.out.println(c1.getCalendarType());//Gregorian Calender is a normal calender that world uses..
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTimeZone().getID()+"\n");
    }
}
