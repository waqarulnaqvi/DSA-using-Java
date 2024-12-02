//package com.company;
//import java.util.Scanner;
//abstract class parent1 {
//
//    abstract public void Bank1(float pa,int t);
//    abstract public void Bank2(float pa,int t);
//}
//class chil3  extends parent1{
//    @Override
//    public void Bank1(float pa,int t){
//        float si=(pa/7);
//        float r= (si*100)/(pa*t);
//        System.out.println("INTEREST RATE OF PNB BANK = "+(r*t)+"%");
//    }
//    @Override
//    public void Bank2(float pa,int t){
//        float si=(pa/8);
//        float r= (si*100)/(pa*t);
//        System.out.println("INTEREST RATE OF SBI BANK = "+(r*t)+"%");
//    }
//}
//public class labpt_6_abstract {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Principle Amount ");
//        float pa= sc.nextFloat();
//        System.out.println("Enter Time Period in year");
//        int t=sc.nextInt();
//    chil3 obj=new chil3();
//    obj.Bank1(pa,t);
//    obj.Bank2(pa,t);
//        }
//    }
