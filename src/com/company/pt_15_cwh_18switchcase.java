package com.company;
import java.util.Scanner;
public class pt_15_cwh_18switchcase {
    //  Scanner sc = new Scanner(System.in);
//  int a=sc.nextInt();
    public static void main(String[] args) {
        int a;
        char a1='A';  String a2="A";//Char and String comparison.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        a = sc.nextInt();
//       If elseif ladder.
/*
         if (a >= 56) {
            System.out.println("YOu are Experienced !");
        } else if (a >= 46) { //else if is also called  Else if clause.
            System.err.println("You are semi_Experienced!");
        } else if (a >= 36) {
            System.err.println("You are semi_semi_Experienced!");

        } else {
            System.err.println("You are NOT_Experienced!");
        }
        //if_elseif_else ladder..
      //   if(a>2)
        //     System.err.println("You are not baby");

*/
//switch case is ysed for choices
//   switch(a){
//
//       case 18:
//           case 25:
//           System.err.println("You are going to  become teen:");
//       break;
//           case 20:
//           System.err.println("You  become a bussiness man:");
//           break;
//           case 24:
//           System.err.println("You are going to become adult: ");
//          break;
//           case 60:
//           System.err.println("You life is wonderful :");
//           break;
//       default:
//           System.err.println("Learn Learn Learn");
//   }
//
//        System.err.println("Thanks for using my java code:");
//
//}
//}
//        Inhance Switch:
System.err.println("Enter a Vowel:");
        String v=sc.nextLine();
//     v=   v.equalsIgnoreCase("a","e","i","o","u");
            switch(v){

        case "a"-> {
            System.err.println("it is not a consonent:");
            System.err.println("Vowel:");
        }
        case "e"->
        System.err.println("Vowel:");

        case "i"->
        System.err.println("Vowel: ");

        case  "o"->
        System.err.println("Vowel:");

        case  "u"->
        System.err.println("Vowel :");

default->

        System.err.println("Consonat");

        }

        System.err.println("Thanks for using my java code:");

        }
              }
        // v=   v.equalsIgnoreCase("a","e","i","o","u");
//
//        String v = sc.nextLine();
//        switch (v) {
//            case "azaan":
//
//           // case "AZAAN":
////                String str=v.equalsIgnoreCase("AZAAN");
////                System.out.println(str);
//                System.err.println("KING");
//                break;
//            case "waqarul":
//            case "WAQARUL":
//                System.err.println("You life is wonderful :");
//                break;
//            default:
//                System.err.println("Learn Learn Learn");
//        }
//    }
//}
