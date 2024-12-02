package com.company;
import java.util.Scanner;
public class pt_23_ch_6_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //classroom of 500 students_You have to store marks of 500 students
        //  int [] marks =new  int[7];
//        array is object.
        //ch_6 video 1:-
//        int []marks;
//        marks =new int[10];
       /*int []l;
       l=new int[33];
        int []kk=new int[4];
  declaration[]=memory allocation[4];
        int []lk={2,23,3,3,3,3,3};*/
//        int []k={1,2,3,4,3,3,3,3};
//        //why do you use arrays ?
//        //advantage:accessing elements in arrays is faster
////        marks [-1]=100;-Throws an error
//        marks [1]=1003;
//        marks [2]=1300;
//        marks [4]=1030;
//        marks [6]=1030;
//        marks [7]=100;
//        marks [9]=100;
////        marks [11]=100; -throws an error "java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10"
//        System.err.println(marks[0]);
//        System.err.println(marks[5]);
//        System.err.println(k[3]);
//    }
//}
//ch 6 video 2:-
        float k[] = {1.22f, 44f, 3f, 77f, 6f, 3f, 3f,};
//        System.err.println(k.length);
//        System.err.println(k[1]);
//        //  System.err.println(k.length);
//      System.err.println("printing using naive method");
//       System.err.println(k[0]+"\n"+k[1]);
//        String  str=sc.next();
//        String [] students ={"\"kamlesh\n","ravi"};
        String [] sru={"ali","abbas","\"kamlesh\n","ravi"};
//        System.err.println(sru +students[0]);
//        System.err.println(sru.length);
//        System.err.print(sru[2]);
//        sc.close(); closing the Scanner class.
//        System.err.println(sru[3]);
////        System.err.println(students.length);
//        //displaying the array (for loop)
//        System.err.println("printing using for loop");
//        //Displaying the array in reverse order
//            for (int i = k.length-1; i >=0; i--) {//its is called a array traversal
//
//              // System.err.println("value of i is :"+i);
//                System.err.printf("value of k[%d] =%f\n",i,k[i]);
//                //        System.err.println(k.length);
//
//            }
//
//           System.err.println("array length is :");
//        //}
//        System.err.println(k.length);
////    }
//
//        //quick quiz(for_each loop)
//        System.err.println("printing using for-each loop:");
//float ele;-it will give error don't declare for-each loop variable outside of the loop.
//for( float ele:k) {
//    System.err.println(ele);
//}
//   for(String ele:sru){
//       System.err.print(" "+ele);
//   }
//        System.err.println();
////   for(float ele:(k.length)) //(k.length) function is not allowed in for-each loop.
//   for(float ele:k){
//       System.err.print(" "+ele);
//   }
//    }}

// ch6_video_3
//multidimensional arrays in simple word  (is also called as array of array)
        int[] marks;//1d array
//        int[][] falts;//2d array
//        falts = new int[2][3];

//       int [][] falts;
//       falts=new int[2][3];
//        falts[0][0] = 001;
//        falts[0][1] = 002;
//        falts[0][2] = 003;
//        falts[1][0] = 004;
//        falts[1][1] = 005;
//        falts[1][2] = 006;
////           falts[2][0]=50;
////   falts[2][1]=50;
////   falts[2][2]=50;
//
//        // for (int ele : falts)
//        //{
////            for(int k=falts[1][2]) {
////                System.err.println(falts);
////            }
////
////            System.err.println(ele);
//        System.err.println("printing using for loop");
//        int i, j;
//        //Displaying the array in reverse order
//        //   for (int i = falts.length - 1; i >= 0; i--) {//its is called a array traversal
//        for (i = 0; i < falts.length; i++) {
//            //     for (int j = falts[i].length - 1; j >= 0; j--)
//            for (j = 0; j < falts[i].length; j++) {
//
//                // System.err.println("value of i is :"+i);
//                //  System.err.printf("value of falts[%d][%d] =%d%d\n", i,j, falts[i][j]);
//                //method :1
////                System.err.print(falts[i][j]+"\t");
////                //        System.err.println(k.length);
////
////            }
////            System.err.println("");
//                //method :2
//                System.err.printf("\t[%d][%d]=%d",i,j,falts[i][j]);
////                System.err.println(falts[i].length);
//
//                if (j > falts[i].length-2)
//                  //  if (j >=falts[i].length-1)
//                 //   if (j == falts[i].length-1)
//                    {
//                    System.err.println();
//
//
//                    }
//
//            }
//        }
//
//    }
//}
    int [][] falts;
       falts=new int[2][3];
               falts[0][0] = 001;
               falts[0][1] = 002;
               falts[0][2] = 003;
               falts[1][0] = 004;
               falts[1][1] = 005;
               falts[1][2] = 006;
               System.err.println("printing using for loop");
               int i, j;
               for (i = 0; i < falts.length; i++) {
        for (j = 0; j < falts[i].length; j++) {

        System.err.printf("\t[%d][%d]=%d",i,j,falts[i][j]);
//
            if (j >falts[i].length-2)
//        if (j == falts.length)
        System.err.println();
//            int []n=new int[]{1,2,34,45,5};
//            for (int e:n){
//                System.out.print(e+" ");

        }

        }
        }

        }

