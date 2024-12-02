package com.company;

public class pt_106_ASCII_and_Camel_C_C {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        char c = s.next().charAt(0); //to input character
        /*Question 1: WAP to print ASCII value of A to Z.*/
        System.out.println("ASCII VALUE OF ");
        for(char ch='A';ch<='Z';ch++)
        {
            int ascii=ch;
            System.out.printf(" %c = %d \n",ch,ascii );
        }
//        /*Question 2:WAP to print CamelCaseConvention*/
//        String str=new String("CamelCaseConvention");
////    String scc="str";
//        System.out.println(str);
////        System.out.println(scc);
//        WAP TO PRINT A TO Z ALPHABETS.
        System.out.println("DISPLAY ALPHABETS USING ASCII VALUE: ");
        for(int ch=97;ch<=122;ch++)
        {
            System.out.print(" "+(char)ch);
        }
    }
}


