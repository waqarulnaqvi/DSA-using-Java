package com.company;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
        import java.util.Scanner;

public class pt_99_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Method:1*/
        LocalDateTime dt = LocalDateTime.of(2001, 11, 23, 4, 0, 0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println("Initial Date is: " + myDate);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        System.out.println("Enter a month:");
        int mon = sc.nextInt();
        int month=mon+11;
        System.out.println("Enter a day:");
        int day = sc.nextInt();
        int dy=day+23;

        boolean run =true;
        while(run)
        {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
           if(dy<=31)
           {
           break;
//         run=false;
           }
            dy = dy - 31;
            month += 1;

        } else if (month == 2 && year % 4 != 0) {
            if(dy<=28)
            {
           break;
//          run=false;
            }
            dy = dy - 28;
            month += 1;
        }
//       else if (month==2  && year%4==0) {//here year is redundant..
        else if (month == 2) {
            if(dy<=29)
            {
            break;
//          run=false;
            }
            dy = dy - 29;
            month += 1;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11 ){
            if(dy<=30)
            {
            break;
//          run=false;
            }
            dy = dy - 30;
            month += 1;
        }
        else{
            while (month > 12) {
                year += 1;
                month = month - 12;
            }
        }
    }
            try {
                LocalDateTime date1 = LocalDateTime.of(2001 + year, month, dy, 0, 0, 0, 0);
                DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String mDate = date1.format(date2);

                System.out.println("The difference in 2 dates is: "+mDate);
            }
            catch (Exception e)
            {
                System.out.println("Something went Wrong!..");
//            System.out.println(e);
            }
        LocalDateTime dt1 =LocalDateTime.now();
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate1 =dt1.format(df1);
        System.out.println("Current Date is: "+myDate1);

          /*Method:2
        LocalDateTime dt =LocalDateTime.of(2001,12,31,0,0,0);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate =dt.format(df);
        System.out.println("Initial Date is: "+myDate);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        System.out.println("Enter a month:");
        int mon=sc.nextInt();
        System.out.println("Enter a day:");
        int dy=sc.nextInt();
        try {
            LocalDateTime date1 = LocalDateTime.of(2002 + year, mon, dy, 0, 0, 0, 0);
            DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String mDate = date1.format(date2);

            System.out.println("The difference in 2 dates is:");
            System.out.println(mDate);
        }
        catch (Exception e)
        {
            System.out.println("Please Enter valid number of month and number of days..");
//            System.out.println(e);
        }
        LocalDateTime dt1 =LocalDateTime.now();
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate1 =dt1.format(df1);
        System.out.println("Current Date is: "+myDate1);
        */
    }
}
