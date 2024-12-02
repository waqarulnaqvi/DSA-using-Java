package com.company;
import java.util.Scanner;
public class pt_13_cwh_16conditional {
     Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a=188;// age assign 19
//        boolean cond =(a==18||a>19);
         boolean cond=(a>=5);
                if(cond)//if only take boolean value.
         // if(a==18||a>19)//"=" is used for assignment & "==" is used for equality check...
            System.out.println("yes boy you can drive!");

            else
            System.out.println("no boy you can not drive yet!");


    }
}
