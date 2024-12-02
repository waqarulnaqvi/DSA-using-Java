import java.util.Random;
import java.util.Scanner;
//19 11

//1 7
public class pt_284_practice_question_1 {
    //    STUDENT GRADE CALCULATOR:
//    Problem:2
    public static int subject(int i, Scanner sc) {
        System.out.println("Enter Subject " + i + " marks :");
        int sub = sc.nextInt();
        return sub;
    }

    //    Problem:1
    public static int randomnumber() {
        Random obj = new Random();
        int random = 1 + obj.nextInt(100);
        return random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR:) ");
//        System.out.println("Enter total Subjects:");
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i = 1; i <=n ; i++)
//        {
//           int  marks= subject(i, sc);
//
//            if (marks> 100)
//            {
//                System.out.println("Marks must be less than 100");
//                i = i - 1;
//            }
//            else {
//                sum +=marks;
//            }
//
//        }
//        System.out.println("Your Percentage is : "+sum/n+ " % ");

//        NUMBER GAME (TASK 1)
        boolean run = true;
        int c = 0;
        int match = 0;
        while (run) {
            int randomnum = randomnumber();
//            System.out.println(randomnum);//Generated Number
            System.out.println("Guess the correct number game you have 5 attempts ");
            for (int i = 1; i <= 5; i++) {
                int guess = sc.nextInt();
                if (guess == randomnum) {
                    System.out.println("Element Found");
                    c++;
                    break;

                } else if (randomnum - guess <= 10 && randomnum - guess > 0) {
                    System.out.println("within 10 high");
                } else if (randomnum > guess) {
                    System.out.println("Too high");
                } else if (randomnum - guess < 0 && randomnum - guess >= -10) {
//                    System.out.println(randomnum-guess);
                    System.out.println("within 10 low");
                } else {
                    System.out.println("Too low");
                }
            }
                System.out.println("do you wish to continue:\n1 for yes\n2 for no:");
                int t = sc.nextInt();
                match++;
                if (t == 2) {
                    run = false;
                }
            }
            System.out.printf("Total matches:%d\nTotal matches won:%d\n", match, c);
        }
    }