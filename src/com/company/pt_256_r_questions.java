
//15 42 to 17 12


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class pt_256_r_questions {

    public int btod(int n)//my method 1
    {
        int decimal=0;
        int base =1;
        while(n>0)
        {
            decimal+=(n%10)*base;
            base*=2;
            n=n/10;
        }
        return decimal;
    }

    public int binarytodecimal(String n)//my method 2
    {
        int dec=0;
        int base=1;
        for (int i = n.length()-1; i >=0 ; i--) {
            if(n.charAt(i)=='1')
            {
                dec+=base;
            }
            base=base*2;
        }
        return dec;
    }

    //    METHOD 1
    public int BinaryToDecimal(String n){
        String num=n;
        int base=1;
        int dec=0;

        for(int i=num.length()-1;i>=0;i--){

            if(num.charAt(i)=='1'){
                dec+=base;
            }
            base=base*2;
        }
        return dec;
    }

    //METHOD 2
    public int BToD(int n){
        int num=n;
        int dec=0;
        int base=1;
        int temp=num;
        while (temp>0){
            int d=temp%10;
            dec+=d*base;
            base=base*2;
            temp=temp/10;
        }
        return dec;
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
//r method:

//        for (int i = 0; i < s.length(); i++) {
//            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
//                ans -= m.get(s.charAt(i));
//            } else {
//                ans += m.get(s.charAt(i));
//            }
//        }

        for (int i = 0; i <s.length() ; i++)
        {
            if(i < s.length() - 1 &&m.get(s.charAt(i))<m.get(s.charAt(i+1)))
            {
                ans-=m.get(s.charAt(i));
            }
            else {

                ans+=m.get(s.charAt(i));
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        pt_256_r_questions p=new pt_256_r_questions();
//        String num=new String("1101");
//        System.out.println(p.BinaryToDecimal(num));
//        int n=1101;
//        System.out.println(p.BToD(n));

//        My method 1:
//        System.out.println("My method 1 :"+p.btod(1101));


//        my method 2:
//        System.out.println("My method 2 :"+p.binarytodecimal("1101"));


//        METHOD 3
//        String bin="1101";
//        int  integernum=Integer.parseInt(bin,2);
//        System.out.println("Method 3 output :"+integernum);

//INteger to binary:
//        System.out.println(Integer.toBinaryString(13));
//        System.out.println(Integer.toString(13,2));

        System.out.println(romanToInt("VI"));
    }
}



