import java.util.Scanner;

public class pt_180_CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str= sc.nextLine();
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {

                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                        break;
                }

            }
        }
        System.out.println("Vowels in a String is : "+count);
    }
}
