package com.company;

//import javax.xml.crypto.Data;
import java.util.Date;

public class pt_78_cwh_97_Advance_java_ch1_the_date_class_in_java {
    public static void main(String[] args) {
        /*   last_quick_quiz_10:
      Is it safe to store the number of ms in a variable of type long?
      yes,it is safe because maximum value of long is 9223372036854775807..*/
      /*  int k=Integer.MAX_VALUE;
        int k1=Integer.MIN_VALUE;
        System.out.println(k);
        System.out.println(k1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);*/
        @SuppressWarnings("deprecation")
//    @SuppressWarnings hum use karke compiler ki awaaz ko dabaate hai means (build me) jo warning aa rhi hoti hai (deprecated anotation lagga ke jo humne user defined function depricate) kiya usko use karne ki wajhe se phir wo warning aana band ho jaati hai..

        Date d =new Date(2014,3,23,23,23);
        System.out.println(d);
        Date d2 =new Date(2,3,23,23,23);
        System.out.println(d2);
        Date d1 =new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());//Return the number of millisecond since january 1st 1970..
        //Depricated Methods:
        //Current Date,Current Day,Current Year &,Current Seconds..
        System.out.println(d1.getDate());
        System.out.println(d1.getDay());
        System.out.println(d1.getSeconds());
        System.out.println(d1.getYear());
    }
}
