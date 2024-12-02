package com.company;
import java.util.Scanner;
public class pt_24_cwh_29_ch6_practiceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//            float m = 0, sum = 0.0f;
//question:1
//        System.err.println("Array is :-");
//       float []b = {3.3f, 32.3f, 2.3f, 2.3f, 3.3f, 3.7f,2.6f};
////      method:1
//                for (float ele : b) {
//            System.err.print(" "+ele);
//            sum += ele;
//        }
//        method:2
//        System.err.print("Array element is :");
//        for (int ele =0;ele<b.length;ele++) {
//            System.err.print(" "+ b[ele]);
//            sum += ele;
//        }
//        System.err.println("\nSum of Array elements is :"+sum);
//    }
//}
        //method:3
//
//        System.err.println("Enter a length of a array :");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        System.err.println("Enter elements of array");
//        for(int i=0;i<n;i++) {
//            System.err.printf(" a[%d]:",i);
//          a[i]= sc.nextInt();
//         // System.err.println(a[i]+" ");
//
//            sum += a[i];
//        }
//        System.err.print("Array elements is :");
//     for(int j=0;j<n;j++)
//       {
//            System.err.print(a[j]+" ");
//        }
////    System.err.println("Array element is :"+a[0]);
////        System.err.println("Array element is :"+a[3]);
//      System.err.println("\nSum of array is "+sum);
//
//
//    }
//}
//question:2
//       Method 1:
//        float [] b1 = {3.3f, 32.3f, 2.3f, 2.3f, 3.3f, 3.7f,2.6f};
//        float k=sc.nextFloat();
//        boolean isinarray=false;
//                for (float b:b1)
//                {
//                    if (k==b){
////                  good practice when
////                        this element is fixed =this will changed;
//                        isinarray=true;
//                        break;
//                    }
//                }
//                if(isinarray)//if(true)
//                {
//                    System.out.println("The value is present in the array");
//                }
//                else{
//                    System.out.println("the value is not in the array");
//                }
//        Method 2:
//        System.err.println("Array is :-");
//        int b[] = {3, 32, 2, 2, 3, 3, 2};
//        int num = 2;
//        boolean IsInArray = false;
//        for (int ele : b) {
//            System.err.print(" " + ele);
//
////            sum += ele;
//            if (ele == num) {
//                IsInArray = true;
//              // break;
//            }
//        }
//        if (IsInArray  )
//            System.err.println("\nThe value ("+num +") is in the Array ");
//
//        else{
//            System.err.println("The value ("+num +") is not present in the Array ");
//            //  System.err.println("Sum of Array elements is :" + sum);
//        }
//    }
//}
//question:-3
//        System.err.println("Phyiscs marks of all student  is :-");
//        String stu[] = {"akash", "kamlesh", "raju"};
//        int b[] = {10, 10, 7};
//        int sum = 0;int k=0;
////        for (String k : stu) {
//            for (int ele : b) {
////                System.err.print(k);
//                System.err.println(stu[k]+" Physics Marks :" + ele);
//                sum = sum + ele;
//                k++;
//            }
//
//            int avg = (sum / stu.length);
//            System.err.println("\n Average Marks of Students is :" + avg);
//        }
//    }
//question:4
        //Method:1
//        System.err.println("Enter row of Matrix:");
//        int m = sc.nextInt();
//        System.err.println("Enter column of Matrix");
//        int n = sc.nextInt();
//        int[][] a = new int[m][n];
//        int[][] b = new int[m][n];
//        int sum[][] = new int[m][n];
//        System.err.println("Enter Elements of Matrix 1:");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.err.printf("a[%d][%d] :",i,j);
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.err.println("Enter Elements of Matrix 2:");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.err.printf("a[%d][%d] :", i, j);
//                b[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++)
//                sum[i][j] = a[i][j] + b[i][j];
//        }
//        System.err.printf("Sum of Matrix sum[%d][%d] : \n",m,n);
//        System.err.print("\"");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.err.print(" "+sum[i][j]);
//               if(i==m-1&&j==n-1) {
//                   System.err.print(" \"");
//               }
//            }
//            System.err.printf("\n ");
//        }
//    //   System.err.print("\"");
//    }
//}
//method:2
//        int[][] a={{1,2,3,4},{3,7,8,18}};
//        int[][] b = {{1, 2, 3, 6},
//                {3, 4, 5, 5}};
//        int[][] sum = {{0,0,0,0},
//                      {0,0,0,0}};
////        int []j1={8,8,9,9};
////        System.out.println("new "+j1.length);
//        int i;
////        System.out.println(a.length);
//        System.err.println("Enter Elements of Matrix 1:");
//        for ( i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {//ex: a{{a,b,c},{d,e,f}}; a{{0 index },{1 index}};
////                System.out.println("i "+a[i].length);
////                System.out.println("j "+a[j].length);
//                System.err.printf("a[%d][%d] :", i, j);
//                sum[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        System.err.printf("\nSum of Matrix sum[%d][%d] : \n", a[0].length, a[1].length);
//        for ( i = 0; i < sum.length; i++) {
//            for (int j = 0; j < sum[i].length; j++) {
//                System.err.print(" "+sum[i][j]);
//
//            }
//            System.err.println();
//        }
//     //   System.err.println(a.length);
//    }
//}
//question:5
//My Logic :1
//        int sum=0;
//        System.err.println("Enter a length of a array :");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        System.err.println("Enter elements of array");
//        for(int i=0;i<n;i++) {
//            System.err.printf(" a[%d]:",i);
//          a[i]= sc.nextInt();
//         // System.err.println(a[i]+" ");
//
//            sum += a[i];
//        }
//        System.err.print("Array elements is :");
//     for(int j=n-1;j>=0;j--)
//       {
//            System.err.print(a[j]+" ");
//        }
//    System.err.println("Array element is :"+a[0]);
//        System.err.println("Array element is :"+a[3]);
//      System.err.println("\nSum of array is "+sum);
//    }
//}
        //code with harry logic
