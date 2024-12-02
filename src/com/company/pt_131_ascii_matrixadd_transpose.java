package com.company;

public class pt_131_ascii_matrixadd_transpose {
    static void asciismall()
    {
        for (char ch='a';ch<='z';ch++) {
            int ascii=ch;
            System.out.printf("%c=%d\n",ch,ascii);
        }
    }
    static void asciicapital()
    {
        for (int i = 65; i <=90 ; i++) {
            char ch=(char)i;
            System.out.println("Ascii of value of "+(char)i+"is"+i);
        }
    }
    static void matrix_add() {
        int a[][] = {{3, 4, 4},
                {3, 2, 2}};
        int b[][] = {{3, 4, 4},
                {3, 2, 2}};
        int sum[][] = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of matrix 1 and matrix 2:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }

    }
    static void transpose()
    {
        int a[][] = {{3, 4, 4},
                    {3, 2, 2}};
        System.out.println("Before Transpose:");
        for (int i = 0; i <a.length ; i++) {
        for (int j = 0; j <a[0].length ; j++) {
            System.out.print(a[i][j]+"  "); }
            System.out.println(); }
        System.out.println("After Transpose:");
        for (int i = 0; i <a[0].length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                System.out.print(a[j][i]+"  "); }
            System.out.println(); }

    }

    public static void main(String[] args) {
//       asciicapital();
//       asciismall();
//        matrix_add();
        transpose();
    }
}
