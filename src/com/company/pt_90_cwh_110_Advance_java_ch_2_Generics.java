package com.company;

import java.util.ArrayList;
import java.util.*;
//Generic in simple word we are simply passing classes to already defined classes..
class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
}
public class pt_90_cwh_110_Advance_java_ch_2_Generics {
    public static void main(String[] args) {
    /*    ArrayList arrayList =new ArrayList();
//        ArrayList arrayList =new ArrayList<>();//Run..

//        <Integer> is a generic..
        //Hence generics aim to reduce bugs and enhance type safety..
//        ArrayList <Integer>arrayList =new ArrayList();//Rum
        arrayList.add("str1");
        arrayList.add("34");
        arrayList.add(34345);
        arrayList.add(new Scanner(System.in));
        arrayList.add('a');
        arrayList.add(420);
        arrayList.add("someday i found someone who love's me");

        System.out.println(arrayList);
        int a=(int)arrayList.get(2);
        System.out.println(a);


        try {
            int b=(int)arrayList.get(0);//typecasting error (typecasting String/word to integer) generic helps to prevent this type of error..
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            int b=(int)arrayList.get(1);//typecasting error (typecasting String/word to integer) generic helps to prevent this type of error..
            System.out.println(b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int c=(int)arrayList.get(5);
        System.out.println(c);
     */
        /*
        MyGeneric g1= new MyGeneric(34,"MyString","MySrtring2");
//        int str=(int) g1.getT1();//Throws an run time exception..
        String str=(String) g1.getT1();
        System.out.println(str);
//        String kk=(String) g1.getVal();//Error..//Throws an compile time exception.. (int cannot be converted to java.lang.String..)
        int kk=(int) g1.getVal();
        System.out.println(kk);
        System.out.println(g1.getT1());//Run..
        System.out.println(g1.getVal());//Run..
         */

        MyGeneric <String,Integer>g2= new MyGeneric(34,"MyString",23);
        String str1=(String) g2.getT1();//here String datatype is redundant
        System.out.println(str1);
        int kkk=(int) g2.getVal();//here int datatype is redundant..
        System.out.println(kkk);
        int kkkkk=g2.getT2();//here int datatype is redundant
        System.out.println(kkkkk);
//        System.out.println(g2.getT1());//Run..
//        System.out.println(g2.getVal());//Run..
    }
}
