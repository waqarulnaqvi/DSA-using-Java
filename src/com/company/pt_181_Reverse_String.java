import java.util.Scanner;
public class pt_181_Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str= sc.nextLine();
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        System.out.println("Reverse of a String :"+rev);
    }
}
