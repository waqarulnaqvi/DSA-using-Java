package com.company;
import java.util.Scanner;
public class pt_19_cwh_22_dowhile_quick_quiz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        System.err.println("Enter n numbers:");
        int n = sc.nextInt();
//        System.err.println("Enter n numbers:");
//
//        do{
//            System.err.println(a+"do while loop");
//            a++;
//        }
//        while (a<5);
//    }
//}
//quick_quiz_1:
        do {

            System.err.println("\" " + a + " \"");
            a++;

        }
        while (a <= n);
    }

}