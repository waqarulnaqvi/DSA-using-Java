package com.company;
import java.util.Scanner;
public class pt_139_static_default_variable {
    int counter =0;//it's type is default..
    static int count =0;
    pt_139_static_default_variable()
    {
//        count++;
        counter++;
        counter=count;

    }
    void showOrder()
    {
        System.out.println("order of objects is : "+counter);

    }
    static void showCount()
    {
        System.out.println("no. of objects is : "+count);

    }
    public static void main(String[] args) {
        pt_139_static_default_variable n1,n2,n3,n4;
        n1=new pt_139_static_default_variable();
        n2=new pt_139_static_default_variable();
        n3=new pt_139_static_default_variable();
        n4=new pt_139_static_default_variable();
        n1.showOrder();
        n2.showOrder();
        showCount();
    }
}
