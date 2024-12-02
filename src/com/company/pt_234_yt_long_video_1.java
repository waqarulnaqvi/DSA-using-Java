import java.util.Scanner;
public class pt_234_yt_long_video_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int t=n,rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of number is :"+rev);
        if (rev==t){
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindorme number");
        }
    }
}
