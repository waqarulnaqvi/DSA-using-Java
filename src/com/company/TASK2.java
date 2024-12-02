import java.util.*;

public class TASK2 {
    //    STUDENT GRADE CALCULATOR(TASK 2):

    public static int subject(int i, Scanner sc) {
        System.out.println("Enter Subject " + i + " marks :");
        int sub = sc.nextInt();
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR:) ");
        System.out.println("Enter total Subjects:");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++)
        {
            int  marks= subject(i, sc);

            if (marks> 100)
            {
                System.out.println("Marks must be less than 100");
                i = i - 1;
            }
            else {
                sum +=marks;
            }

        }
        System.out.println("Your Percentage is : "+sum/n+ " % ");
        sc.close();
    }
}