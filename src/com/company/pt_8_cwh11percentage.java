package com.company;
import java.util.Scanner;
public class pt_8_cwh11percentage {
 public static void main(String[] args) {
  // float total = 0;
    System.out.println("WELCOME T THE CBSE PERCENTAGE MAKER");
  Scanner swhn = new Scanner(System.in);
        System.out.println("Enter Total marks of the subject ( Eg:-100, 80):");
        int total_marks = swhn.nextInt();
        System.out.println("Enter marks of subject 1:");
        int s1 = swhn.nextInt();
        //total = total + s1;
        System.out.println("Enter marks of subject 2:");
        int s2 = swhn.nextInt();
       // total = total + s2;
        System.out.println("Enter marks of subject 3:");
        int s3 = swhn.nextInt();
       //total += s3;
        System.out.println("Enter marks of subject 4:");
        int s4 = swhn.nextInt();
       // total += s4;
        System.out.println("Enter marks of subject 5:");
        int s5 = swhn.nextInt();
       // total = total + s5;
      int  total =(s1+s2+s3+s4+s5);
        float grantTotal = total * 100.0f / (total_marks * 5);
        System.out.println("your percentage" + grantTotal + "%");
    }
}
      /*
  System.out.println("enter 2 number");
  float a = swhn.nextFloat();
  int b = swhn.nextInt();
  float c = a + b;
  System.out.println(c);
 }
}
*/