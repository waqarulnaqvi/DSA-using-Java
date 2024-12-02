package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class pt_80_cwh_99_Advance_java_ch1_GregorianCalender_class_and_Time_Zone_in_java {
    public static void main(String[] args) {
        //Calender class is a abstract class in java..
        //Gregorian Calender class is a concrete class and sub class of calender..
        //Gregorian Calender class provides the standard calender system used by most of the world..
        Calendar c =Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));//Railway_hour_Clock..
        //Railway clock is a 24 hour clock..
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":"+c.get(Calendar.MILLISECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(400));//true..//return boolean true/false..
        System.out.println(cal.isLeapYear(2019));//false..//return boolean true/false..
        System.out.println(cal.isLeapYear(2020));//true..//return boolean true/false..
        System.out.println(cal.isLeapYear(2021));//false..//return boolean true/false..
        //Historically,in those countries which adopted the Gregorian calender first ,october 4,1582(Julian #Julian Calender) was thus followed by October 15,1582(Gregorian)..
//        Default gregorian date is October 15,1582(Gregorian)..
        //GMT :Greenwich Mean Time is a standard time zone followed by all the countries..
//        Eg:- Indiantimezone is a GMT +0530..
        System.out.println("LIST OF ALL TIME ZONE:");
        System.out.println(TimeZone.getAvailableIDs());
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
//        System.out.println(TimeZone.getAvailableIDs()[24]);
//        System.out.println(TimeZone.getAvailableIDs()[150]);

//        for (int i = 0; i < 629; i++) {//Error..
//        for (int i = 0; i < 628; i++) {//Run..
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//        }
    }
}
