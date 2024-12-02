//import java.util.Scanner;
//public class MatrixMultiplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter length of row of matrix 1:");
//        int r1 = sc.nextInt();
//        System.out.println("Enter length of column of matrix 1:");
//        int c1 = sc.nextInt();
//        int m1[][] = new int[r1][c1];
//
//        System.out.println("Enter length of row of matrix 2:");
//        int r2 = sc.nextInt();
//        System.out.println("Enter length of column of matrix 2:");
//        int c2 = sc.nextInt();
//        int m2[][] = new int[r2][c2];
//        int mul[][]=new int[r1][c2];
//
//        if (c1 != r2) {
//            System.out.println("Matrix multiplication is not possible!");
//
//
//        } else {
//            System.out.println("Enter Element in matrix 1:");
//            for (int i = 0; i <r1 ; i++) {
//                for (int j = 0; j <c1 ; j++) {
//                    System.out.printf("m1[%d][%d]=",i,j);
//                    m1[i][j]=sc.nextInt();
//                }
//            }
//            System.out.println("\nEnter Element in matrix 2:");
//            for (int i = 0; i <r2 ; i++) {
//                for (int j = 0; j <c2 ; j++) {
//                    System.out.printf("m2[%d][%d]=",i,j);
//                    m2[i][j]=sc.nextInt();
//                }
//            }
//            System.out.println("\nMatrix 1 is :");
//            for (int i = 0; i < m1.length; i++) {
//                for (int j = 0; j < m1[0].length; j++) {
//                    System.out.print(m1[i][j] + "\t");
//                }
//                System.out.println();
//            }
//
//            System.out.println("\nMatrix 2 is :");
//            for (int i = 0; i < m2.length; i++) {
//                for (int j = 0; j < m2[0].length; j++) {
//                    System.out.print(m2[i][j] + "\t");
//                }
//                System.out.println();
//            }
//
//            for (int i = 0; i <r1  ; i++) {
//                for (int j = 0; j <c2 ; j++) {
//                    mul[i][j]=0;
////                    for (int k = 0; k <c1 ; k++) {
//                    for (int k = 0; k <r2 ; k++) {
//                        mul[i][j]+=m1[i][k]*m2[k][j];
//                    }
//               }
//         }
//
//            System.out.println("\nMatrix Multiplication is:");
//            for (int i = 0; i < r1; i++) {
//                for (int j = 0; j < c2; j++) {
//                    System.out.print(mul[i][j] + "\t");
//                }
//                System.out.println();
//            }
//
//        }
//    }
//}
