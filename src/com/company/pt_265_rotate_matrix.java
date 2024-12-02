package com.company;

public class pt_265_rotate_matrix {
    public static void main(String[] args) {
                int a[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                int b[][]=new int[a.length][a[0].length];

        System.out.println("Current Matrix is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();

//        Brute Force Technique: Time complexity:O(n2)

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
            b[j][i]=a[i][j];
            }
        }

//        Optimal solution :time complexity:O(n2)+O(n2)
//        Space complexity : O(1)

//                for (int i = 0; i < a.length; i++) {
//                    for (int j = 0; j < a[0].length; j++) {
//                     //Swapping:
//
//                      int t = a[i][j];
//                        a[i][j] = a[j][i];
//                        a[j][i] = t;
//                    }
//                }
//

//int k=a.length-1;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <a[0].length ; j++) {
//
//
//                    int t=a[i][j];
//                    a[j][i]=a[k][j];
//                    a[k][j]=t;
//                }
//            k--;
//            }
////00=20
////        10=21
////                20=23
//
//
        System.out.println("Final Matrix is :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
