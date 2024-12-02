package com.company;

import java.util.Scanner;

public class pt_296_gravity_question_pattern {
    public static void main(String[] args) {

        System.out.println("Enter a Number:");
        String inp=new Scanner(System.in).nextLine();
//        String inp="AVIRAL";

        Character [][]mat=new Character[inp.length()][inp.length()];

                for (int i = 0; i < mat.length ; i++) {
                    for (int j = 0; j < mat.length; j++) {
                      if(i==0 )
                      {
                          mat[i][j]= inp.charAt(j);
                      } else if (j==0) {
                          mat[i][j]=inp.charAt(i);
                      } else if (i== mat.length-1) {
                          mat[i][j]=inp.charAt(i-j);
                      } else if (j== mat.length-1) {
                          mat[i][j]=inp.charAt(j-i);
                      }
                      else {
                          mat[i][j]='-';
                      }
                    }
                }

        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j <mat.length ; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();

        }



    }
}
