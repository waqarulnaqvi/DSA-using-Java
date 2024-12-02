import java.util.Scanner;
public class pt_229_yt_short_2 {
    public static void main(String[] args) {
        //        Inhance Switch:
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter a Vowel:");
        String v=sc.nextLine();
        switch(v){

            case "a"-> {
                System.out.println("It is consontent");
                System.err.println("Vowel:");
            }
            case "e"->System.err.println("Vowel:");

            case "i"-> System.err.println("Vowel: ");

            case  "o"-> System.err.println("Vowel:");

            case  "u"-> System.err.println("Vowel :");

            default-> System.err.println("Consonat");
        }
        System.err.println("Thanks for using my java code:");

    }
}
