package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
//Sometimes ago when date & time was in the java.util package they are mutable(changeble) but now when they are in java.time package they are immutable(unchangeble)..
//Cwh always uses ISO_LOCAL_DATE & ISO_LOCAL_TIME Class when he uses java.time date class(self recommendation for future)..
//use java.time api recommendation cwh..
public class pt_81_cwh_100_Advance_java_ch1_java_date_time_API {
    public static void main(String[] args) {
        LocalDate d =LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);
    }
}
