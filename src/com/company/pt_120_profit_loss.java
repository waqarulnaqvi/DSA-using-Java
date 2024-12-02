//package com.company;
//import java.util.Scanner;
//public class selfpt_15_profit_loss {
//    static void profit_loss(float cp,float sp) {
//        int k;
//        if (cp < sp) {
//            k = (int)(sp - cp);
//            System.out.println(k);
//            float profit = (k * 100) / cp;
//            System.out.println("your profit is "+ k + " amt total = " + profit + "%");
//        } else if (sp < cp) {
//            k = (int) (cp - sp);
//            float loss = (k * 100) / cp;
//            System.out.println("your loss is " + k + " amt total = " + loss + "%");
//        } else {
//            System.out.println("no profit no loss");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Cost price (cp)");
//        float cp= sc.nextFloat();
//        System.out.println("Enter Selling price (sp)");
//        float sp= sc.nextFloat();;
//        profit_loss(cp,sp);
//    }
//}
