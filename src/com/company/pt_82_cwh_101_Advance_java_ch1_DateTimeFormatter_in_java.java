package com.company;
//Cwh always uses ISO_LOCAL_DATE & ISO_LOCAL_TIME Class when he uses java.time date class(self recommendation for future)..
//use java.time api recommendation cwh..

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pt_82_cwh_101_Advance_java_ch1_DateTimeFormatter_in_java {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();//This is the date..
        System.out.println(dt);
//mm is minute ,MM is month ,mM is a minute and month mix , DD is not a date &,yyyy or YYYY is a year..
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m a");//This is the format..
//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mM");//This is the format..
//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm");//This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("yyyyyyy");//Run: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("mmmmm");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("mmmm");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("mmm");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("mm");//Run: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("m");//Run: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("");//Run:(Empty) //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern( );//Error: //This is the format..

//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("ddddd");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dddd");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("ddd");//Error: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd");//Run: //This is the format..
        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd-yyyy");//Run: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("d");//Run: //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern("");//Run:(Empty) //This is the format..
//        DateTimeFormatter df3=DateTimeFormatter.ofPattern( );//Error: //This is the format..
        System.out.println(df);
        String myDate =dt.format(df);//Creating date string using date and format..
        String myDate3 =dt.format(df3);//Creating date string using date and format..
        System.out.println(myDate);//Print Date..
        System.out.println(myDate3);//Print Date..

//         DateTimeFormatter df1=DateTimeFormatter.ofPattern("mm-DD-YYYY||");//This is the format..
         DateTimeFormatter df1=DateTimeFormatter.ofPattern("mm-YYYY||");//This is the format..
//        System.out.println(df1);
        String myDate1 =dt.format(df1);//Creating date string using date and format..
        System.out.println(myDate1);//Print Date..
//mm is minute ,MM is month ,mM is a minute and month mix , DD is not a date &,yyyy or YYYY is a year..
//           DateTimeFormatter df2=DateTimeFormatter.ofPattern("YyyY/Dd mM - E - a");//This is the format..
           DateTimeFormatter df2=DateTimeFormatter.ofPattern("YyyY/DD  - E - a");//This is the format..
//        System.out.println(df2);
        String myDate2 =dt.format(df2);//Creating date string using date and format..
        System.out.println(myDate2);//Print Date..

             DateTimeFormatter df4=DateTimeFormatter.ISO_LOCAL_DATE_TIME;//This is the format..
//        System.out.println(df2);
        String myDate4 =dt.format(df4);//Creating date string using date and format..
        System.out.println(myDate4);//Print Date..

            DateTimeFormatter df5=DateTimeFormatter.ISO_LOCAL_DATE;//This is the format..
//        System.out.println(df2);
        String myDate5 =dt.format(df5);//Creating date string using date and format..
        System.out.println(myDate5);//Print Date..
    }
}
