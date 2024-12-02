package com.company;

public class pt_5_cwh8operatorandoperants {
    public static void main(String[] args) {
        int a = 7;
//        aithmatic operator can't work on boolean..
//        System.err.println(a+"x");
//        % operator can also return decimal value e.x.:- 5.4 %1.1 the answer will be in decimal..
        /*int b = 5 + a;
        System.out.println(b);
        b=8-a;
        System.out.println(b);*/double kk=4.2%1.1;//return decimal remainder
         int b=10%a;//modulo operator give remainder
        System.out.println(b);
       /*nt b=3;
                b+=10;
        System.out.println(b);
        System.out.println(64>=6);//comparison operator
        System.out.println(6==3);//= is a assignment operator == is a comparison operator
        System.out.println(64>599 && 64>8);//logical operator

        System.out.println(64>599 || 64>8);//logical operator*/
        //bitwise opreratorsout
//        And bitwise..
       System.out.println(2 & 3);
        System.out.println(5 & 7);
         /*010-2   |||101-5
          011-3    |||111-7
          010-2    |||101-5
          */
//        System.out.println(kk);
//        OR bitwise..
        System.out.println(2 | 3);
        System.out.println(5 | 7);
//        logical and comparison operator return true/false..
}
}