import java.util.HashMap;
import java.util.Scanner;

public class pt_254_practice_question_for_denso_roman_to_integer {
    public static void main(String[] args) {
//        23 30
//        int ans=0;
//        int[] roman=new int[128];
//        roman['I']=11212;
////        roman[73]=1111;
//        roman[0]='a';
//        roman[1]=11-2;
//        roman['J']='c';
//        for (int i = 0; i < roman.length; i++) {
//            System.out.println(roman[i]);
////            System.out.println(roman[0]);

        Scanner sc=new Scanner(System.in);

//        Method 1:
        System.out.println("Enter a string:");
//        String str=sc.nextLine();
        String str="IX";
                int ans=0;
        int[] roman=new int[128];
        roman['I']=1;
        roman['V']=5;
        roman['X']=10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        for (int i = 0; i < str.length()-1; i++) {
            if(roman[str.charAt(i)]<roman[str.charAt(i+1)])
            {
             ans-=roman[str.charAt(i)];
            }
            else {
                ans+=roman[str.charAt(i)];
            }
        }
        System.out.println(ans+roman[str.charAt(str.length()-1)]);

//        Method 2:



//        hash map:
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('v',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

    }
}
