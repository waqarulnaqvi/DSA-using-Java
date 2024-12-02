package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class pt_83_cwh_102_Advance_java_ch1_Practice_set {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Question 1:(my logic)
//        ArrayList<String> l1 =new ArrayList<>();//ArrayList is a modified array..
////        ArrayList<String> l2 =new ArrayList<>(5);
////        System.out.println("Size of Arraylist l1 : "+l1.size());
////        System.out.println("Size of Arraylist l2 : "+l2.size());
//
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Enter the name of Student %d : ",i+1);
//            String name =sc.nextLine();
////            l1.add(i,name);//Adding elements in the arraylist..Same work..
//            l1.add(name);//Adding elements in the arraylist..Same work..
//        }
//
//        System.out.println(l1);//printing the arraylist..Same work1..
////        for (int i = 0; i <l1.size(); i++) {
////            System.out.print(l1.get(i)+"\t");//printing the arraylist..Same work1..
////        }
//
//        for(Object o:l1)
//        {
//            System.out.print(o+"\t");
//        }

        //Question 1:(cwh logic)
//        ArrayList  l1 =new ArrayList<>();//ArrayList is a modified array..
////Method:1
////        for (int i = 0; i < 10; i++) {
////            System.out.printf("Enter the name of Student %d : ",i+1);
////            String name =sc.nextLine();
////            l1.add(i,name);//Adding elements in the arraylist..Same work..
//////            l1.add(name);//Adding elements in the arraylist..Same work..
////        }
////Method:2
//         l1.add("Student 1");
//         l1.add("Student 2");
//         l1.add("Student 3");
//         l1.add("Student 4");
//         l1.add("Student 5");
//         l1.add("Student 6");
//         l1.add("Student 7");
//         l1.add("Student 8");
//         l1.add("Student 9");
//         l1.add("Student 10");
//
//        System.out.println(l1);//printing the arraylist..Same work1..
////        for (int i = 0; i <l1.size(); i++) {
////            System.out.print(l1.get(i)+"\t");//printing the arraylist..Same work1..
////        }
//
//        for(Object o:l1)
//        {
//            System.out.print(o+"\t");
//        }

        //Question 2:
        //Use @SuppressWarnings("deprecation") any where in the program it will remove all deprecation warning..
        @SuppressWarnings("deprecation")
//    @SuppressWarnings hum use karke compiler ki awaaz ko dabaate hai means (build me) jo warning aa rhi hoti hai (deprecated anotation lagga ke jo humne user defined function depricate) kiya usko use karne ki wajhe se phir wo warning aana band ho jaati hai..

        Date d1 =new Date();
//        System.out.println(d1);
//        System.out.println(d1.getTime());//Return the number of millisecond since january 1st 1970..
        System.out.println(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());//Correct Answer..

        /*
 //Use @SuppressWarnings("deprecation") any where in the program it will remove all deprecation warning..
        @SuppressWarnings("deprecation")//Error..
//    @SuppressWarnings hum use karke compiler ki awaaz ko dabaate hai means (build me) jo warning aa rhi hoti hai (deprecated anotation lagga ke jo humne user defined function depricate) kiya usko use karne ki wajhe se phir wo warning aana band ho jaati hai..
//     Date d2 =new Date();//if you comment this than @SuppressWarnings("deprecation") annotation (which is under multiline comment) give error..
         */

        //Question 3:
//        Calendar c =Calendar.getInstance();
//        //System.out.println(c.getTime());
//        //System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":"+c.get(Calendar.MILLISECOND));//12 h clock..
//        //Railway clock is a 24 hour clock..
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":"+c.get(Calendar.MILLISECOND));//24 h clock..//Correct Answer..

//        //Question 4:(my Logic)
//        LocalTime t=LocalTime.now();
//        System.out.println(t);

        //Question 4:(my cwh Logic)
//        LocalDateTime dt =LocalDateTime.now();//This is the date..
////        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m a");//This is the format..
//        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s a");//This is the format..
//        String myDate =dt.format(df);//Creating date string using date and format..
//        System.out.println(myDate);//Print Date..

        //Question 5:
//        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);//HashSet is a reference of Set it is a concrete class..//here myHashSet is a concrete object..
//        Set<Integer> myHashSet = new Set();//Error..because set is an abstract class..//here myHashSet is a abstract..(Abstract object not possible)..
//        myHashSet.add(4);
//        myHashSet.add(14);
//        myHashSet.add(45);
//        myHashSet.add(46);
//        myHashSet.add(48);
//        myHashSet.add(49);
//        myHashSet.add(50);
//        myHashSet.add(51);
//        myHashSet.add(52);
//        myHashSet.add(4);
//        myHashSet.add(45);
//        myHashSet.add(3);
//        System.out.println(myHashSet);
    }
}
