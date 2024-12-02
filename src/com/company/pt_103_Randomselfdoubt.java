package com.company;
import java.util.*;
//import java.util.Random;
import java.util.Scanner;
public class pt_103_Randomselfdoubt {
    public static void main(String[] args) {
   //     System.err.println("Tell me your name :");
      Scanner sc = new Scanner(System.in);
        //  String n = sc.nextLine();
//        int count = 0;
//        int k=0;
//        int c = 0;
        Random choice = new Random();
        int num = 0, i;
        for (i = 1; i <= 5; i++) {
            num = 1 + choice.nextInt(30);
            //    System.err.println("\"computer choice is:\"" + num);

//            for (int j = 1; j <= 5; j++) {
            //    System.err.println("What do you want to choose: \t 1.\"rock\"\t2.\"paper\"\t\"3.scissor\"");
            //  int ch = sc.nextInt();
            System.err.println("\"computer choice is:\"" + num);
        }
    }
}

