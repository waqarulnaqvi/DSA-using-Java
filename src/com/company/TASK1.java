import java.util.Random;
import java.util.Scanner;
public class TASK1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        NUMBER GAME (TASK 1):
        boolean run = true;
        int c = 0;
        while (run) {
            Random choice = new Random();
            int num = 1 + choice.nextInt(100);
            System.out.println("Guess the correct number game you have 5 attempts ");
            for (int i = 1; i <= 5; i++) {
                int guess = sc.nextInt();
                if (guess + 10 >= num) {
                    System.out.println("too high");
                } else if (guess - 10 < num) {
                    System.out.println("too low");
                } else {
                    System.out.println("Element Found");
                    c++;
                }
            }
            System.out.println("Total correct guesses : "+c);
            System.out.println("do you wish to continue : 1 for yes\n 2 for no\n");
            int t = sc.nextInt();
            if (t == 2) {
                run = false;
                System.out.println("Exiting the loop!\n");
            }
        }
        sc.close();
    }
}