package com.company;
import java.util.*;
public class pt_134_Student_per_grade_using_array {
    public String name;
    int m1,m2,m3;
    pt_134_Student_per_grade_using_array(String name,int m1,int m2,int m3)//parameterized constructor..
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
        System.out.println("Enter a number of students:");
        int n=sc.nextInt();
        float a[]=new float[n];
        String b[]=new String[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("\nEnter a marks of roll number :" + (i + 1));
            System.out.println("Enter Student name:");
            String name = sc.next();
            System.out.println("Enter a Physics:");
            int m1 = sc.nextInt();
            System.out.println("Enter a chemistry:");
            int m2 = sc.nextInt();
            System.out.println("Enter a Maths:");
            int m3 = sc.nextInt();
            pt_134_Student_per_grade_using_array obj = new pt_134_Student_per_grade_using_array(name, m1, m2, m3);//object creation..
            a[i]=obj.percentage();
            b[i]=name;
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.println("Roll_no :"+(i+1));
            System.out.println("Student name :"+b[i]);
            System.out.println("Percentage :"+a[i]+"%");
            if(a[i]>=40)
            {
                System.out.println("Passed!\n");
            }
            else {
                System.out.println("Failed!\n");
            }
        }
    }
}
