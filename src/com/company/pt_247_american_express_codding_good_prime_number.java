import java.util.Scanner;

//A prime number is a number which is divisible by one and itself. Also a number is called a good  prime number if the sum of its digits is a prime number. For example a number 23 is a good prime number because the sum of 2 and 3 ( 2+3=5) is 5 which is a prime number. You are given an integer K. Your task is to find the kth good prime number that is greater than a provided number N.
public class pt_247_american_express_codding_good_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int t=n,rem;
        int sum=0,c=0;
        while (t>0)
        {
            rem=t%10;
            sum=sum+rem;
            t=t/10;
        }
//        System.out.println(sum);
        for (int i = 2; i <=n/2 ; i++) {

//            if(n%i!=0 && n!=i && sum%i!=0 && sum!=i){
            if( sum%i!=0 && sum!=i){
                c=1;
//                System.out.println(i);

            }
            else {
                break;
            }
        }
        if(c==1)
        {
            System.out.println("good prime number!!");
        }
        else {
            System.out.println("Not a good prime number!!");
        }

    }
}
