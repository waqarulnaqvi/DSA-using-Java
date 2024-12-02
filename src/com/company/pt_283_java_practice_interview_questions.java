import java.lang.*;
import java.util.HashSet;

public class pt_283_java_practice_interview_questions {
//   12 3
    public static String removeduplicate(String s)
    {
        HashSet<Character> hashSet=new HashSet<>();
StringBuffer sf=new StringBuffer();

                for (int i = 0; i <s.length() ; i++) {
Character c=s.charAt(i);
if(!hashSet.contains(c))
{
    hashSet.add(c);
    sf.append(c);
}

        }
return sf.toString();//Converting to string buffer object to two string.
    }

    public static String reversewords(String s)
    {

        String rev="",temp="";
        for (int i = 0; i<s.length(); i++)
        {

            char ch=s.charAt(i);

            if(s.charAt(i)==' ' || s.charAt(i)!=s.length()-1)
            {
                rev=rev+" "+temp;
            temp="";
            }
            temp=temp+ch;
        }
        return rev;
    }
    public static void main(String[] args) {
//        Problem 1://remove repeated character in string.
        System.out.println(removeduplicate("assasssination"));

//    Problem 2: reverse the words in the string.
        System.out.println(reversewords("chutiya akvi hello world"));
    }
}
