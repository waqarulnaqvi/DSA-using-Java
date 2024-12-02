package com.company;

import java.util.Scanner;
public class pt_182_Pallindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str= sc.nextLine();
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
      if(str.equals(rev))
      {
          System.out.println("Palindrome String");
          System.out.println("Reverse of a String : "+rev);
      }
      else {
          System.out.println("Not a Palindrome String");
          System.out.println("Reverse of a String : "+rev);
      }
    }
}
