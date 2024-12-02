import java.lang.*;
public class pt_281_practice_set_1 {

    //Problem 1:
    public static void reverse_string(String str)//My logic

    {
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse String is =\n"+rev);
    }

    public static String reverse_string2(String str)//Alex Lee method
    {

    char letters[]=new char[str.length()];
    int l=0;
        for (int i = str.length()-1; i >=0 ; i--) {
            letters[l] = str.charAt(i);
            l++;
        }


        String rev="";
        for (int i = 0; i < str.length() ; i++) {
rev+=letters[i];
        }
        return rev;

    }
    public static void main(String[] args) {
//        9 49
//Problem :1
    reverse_string("Syed Waqarul Hasann Naqvi");//my method
        System.out.println("Reverse String is : "+reverse_string2("Syed Waqarul Hasan Naqvi"));
    }
}
