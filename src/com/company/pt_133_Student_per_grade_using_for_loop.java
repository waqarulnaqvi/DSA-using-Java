package com.company;
import java.util.*;
public class pt_133_Student_per_grade_using_for_loop {
    public String name;
    int m1,m2,m3;
    pt_133_Student_per_grade_using_for_loop(String name,int m1,int m2,int m3)//parameterized constructor..
    {
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void display()
    {
        float per=(m1+m2+m3)/3.0f;
        System.out.printf("%s your percentage is :%f percentage\n",name,per);
        if(per>=40)
        {
            System.out.printf("%s you are passed! \n",name);
        }
        else {
            System.out.printf("%s you are failed!! \n",name);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number of students:");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("\nEnter a marks of roll number :"+i);
            System.out.println("Enter Student name:");
            String name = sc.next();
            System.out.println("Enter a Physics:");
            int m1 = sc.nextInt();
            System.out.println("Enter a chemistry:");
            int m2 = sc.nextInt();
            System.out.println("Enter a Maths:");
            int m3 = sc.nextInt();
            pt_133_Student_per_grade_using_for_loop ob = new pt_133_Student_per_grade_using_for_loop(name, m1, m2, m3);//object creation..
            ob.display();
        }
    }
}
