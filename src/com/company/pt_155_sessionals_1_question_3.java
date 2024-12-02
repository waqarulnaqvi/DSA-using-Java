package com.company;

import java.util.Scanner;

public class pt_155_sessionals_1_question_3 {
    String first_name;
    String last_name;
    String address;
    float percentage;

    public static void main(String[] args) {
        pt_155_sessionals_1_question_3 obj=new pt_155_sessionals_1_question_3();
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter first name:");
            obj.first_name=sc.next();
            System.out.println("Enter last name:");
            obj.last_name=sc.next();
            System.out.println("Enter address:");
            obj.address=sc.next();
            System.out.println("Enter 3 subject marks:");
            float marks =sc.nextFloat();
            obj.percentage=marks/3;
            System.out.println(i+") "+obj.first_name+" "+obj.last_name+" "+"obj.address"+" "+obj.percentage+" % ");
        }
    }
}
