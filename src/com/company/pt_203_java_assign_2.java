////Question 2.Write a program where interface can be used to support multiple inheritance.import java.util.Scanner;
//package com.company;
//interface Cam{
//    String takesnap(String snap);
//}
//interface wifinet{
//    String[] networks();
//}
//interface netlocation extends wifinet{
//    String[] connectionlocation();
//}
//class Cellphn{
//    void callnumber(int num){
//        System.out.println("Calling number "+num);
//    }
//    void pickcall(){
//        System.out.println("Connecting..");
//    }
//}
//class Smtphone extends Cellphn implements Cam,netlocation{
//   @Override
//    public String takesnap(String snap){
//        return snap;
//    }
//   @Override
//    public String[] networks(){
//       System.out.println("Getting Lists of Network");
//       String[] networklist={"jio 4G","airtel","vodaphone"};
//       return networklist;
//    }
//    @Override
//    public String[] connectionlocation(){
//        System.out.println("\nGetting Lists of Signallocation");
//        String[] netloc={"aliganj","aminabad","sahadatganj"};
//        return netloc;
//    }
//}
//public class java_assign_2 {
//    public static void main(String[] args) {
//     Smtphone obj=new Smtphone();
//        obj.callnumber(123);
//        obj.pickcall();
//        String network[] =obj.networks();
//        for (String ele:network) {
//            System.out.print(ele+" ");
//        }
//        String loc[]=obj.connectionlocation();
//        for (String ele:loc) {
//            System.out.print(ele+" ");
//        }
//        System.out.println(obj.takesnap("Taking your photo.."));
//    }
//}
//
//
////package com.company;
////import java.util.Scanner;
//// public class java_assign_2 {
////     public static void main(String[] args) {
////       Scanner sc=new Scanner(System.in);
//////Question 5.Write a program to multiply  two matrices of order mXn and pXq.
////        System.out.println("enter the length of matrix 1");
////        int m=sc.nextInt();
////        int n=sc.nextInt();
////        System.out.println("enter the length of matrix 2");
////        int p=sc.nextInt();
////        int q=sc.nextInt();
////        int [][]m1=new int[m][n];
////        int [][]m2=new int[p][q];
////        int [][]mul=new int[m][q];
////        if(n==p) {
////            System.out.println("Enter the Elements of Matrix 1:");
////            for (int i = 0; i < m; i++) {
////                for (int j = 0; j < n; j++) {
////                    System.out.printf("m1[%d][%d]=", i, j);
////                    m1[i][j] = sc.nextInt();
////                }
////            }
////            System.out.println("Enter the Elements of Matrix 2:");
////            for (int i = 0; i < p; i++) {
////                for (int j = 0; j < q; j++) {
////                    System.out.printf("m2[%d][%d]=", i, j);
////                    m2[i][j] = sc.nextInt();
////                }
////            }
////            System.out.println("Matrix 1 is:");
////            for (int i = 0; i < m; i++) {
////                for (int j = 0; j < n; j++) {
////                    System.out.print(m1[i][j] + " ");
////                }
////                System.out.println();
////            }
////            System.out.println("Matrix 2 is:");
////            for (int i = 0; i < p; i++) {
////                for (int j = 0; j < q; j++) {
////                    System.out.print(m2[i][j] + " ");
////                }
////                System.out.println();
////            }
//////            Method:1
////            for (int i = 0; i < m; i++) {
////                for (int j = 0; j < q; j++) {
////                    for (int k = 0; k < n; k++)
////                        mul[i][j] += m1[i][k] * m2[k][j];
////                }
////            }
//////            Method:2
//////            int sum=0;
//////            for (int i = 0; i < m; i++) {
//////                for (int j = 0; j < q; j++) {
//////                    for (int k = 0; k < n; k++) {
//////                        sum += m1[i][k] * m2[k][j];
//////                    }
//////                    mul[i][j] = sum;
//////                    sum = 0;
//////                }
//////            }
////            System.out.println("Product of Matrix 1 and 2 is:");
////            for (int i = 0; i < m; i++) {
////                for (int j = 0; j < q; j++) {
////                    System.out.print(mul[i][j] + " ");
////                }
////                System.out.println();
////            }
////
////        }
////        else {
////            System.out.println("Matrix Multiplication not possible");
////        }
////    }
////}
