package com.company;

public class pt_14_cwh_17logical_conditional {
    public static void main(String[] args) {
        //& and|| logical operator
        System.out.println("for logical And");
        boolean a=true;
        boolean b=true;
        boolean c=true;
        if(a&&b&&c)
            System.out.println("Y");
        else
            System.out.println("N");
      System.out.println("for logical OR");
        boolean a1=false;
        boolean b2=true;
        boolean c3=false;
        if(a1||b2||c3)
            System.out.println("Y");
        else
            System.out.println("N");
//        boolean a=true;
//        boolean b=false;
//        boolean c=true;
        System.out.println("For logical NOT");
        System.out.println("Not(A) is ");
        System.out.println(!a);//NOT Operator(!) is  called an invertor
         System.out.println("For logical NOT");
        System.out.println("Not(B) is ");
        System.out.println(!b);
        System.out.println("Not(C) is ");
        System.out.println(!c);

    }
}
