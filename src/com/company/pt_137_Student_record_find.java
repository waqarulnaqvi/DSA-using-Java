package com.company;

import java.util.Scanner;

public class pt_137_Student_record_find {
    public String name;
    int m1,m2,m3;
    pt_137_Student_record_find(String name,int m1,int m2,int m3)//parameterized constructor..
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
            pt_137_Student_record_find obj = new pt_137_Student_record_find(name, m1, m2, m3);//object creation..
            a[i]=obj.percentage();
            b[i]=name;
        }
        while (true){
        System.out.println("\n\"Enter 0 to break from the loop\"\nEnter roll number of the student:");
        int i=sc.nextInt();
            if(i==0)
            {
                System.out.println("Breaking from the loop!!");
                break;
            }
        if(i>a.length)
        {
            System.out.println("Student with index number "+i+" Not exists!\n");
            continue;
        }
            System.out.println("Roll_no :"+(i));
            System.out.println("Student name :"+b[i-1]);
            System.out.println("Percentage :"+a[i-1]+"%");
            if(a[i-1]>=40)
            {
                System.out.println("Passed!\n");
            }
            else {
                System.out.println("Failed!\n");
            }

        }
    }
}
