package com.company;

import java.util.*;
public class pt_153_Studentdetails {
    public String name;
    int m1,m2,m3;
    pt_153_Studentdetails(String name, int m1, int m2, int m3)//parameterized constructor..
    {
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public float percentage()
    {
        return  (m1+m2+m3)/3.0f;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float a[]=new float[5];
        String b[]=new String[5];

        for (int i = 0; i <5 ; i++) {
            System.out.println("\nEnter a marks of roll number :" + (i + 1));
            System.out.println("Enter Student name:");
            String name = sc.next();
            System.out.println("Enter a Physics:");
            int m1 = sc.nextInt();
            System.out.println("Enter a chemistry:");
            int m2 = sc.nextInt();
            System.out.println("Enter a Maths:");
            int m3 = sc.nextInt();
            pt_153_Studentdetails obj = new pt_153_Studentdetails(name, m1, m2, m3);//object creation..
            a[i]=obj.percentage();
            b[i]=name;
        }
        System.out.println("\nENTER STUDENT ROLL WHICH YOU WANT TO ACCESS");
        int j=sc.nextInt();
        System.out.println("Roll_no :"+(j));

        System.out.println("Student name :"+b[j-1]);
        System.out.println("Percentage :"+a[j-1]+"%");
        if(a[j-1]>=40)
        {
            System.out.println("Passed!\n");
        }
        else {
            System.out.println("Failed!\n");
        }
    }
}

