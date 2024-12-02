package com.company;

import java.util.Scanner;

public class pt_220_american_express_death_note_alphabet_question{
    public static int ccase(char a)
    {
        return a-96;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine().toLowerCase();
        char[] ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ccase(ch[i]));
        }

    }
}