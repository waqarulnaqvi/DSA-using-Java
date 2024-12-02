package com.company;
import java.util.Scanner;
public class pt_98_Question_7_8_9_and_10 {
    public static void x_raise_to_power_y(int x,int y) {
        int power = 1;
        if (x < 0 || y < 0) {
            System.out.println(" x and y must be positive integer ");
            return;
        }
        else if (x==0 &&y==0) {
            System.out.println("INDETERMINATE FORM");
            return;
        }
         else if (y == 0 ) {
            System.out.printf("%d ^ %d = %d\n", x, y, 1);
            return;
        }
        for (int i = 2; i <= y; i++) {
                    power *= x;
            }
            System.out.printf("%d ^ %d = %d\n", x, y, x * power);
        }
        public static void in_words ( int k)
        {
            int rem;
            if (k > 0) {
                in_words(k / 10);
                rem = k % 10;
                if (rem == 1) {
                    System.out.print(" ONE ");
                } else if (rem == 2) {
                    System.out.print(" TWO ");
                } else if (rem == 3) {
                    System.out.print(" THREE ");
                } else if (rem == 4) {
                    System.out.print(" FOUR ");
                } else if (rem == 5) {
                    System.out.print(" FIVE ");
                } else if (rem == 6) {
                    System.out.print(" SIX ");
                } else if (rem == 7) {
                    System.out.print(" SEVEN ");
                } else if (rem == 8) {
                    System.out.print(" EIGHT ");
                } else if (rem == 9) {
                    System.out.print(" NINE ");
                } else {
                    System.out.print("ZERO");
                }
            }
        }

        public static void test_fibonacci ( int n){
            int a = 0, b = 1, c;
            for (int i = 0; i <= n + 1; i++) {
                if (a == n) {
                    System.out.println("IT IS A FIBONACCI NUMBER..");
                    break;
                } else if (n < a) {
                    System.out.println("IT IS NOT A FIBONACCI NUMBER..");
                    break;
                }
                c = a + b;
                a = b;
                b = c;
            }
        }
        public static void pythagoras_triplet(){
        int i,j;
        for( i =1;i<=50;i++)
        {
            int k=1;
            for( j =1;j<=50;j++)
            {

                    if(k!=i) {
                        k++;
                        continue;

                    }
                    System.out.printf("%d + %d = %d\n",i*i,j*j,(i*i)+(j*j));
            }

            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /* Problem:7
        System.out.println("Enter a number:");
         int n = sc.nextInt();
        System.out.println("Enter a power:");
         int p = sc.nextInt();
         x_raise_to_power_y(n, p);
          */

       /*Problem:8
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        in_words(n);
        */

       /*Problem:9
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        test_fibonacci(n);*/

        /*Problem:10*/
        pythagoras_triplet();

    }
}