//
////        int[] b = {1, 3, 4, 5, 55, 52, 7, };//last  comma after space/not space doesn't consider as array length.
////        System.out.println(b.length);
////        int[] c = {1, 3, 4, 5, 55, 52, 7,};//last  comma after space/not space doesn't consider as array length.
////        System.out.println(c.length);
//        int[] a = {1, 3, 4, 5, 55, 52, 7,4};
////        int l = a.length;
//
//        System.out.println("Original Array:");
//        for (int e:a){
//            System.out.print(" "+e);
//        }
//       /* int m=Math.floorDiv(11,3);print 3
//        System.out.println("\n"+m);Greatest Integer (Math.floorDiv) always consider before point value..
//        int k=Math.floorDiv(11,4);print 2
//        System.out.println("\n"+k);*/
//        int n = Math.floorDiv(a.length, 2);
//       for(int i=0;i<n;i++)
//       {
////           Method 1:
////           int t=a[i];
////           a[i]=a[l-i-1];
////           a[l-i-1]=t;
////  Method 2:
//           int t=a[i];
//           a[i]=a[a.length-i-1];
//           a[a.length-i-1]=t;
//       }
//        System.out.println("\nArray is:");
//       for(int value:a)
//       {
//           System.out.print(" "+value);
//       }
//    }
//}
        //MY LOGIC 2
//        System.err.println("Enter a length of a array :");
//        int m=sc.nextInt();
//        int a[]=new int[m];
//        System.err.println("Enter elements of array");
//        int n = Math.floorDiv(m, 2);//int k=Math.floorDiv(m,2) is used to find Greatest Integer Number.
//
//        for(int j=0;j<m;j++) {
//            System.err.printf(" a[%d]:", j);
//            a[j] = sc.nextInt();
//        }
//        for(int i=0;i<n;i++)
//        {
//            int t=a[i];
//            a[i]=a[m-i-1];
//            a[m-i-1]=t;
//
//        }
//        System.err.println("Array is:");
//        for(int value:a)
//        {
//            System.err.print(" "+value);
//        }
//    }
//}
//question:6
//       // System.err.println(Integer.MAX_VALUE);
//                int a[]={8,4,4,22,55,33999333,555,5,555};
//       //System.err.println(Byte.MAX_VALUE);
//    int max=Integer.MIN_VALUE;
//    for(int i=0;i<a.length;i++) {
//        if (a[i] > max) {
//            max = a[i];
//        }
//    }
//        System.out.println("Maximum value is :"+max);
//
//    }
//}
//question:7
        //  System.err.println(Integer.MAX_VALUE);
//                int a[]={8,4,4,22,55,33999333,555,5,555};
//         //     System.err.println(Byte.MIN_VALUE);
//    int min=Integer.MAX_VALUE;
//    for(int i:a) {
//        if (i < min) {
//            min = i;
//        }
//    }
//        System.out.println("Minimum value is :"+min);
//
//    }
//}
        //question:8
        int a[] = {8,11,4, 53, 55, 33999333};
        boolean isSorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isSorted = false;
                break;

            }
        }
        if (isSorted)
            System.out.println("Arry is Sorted ");
        else
            System.err.println("Array is Not Sorted ");
    }
    }
//        String[][][] arr = new String[2][3][4];
//    }
//    }