package com.company;

public class pt_167_matrix_addition_different_type {
    public static void add_mat_char(int m1[][],char m2[][],String m5[][])
    {
        char m3[][]=new char[m1.length][m1[0].length];
        int m4[][]=new int[m1.length][m1[0].length];
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m4[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("MATRIX ADDITION CHARACTER IS:");
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m2[i].length; j++) {
//                System.out.print(m4[i][j]+"  ");
                System.out.print((m1[i][j]+m2[i][j])+"  ");
            }
            System.out.println();
        }
        System.out.println("MATRIX ADDITION STRING IS:");
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print((m1[i][j]+m5[i][j])+"  ");
            }
            System.out.println();
        }
        System.out.println("MATRIX ADDITION STRING IS:");
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print((m5[i][j]+m1[i][j])+"  ");
            }
            System.out.println();
        }
    }
    public static int[][] return_mat_add(int[][] m1, char[][] m2) {
        int m4[][] = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m4[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m4;
//        return m1+m2;//Error..
//        return m1[i][j] + m2[i][j];//Error..
//        return (m1[0][0] + m2[0][0]);//Error.. to run this int[][] must be int.
    }
    public static void main(String[] args) {
        int mat1[][]={{1,2,3},{4,5,6}};
        char mat2[][]={{'a','b','c'},{'d','e','f'}};
        String mat3[][]={{"Abc","Ere","ER"},{"ER","HH","jj"}};
//        add_mat_char(mat1,mat2,mat3);
//        System.out.println(return_mat_add(mat1,mat2));
        System.out.println("MATRIX ADDITION CHARACTER USING REFERENCE VARIABLE IS:");
        int k[][]=return_mat_add(mat1,mat2);
        for (int i = 0; i <k.length ; i++) {
            for (int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
