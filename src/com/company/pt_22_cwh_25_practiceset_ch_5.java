package com.company;
import java.util.Scanner;
public class pt_22_cwh_25_practiceset_ch_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int i, j;
//        //question:-1
// by for loop
// int n = 4;````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
//        for (i = 4; i >0; i--) {
//          //  System.err.println( );
//            for (j = 0; j < i; j++) {
//                System.err.print("*");
//            }
//                System.err.println();
//            }
//        }
//    }
        //by while loop
//        i = 4;
//        j = 0;
//        while (i > 0)
//
//        //   for (i = 4; i >0; i--)
//        {
//            while (j < i) {
//
//                //  for (j = 0; j < i; j++) {
//                System.err.print("*");
//j++;
//            }
//
//            System.err.println();
//i--;
//        }
//    }
//}

//question:-2(my logic)
//
//        System.out.println("Enter a n even number ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        while (n % 2 == 0 && m % 2 == 0) {
//            int sum = n + m;
//            //   continue;
//            System.err.println("Sum:-" + sum);
//            break;
//
//        }
//        if (n % 2 != 0 || m % 2 != 0) {
//            System.err.println("Please Enter even number");
//        }
//    }
//    }
        //question:-2(code with harry logic)
        System.err.println("Enter a n number");
        int sum = 0,l=0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + (2 * i);
            l=1*(2*i);
           // sum = sum + (2 * i+1)
            //l=1*(2*i+1);
            System.err.printf("%d even number:%d\n",i,l);
        }

        System.err.println("Sum of even number is ");
        System.err.println(sum);
    }
}
        //        question:-3
//        System.out.println("Enter a number to be multiply ");
//        int n = sc.nextInt();
//        int m = 1;
//        System.err.printf("multiplication table of %d is :\n", n);
//        do {
//            // m++;
//        //    int multiply = n * m;
////            System.err.printf("multiplication of %d is :\n", n);
//            System.err.println(n + "X" + m + "=" +n*m);
//         //   System.err.println(n + "X" + m + "=" +multiply);
//
//            m += 1;
//
//        }
//
//        while (m <= 10);
//    }
//}

//    }
//}
//        System.err.printf("multiplication table of %d is :\n", n);
//        while (m <= 10)
        //  while (m <= 10);
//        {
//            // m++;
//            int multiply = n * m;
//        //    System.err.printf("multiplication of %d is :\n", n);
//            System.err.println(n + "X" + m + "=" + multiply);
//
//            m += 1;
//        }
//     //   System.err.println(n + "X" + m + "=" + n*m);
//
//    }
//}
   //     System.err.printf("multiplication table of %d is :\n", n);
//        for(int m=1;m<11;m++)
//        {
//            // m++;
//            int multiply = n * m;
//            System.err.printf("multiplication of %d is :\n", n);
//            System.err.println(n + "X" + m + "=" + multiply);
//
//        }
//
//    }
//}
//
//question:-4
//        System.err.println("Multiplication table of 10 is :-");
//        int  n = 10;
//       do {
//            int sum = 10 * n;
//            System.err.println("10" + "X" + n + "=" + sum);
//            n--;
//        }
//       while (n !=0);
//    }
//}
//question:-5 factorial n=n+n-1*n-2+....1
        //e.g.:-5!=5*4*3*2*1
        //sum ke liye 0 se initialize karte hai and product ke liye 1 se initialize karte hai
        //e.g.:-f=1//product
        //e.g.:-k=0//sum
//        System.err.println("Enter n numbers :-");
//        int n = sc.nextInt();
//        int f =1,c=n-1;//k=1;
//     int   i = 1;
//        System.err.printf("%d!:%d",n,n);
//        while (i <= n) {
//            f = f*i;
////k*=f;
//            if(c>0) {
//               // c--;
//                System.err.printf("*%d", c);
//c--;
//            }
//          //  System.err.printf("=%d",f);
//            i++;
////          c--;
//        }
////        System.err.print("1");
//        System.err.printf("=%d",f);
//    }
//}
//


//question:-6
//        System.out.println("How many times do you want to repeat 5 :- ");
//        int n = sc.nextInt();
//        int c = 1;
//        System.err.printf("Repeat till %d :\n",n);
//        while (c <= n) {
//            System.err.printf("  %dth Repeat:-",c);
//            System.err.println("5");
//c++;
//        }
//    }
//
//           }
//question:-7
        //       System.out.println("How many times do you want to repeat 1 :- ");
        //     int n = sc.nextInt();
//        int c = 1;
//        System.err.printf("Repeat till %d :\n",n);
//        while (c <= n) {
//            System.err.printf("  %dth Repeat:-",c);
//            System.err.println("1");
//            c++;
//        }
//    }
//
//}
//        System.err.printf("Repeat till %d :\n", n);
//        for (int c = 1; c <= n; c++) {
//            System.err.printf("  %dth Repeat:-", c);
//            System.err.println("1");
//        }
//    }
//}
        //question:9
//        System.out.println("Enter a number to be multiply ");
//        int n = sc.nextInt();
//        int m = 1,sum=0;
//        System.err.printf("multiplication table of %d is :\n", n);
//        do {
//            // m++;
//        //    int multiply = n * m;
//            sum+=n*m;
////            System.err.printf("multiplication of %d is :\n", n);
//            System.err.println(n + "X" + m + "=" +n*m);
//         //   System.err.println(n + "X" + m + "=" +multiply);
//
//            m += 1;
//
//        }
//
//        while (m <= 10);
////sum=+n*m;
//        System.err.printf("sum of multiplication table of %d is :%d",n ,sum);
//    }
//}


        //question;-11
//        System.out.println("How many times do you want to repeat 2 :- ");
//        int n = sc.nextInt();
//
//        System.err.printf("Repeat till %d :\n", n);
//        for (int c = 1; c <= n; c++) {
//            System.err.printf("  %dth Repeat:-", c);
//            System.err.println("2");
//        }
//    }
//}


