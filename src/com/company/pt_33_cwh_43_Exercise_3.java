//package com.company;
//import java.util.Scanner;
//import java.util.Random;
//class game
//{
//   private int c=0,k=0,h=0,num,r;
//    game()
//    {
//        Random choice=new Random();
//         r=1+choice.nextInt(10);
//    }
//    void takeUserInput()
//    {
//        System.err.println("Enter a number b/w 1 to 10" );
//        System.err.println("YOU HAVE 5 CHOICES:");
//        Scanner sc = new Scanner(System.in);
//        for (int i=5;i>0;i--) {
//             num =sc.nextInt();
//            System.err.printf("%d CHOICES LEFT:\n", i-1);
//            if (r == num) {
//                System.err.println("Absolutely Correct");
//                c++;
//            } else if (r > num) {
//                System.err.println("Computer Choice is greater");
//                k++;
//            } else {
//                System.err.println("Computer Choice is smaller");
//                h++;
//            }
//        }
//    }
//    void noofGuess()
//    {
//        System.err.println("Computer Choice:"+r);
//        System.err.println("Total correct answer:"+c);
//        System.err.println("How many times Computer Choice is greater:"+k);
//        System.err.println("How many times Computer Choice is lesser:"+h);
//    }
//}
//public class pt_33_cwh_43_Exercise_3 {
//    public static void main(String[] args) {
//        game g=new game();
//      g.takeUserInput();
//        g.noofGuess();
//    }
//}


//PROGRAM AFTER I BECAME INTERMEDIATE PROGRAMMER..
//package com.company;
//        import java.util.Scanner;
//        import java.util.Random;
//class game
//{
//    private int c,k=0,h=0,num,r;
//    game(int r)
//    {
//       this.r=r;
//    }
//    void takeUserInput()
//    {
//        System.err.println("Enter a number b/w 1 to 10" );
//        System.err.println("YOU HAVE 5 CHOICES:");
//        Scanner sc = new Scanner(System.in);
//        for (int i=1;i<=5;i++) {
//            num =sc.nextInt();
//            if (r == num) {
//                System.err.println("Absolutely Correct");
//                c=i;
//                break;
//            } else if (r > num) {
//                System.err.println("Computer Choice is greater");
//                k++;
//            } else {
//                System.err.println("Computer Choice is smaller");
//                h++;
//            }
//            System.err.printf("%d CHOICES LEFT\n\n", 5-i);
//        }
//    }
//    void noofGuess()
//    {
//        System.err.println("Computer Choice:"+r);
//        System.err.printf("Correct answer in %d attempt\n",c);
//        System.err.println("How many times Computer Choice is greater than yours:"+k);
//        System.err.println("How many times Computer Choice is lesser than yours:"+h);
//    }
//}
//public class pt_33_cwh_43_Exercise_3 {
//    public static void main(String[] args) {
//        Random choice=new Random();
//        int r=1+choice.nextInt(10);
//        game g=new game(r);
//        g.takeUserInput();
//        g.noofGuess();
//    }
//}

//CWH LOGICAL
package com.company;
import java.util.Scanner;
import java.util.Random;
class game {
    private int num, r, no_of_Guesses = 0;

    game() {
        Random choice = new Random();
        this.r = 1 + choice.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("\nGuess the number b/w 1 to 100");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }

  boolean isCorrectNumber() {
        no_of_Guesses++;
        if (r== num) {
            System.out.println("Absolutely Correct");
            System.out.format("you guess number in %d attempt",no_of_Guesses);
            return true;
        }
         else if (r > num) {
            System.out.println("Too Low..");
        } else {
            System.out.println("Too High..");
        }
        return false;
    }
}
public class pt_33_cwh_43_Exercise_3 {
    public static void main(String[] args) {
        game g=new game();
     boolean b=false;
     while (!b){
         g.takeUserInput();
        b= g.isCorrectNumber();
     }
    }
}




//package com.company;
//        import java.util.Scanner;
//        import java.util.Random;
//class game
//{
//    int r;
//    game()
//    {
//        Random kk=new Random();
//        r=kk.nextInt(10);
//    }
//    int RandomNumber()
//    {
//     return r;
//    }
//}
//public class cwh_43_Exercise_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        game g=new game();
//          int c=0,k=0,h=0;
//        System.err.println("Enter a number b/w 0 to 10" );
//        System.err.println("YOU HAVE 5 CHOICES:");
//        for (int i=5;i>0;i--) {
//            int num =sc.nextInt();
//            System.err.printf("%d CHOICES LEFT:\n", i-1);
//            if (g.r == num) {
//                System.err.println("Absolutely Correct");
//                c++;
//            } else if (g.r > num) {
//                System.err.println("Computer Choice is greater");
//                k++;
//            } else {
//                System.err.println("Computer Choice is smaller");
//            h++;
//            }
//        }
//       // System.err.println("Computer Choice:"+g.r);
//        System.err.println("Computer Choice:"+g.RandomNumber());
//        System.err.println("Total correct answer:"+c);
//        System.err.println("How many times Computer Choice is greater:"+k);
//        System.err.println("How many times Computer Choice is lesser:"+h);
//    }
//}
//package com.company;
//        import java.util.Scanner;
//        import java.util.Random;
//class game
//{
//    int r;
//    game()
//    {
//        Random kk=new Random();
//        r=kk.nextInt(10);
//    }
//    int RandomNumber()
//    {
//     return r;
//    }
//}
//public class cwh_43_Exercise_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        game g=new game();
//          int c=0,k=0,h=0;
//        System.err.println("Enter a number b/w 0 to 10" );
//        System.err.println("YOU HAVE 5 CHOICES:");
//        for (int i=5;i>0;i--) {
//            int num =sc.nextInt();
//            System.err.printf("%d CHOICES LEFT:\n", i-1);
//            if (g.r == num) {
//                System.err.println("Absolutely Correct");
//                c++;
//            } else if (g.r > num) {
//                System.err.println("Computer Choice is greater");
//                k++;
//            } else {
//                System.err.println("Computer Choice is smaller");
//            h++;
//            }
//        }
//       // System.err.println("Computer Choice:"+g.r);
//        System.err.println("Computer Choice:"+g.RandomNumber());
//        System.err.println("Total correct answer:"+c);
//        System.err.println("How many times Computer Choice is greater:"+k);
//        System.err.println("How many times Computer Choice is lesser:"+h);
//    }
//}