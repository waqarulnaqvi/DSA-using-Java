////METHOD:1
//package com.company;
//import java.util.Scanner;
//public class selfpt_18_feet_inches {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Distance A feet it takes ");
//        int a1feet = sc.nextInt();
//        System.out.println("Enter Distance A inches  it takes ");
//        int a1inches = sc.nextInt();
//        System.out.println("Enter Distance B feet it takes ");
//        int b1feet = sc.nextInt();
//        System.out.println("Enter Distance B inches it takes ");
//        int b1inches = sc.nextInt();
//        int extrafeet_increment=(a1inches + b1inches)/12;
//        int totalinches =(a1inches+b1inches)-(extrafeet_increment*12);
//        int totalfeet = a1feet + b1feet+extrafeet_increment;
//        System.out.println("Distance is :" + totalfeet + " feet and " + totalinches + " inches");
//    }
//}
////METHOD:2
//// package com.company;
////import java.util.Scanner;
////public class selfpt_18_feet_inches {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter Distance A feet it takes ");
////        int a1feet = sc.nextInt();
////        System.out.println("Enter Distance A inches  it takes ");
////        int a1inches = sc.nextInt();
////        System.out.println("Enter Distance B feet it takes ");
////        int b1feet = sc.nextInt();
////        System.out.println("Enter Distance B inches it takes ");
////        int b1inches = sc.nextInt();
////        int totalfeet = a1feet + b1feet;
////        int totalinches = a1inches + b1inches;
////        int n=totalinches/12;
////        for (int i = 1; i <= 5; i++) {
////
////            if (totalinches >= 12 * totalinches && totalinches<= 12 * (i* 2)) {
////                totalfeet += i;
////                totalinches -= (12 * i);
////            }
////        }
////        System.out.println("Distance is :" + totalfeet + " feet and " + totalinches + " inches");
////    }
////METHOD:3(WITH IF CONDITION LOGIC)
////import java.util.Scanner;
////public class selfpt_18_feet_inches {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter Distance A feet it takes ");
////        int a1feet = sc.nextInt();
////        System.out.println("Enter Distance A inches  it takes ");
////        int a1inches = sc.nextInt();
////        if (a1inches >= 12) {
////            System.err.println("Enter feet below 12");
////        } else {
////            System.out.println("Enter Distance B feet it takes ");
////            int b1feet = sc.nextInt();
////            System.out.println("Enter Distance B inches it takes ");
////            int b1inches = sc.nextInt();
////            if (b1inches >= 12) {
////                System.err.println("Enter feet below 12");
////            } else {
////                int totalfeet = a1feet + b1feet;
////                int totalinches = a1inches + b1inches;
////                if (totalinches >= 12) {
////                    totalfeet += 1;
////                    totalinches -= 12;
////                }
////                System.out.println("Distance is :" + totalfeet + " feet and " + totalinches + " inches");
////            }
////        }
////    }
////}
////METHOD:4(WITHOUT IF CONDITION LOGIC)
////import java.util.Scanner;
////
////public class selfpt_18_feet_inches {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter Distance A feet it takes ");
////        int a1feet = sc.nextInt();
////        System.out.println("Enter Distance A inches  it takes ");
////        int a1inches = sc.nextInt();
////            System.out.println("Enter Distance B feet it takes ");
////            int b1feet = sc.nextInt();
////            System.out.println("Enter Distance B inches it takes ");
////            int b1inches = sc.nextInt();
////                int totalfeet = a1feet + b1feet;
////                int totalinches = a1inches + b1inches;
////                if (totalinches >= 12) {
////                    totalfeet += 1;
////                    totalinches -= 12;
////                }
////                System.out.println("Distance is :" + totalfeet + " feet and " + totalinches + " inches");
////            }
////        }
