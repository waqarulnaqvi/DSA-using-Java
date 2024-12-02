package com.company;
import java.util.Scanner;
//question 1(code with harry method)
//public class ch7_practiceset {
//  static   void multi(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.err.format("%d X %d = %d\n", n, i, n * i);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("enter a number :");
//        int i = sc.nextInt();
//        multi(i);
//    }
//}
    //question:1(my method)
//        System.err.println("Enter a number :");
//        int m,i,n=sc.nextInt();
//        System.err.printf("Multiplication table of %d is:\n",n);
//        for( i=1;i<=10;i++) {
//            m = n * i;
//           System.err.printf("%d X %d=%d\n",n,i,m);
//        }
//      //  System.err.println(m);
//      //  System.err.printf("%d X %d=%d",n,i,m);
//
//    }
//}
//question2:
//public class ch7_practiceset {
//    static void pattern(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.err.print(" * ");
//            }
//            System.err.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("enter a number :");
//        int i = sc.nextInt();
//        pattern(i);
//    }
//}
//}
//    //question:3
//public class pt_28_ch_7practiceset {
//        static int natural(int k) {
//        //base condition
//        if (k == 1) {
//            return 1;
////            return k;
//        }
////            if (k == 1) {//if you don't understand logic then just dry run it..
////                return 2;//it's not a natural number logic i am just trying to cross checking my logic..
////        }
//        else {
//            return k + natural(k - 1);
//        }
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.err.println("Enter any natural number");
//      int n = sc.nextInt();
////        if (n > 0) {
////            int p = natural(n);
////            System.err.println("sum is:" + p);
////
////        } else {
////            System.err.println("PLEASE ENTER NATURAL ONLY");
////        }
//        if (n ==0) {
//            System.err.println("PLEASE ENTER NATURAL ONLY");
//
//        } else {
//            int p = natural(n);
//            System.err.println("sum is:" + p);
//
//      }
//    }
//}
////question:4
//class ch7_practiceset {
//    public static void main(String[] args) {
////          Method :1`
//        for (int i = 5; i >=1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.err.print(" * ");
//
//            }
//            System.err.println();
//        }
//        //Method :2 (After becoming intermediate codder)
//        for (int i = 0; i <5; i++) {
////            for (int j = 4; j >= i; j--) {
//            for (int j = 5; j > i; j--) {
//                System.err.print(" * ");
//
//            }
//            System.err.println();
//        }
//    }
//}
//question:5
//    //nth term means start with 1
//static int fibo(int a) {
////    if (a==1) {
////        return 0;
////    }
////   else if(a==2){
//    //return 1;}
//    if(a==1||a==2)
//    return a-1;
//    else{
//        return  fibo(a - 1) + fibo(a - 2);
//    }
//}
//    //by index means in programming is start with 0
////    static int fibo(int a) {
////        if (a<=1) {
////            return a;
////        } else {
////            return  fibo(a - 1) + fibo(a - 2);
////        }
////    }
////    static int fibo1(int a) {
////        return a != 0 && a != 1 ? fibo(a - 1) + fibo(a - 2) : a;
////    }
////
////    static int fibo2(int a) {
////        return a <= 1 ? a : fibo2(a - 1) + fibo2(a - 2);
////    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter the  number : ");
//        int n = sc.nextInt();
//        System.err.println(fibo(n));
////        System.err.println(fibo1(n));
////        System.err.println(fibo2(n));
//    }
//}
//question:6
//class ch7_practiceset {
//    Method:1
//    static void avg(float n) {
//        float sum = 0;
//        for (int i = 1; i <= n; i++) {
//          //method 1:
//            //port 1
////            sum+=i/2f;
//          //part 2
//            // sum = sum + i / 2f;
//          //part 3
//            //  sum = sum + (i / 2f);
//            //method 2:
//            //   sum +=  i;
//        }
//           sum=sum/2f;
//        System.err.println(sum);
//        }
//Method :2 (After becoming intermediate codder)
//static void avg(float n) {
//    float sum = 0,avg;
//    for (int i = 1; i <= n; i++) {
//        sum+=i;
//    }
//    avg=sum/n;
//    System.err.println(avg);
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter any number");
//        float k = sc.nextFloat();
//        avg(k);
//    }
//}
//My Method 2 (After becoming intermediate codder)
class pt_28_cwh_35_ch7_practiceset {
//    static void avg(float ...n) {
//        float sum = 0;
//        for (int i = 0; i <n.length ; i++) {
//            sum+=n[i];
//        }
//        float avg=sum/n.length;
//        System.err.println(avg);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        avg(3,3,4,4,4);
//    }
//}
//question:7
//    cwh Method :1
    static void pattern(int n) {
        if (n >0) {
          pattern(n - 1);
            for (int j = 0; j < n; j++) {
                System.err.print(" * ");
            }
            System.err.println();
        }
    }
    static void revpattern(int n) {
        if (n !=0) {
            for (int j = 0; j < n; j++) {
                System.err.print(" * ");
//                revpattern(n - 1);//Not give desired output:
            }
            System.err.println();
            revpattern(n - 1);
        }
//        revpattern(n - 1); //Error because compiler will infintely call this..

    }
//    static void pattern(int n) {
//      // pattern(n - 1);//error
////        if(n==0)
////            pattern(n - 1);
//        if (n >0) {
//          pattern(n - 1);
//            for (int j = 0; j < n; j++) {
//                System.err.print(" * ");
//    //pattern(n - 1);
//            }
//            System.err.println();
//        }
//        if(n!=0)
//        pattern(n - 1);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the  number : ");
        int n = sc.nextInt();
        revpattern(n);
        pattern(n);

    }
}
//My Method :2 (After becoming intermediate codder)
//    static void pattern(int n) {
//        if(n!=0)
//            pattern(n - 1);
//        if (n >0) {
//            for (int j = 0; j < n; j++) {
//                System.err.print(" * ");
//            }
//            System.err.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter the  number : ");
//        int n = sc.nextInt();
////        System.out.println(6*7+3*4);
//        pattern(n);
//    }
//}
//question:8
//    cwh Method:1
//    static void pattern(int n) {
//        // pattern(n - 1);//error
//        if (n > 0) {
//    //pattern(n - 1);
//            for (int j = 0; j < n; j++) {
//                System.err.print(" * ");
//            }
//            System.err.println();
//            pattern(n - 1);
//        }
//    }
//    static void pattern(int n) {
//        // pattern(n - 1);//error
//        if (n > 0) {
////            pattern(n - 1);
//            for (int j = n; j > 0; j--) {
//                System.err.print(" * ");
//            }
//            System.err.println();
//            pattern(n - 1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter the  number : ");
//        int n = sc.nextInt();
//        pattern(n);
//    }
//}
//My Method :2 (After becoming intermediate codder)
//static void pattern(int n) {
//    if (n >0) {
//        for (int j = 0; j < n; j++) {
//            System.err.print(" * ");
//        }
//        System.err.println();
//    }
//        if(n!=0) {
//            pattern(n - 1);
//        }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter the  number : ");
//        int n = sc.nextInt();
//        pattern(n);
//    }
//}
//question:9
//     double converstor(float c) {
//         double f= (c * 1.8) + 32;
//        //float f= (c * 1.8f) + 32F;
//         return  (float) f;
////         return f;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ch7_practiceset f = new ch7_practiceset();
//        System.err.println("Enter oC value");
//        Float n = sc.nextFloat();
//        System.err.println("Fahrenheit value is :");
//        System.err.println(f.converstor(n)+"F");
//    }
//}
    //question:10
//    static int natural(int k) {
//        int sum = 0;
//        for (int i = k; i >0; i--) {
//            sum += i;
//        //    return 6;
//        }
//         return sum;
//    }
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.err.println("Enter any natural number");
//            int n = sc.nextInt();
////            if (n > 0) {
////                int p = natural(n);
////                System.err.println("sum is:" + p);
////            } else {
////                System.err.println("PLEASE ENTER NATURAL ONLY");
////            }
//        if (n <=0) {
//            System.err.println("PLEASE ENTER NATURAL ONLY");
//
//        } else {
//            int p = natural(n);
//            System.err.println("sum is:" + p);
//
//        }
//        }
//    }