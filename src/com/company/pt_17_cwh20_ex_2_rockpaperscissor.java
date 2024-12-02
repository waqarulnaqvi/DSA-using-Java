package com.company;
import java.util.Random;
import java.util.Scanner;
public class pt_17_cwh20_ex_2_rockpaperscissor {
    public static void main(String[] args) {
        System.err.println("Tell me your name :");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0, k = 0, c = 0,i;
        Random choice = new Random();
        for (i = 1; i <= 5; i++) {
            int num = 1 + choice.nextInt(3);
            System.err.println("What do you want to choose: \t 1.\"rock\"\t2.\"paper\"\t\"3.scissor\"");
            int ch = sc.nextInt();
            if (num == 1) {
                System.err.println("\"computer choice is:\" ROCK");
            }
          else  if (num == 2) {
                System.err.println("\"computer choice is:\" PAPER");
            }
           else if (num == 3) {
                System.err.println("\"computer choice is:\" SCISSOR");
            }
            switch (ch) {
                case 1: {
                    if (num == 1) {
                        System.err.println("draw");
                        c++;
                    } else if (num == 2) {
                        System.err.println("lose");
                        k++;
                    } else {
                        System.err.println("win");
                        count++;
                    }
                    break;
                }
                case 2: {
                    if (num == 2) {
                        System.err.println("draw");
                        c++;
                    } else if (num == 3) {
                        System.err.println("lose");
                        k++;
                    } else {
                        System.err.println("win");
                        count++;
                    }
                    break;
                }
                case 3: {
                    if (num == 3) {

                        System.err.println("draw");
                        c++;
                    } else if (num == 1) {
                        System.err.println("lose");
                        k++;
                    } else {
                        System.err.println("win");
                        count++;
                    }
                    break;
                }
                default:
                    System.err.println("sahi choose kar");
            }
        }
            System.err.println("\n RESULT:\n" + count + " win ");
            System.err.println(c + "Draw");
            System.err.println(k + "lose");
            if ((count >= 3 && c <= 2) || (count == 2 && c == 2) || (count == 1 && c == 4))
                System.err.println("\"Congratulations " + n + " you won\"");
            else if ((count == 1 && c == 3) || (count == 2 && c == 1))
                System.err.println("Match is Draw");
            else
                System.err.println("Computer won Better Luck Next Time :)");
        }
    }
//package com.company;
//import java.util.Random;
//import java.util.Scanner;
//public class cwh20_rockpaperscissor {
//    public static void main(String[] args) {
//        System.err.println("Tell me your name :");
//        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
//        int count = 0;
//        int k=0;
//        int c = 0;
//        Random choice = new Random();
//        int num, i;
//      //  int num=0;
//        for (i = 1; i <= 5; i++) {
//            num = 1+choice.nextInt(3);
//           // num = 1 + choice.nextInt(3);
//            //    System.err.println("\"computer choice is:\"" + num);
//
////            for (int j = 1; j <= 5; j++) {
//            System.err.println("What do you want to choose: \t 1.\"rock\"\t2.\"paper\"\t\"3.scissor\"");
//            int ch = sc.nextInt();
//            System.err.println("\"computer choice is:\"" + num);
////            if ((ch == 1 && num == 2)||(ch == 2 && num == 3) || (ch == 3 && num == 1))
////                count = 1;
////            System.err.println(count);
////            count++;
//
////                System.err.println("\"computer choice is:\"" + num);
//
//
//            //  for(ch=1; ch<=5;ch++) {
//            //   for(int k=1;k<=5;k++) {
//            switch (ch) {
//                //    for(ch=1; ch<=5;ch++) {
////              for(int k=1;k<=5;k++) {
//                case 1: {
//                    if (num == 1) {
//                        System.err.println("draw");
//                        c++;
//                    }
//                    else if (num == 2) {
//                        System.err.println("lose");
//                        k++;
//                    }
//                    else {
//                        System.err.println("win");
//                        count++;
//                    }
//                    //   System.err.println("\"computer choice is:\"" + num);
//                    break;
//                }
//                case 2: {
//                    if (num == 2) {
//                        System.err.println("draw");
//                        c++;
//                    }
//                    else if (num == 3) {
//                        System.err.println("lose");
//                        k++;
//                    }
//                    else {
//                        System.err.println("win");
//                         count++;
//                    }
//                    // System.err.println("\"computer choice is:\"" + num);
//                    break;
//                }
//
//                case 3: {
//                    if (num == 3) {
//
//                        System.err.println("draw");
//                        c++;
//                    }
//                    else if (num == 1) {
//                        System.err.println("lose");
//                        k++;
//                    }
//                    else {
//                        System.err.println("win");
//                          count++;
//                    }
//
//                    // System.err.println("\"computer choice is:\"" + num);
//                    break;
//                }
//                default:
//                    System.err.println("sahi choose kar");
////                    if ((ch == 1 && num == 2)||(ch == 2 && num == 3) || (ch == 3 && num == 1))
////                    count = 1;
////                    System.err.println(count+"How many time ");
////                    count++;
//
//            }
////        }
////        System.err.println("count" + count);
////    }
////}
//
////
////            if ((ch == 1 && num == 3) || (ch == 2 && num == 1) || (ch == 3 && num == 2)) {
////                count++;
////               // System.err.println(count + " win ");
////            }
////            if (ch == num) {
////                c++;
////             //   System.err.println(c + "Draw");
////
////            } else {
////                k++;
////           //     System.err.println(k + "lose");
////            }
//        }
//        System.err.println("\n RESULT:\n"+count + " win ");
//        System.err.println(c + "Draw");
//        System.err.println(k+"lose");
//
//
////                    }
//////
////        }
//            if ((count >= 3 && c <= 2) || (count == 2 && c == 2) || (count == 1 && c == 4))
//                System.err.println("\"Congratulations " + n + " you won\"");
//
//            else if ((count == 1 && c == 3)||(count==2&&c==1))
//                System.err.println("Match is Draw");
//            else
//                System.err.println("Computer won Better Luck Next Time :)");
//        }
//        }
//
////int k=(ch == 1 && num == 2);
////               while((ch == 1 && num == 2) || (ch == 2 && num == 3) || (ch == 3 && num == 1))3)
//                  //  if ((ch == 1 && num == 2) || (ch == 2 && num == 3) || (ch == 3 && num == 1)) {
//
////                        System.err.println(n + "Win");
////            }
////        }
//                    //       System.err.println("\"computer choice is:\"" + num);
////            for(int k=1;k<=5;k++) {
////                if ((i == 1 && j == 2) || (i == 2 && j == 3) || (i == 3 && j == 1))
////                    System.err.println("lose");
////                else if (i == j)
////                    System.err.println("draw");
////                else
////                    System.err.println("Win");
////            }
//
//                    //     k++;
//
//                    // }
////           System.err.println(num + "computer choice");
////            }
////        }
// //               System.err.println("Total win" + count);
