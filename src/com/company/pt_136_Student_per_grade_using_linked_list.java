package com.company;
import java.util.*;
public class pt_136_Student_per_grade_using_linked_list {
    public String name;
    int m1,m2,m3;
    pt_136_Student_per_grade_using_linked_list(String name,int m1,int m2,int m3)//parameterized constructor..
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
        LinkedList<Float> a =new LinkedList<>();
        LinkedList<String>  b=new LinkedList<>();

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
            pt_136_Student_per_grade_using_linked_list obj = new pt_136_Student_per_grade_using_linked_list(name, m1, m2, m3);//object creation..
            a.add(obj.percentage());
            b.add(name);
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.println("Roll_no :"+(i+1));
            System.out.println("Student name :"+b.get(i));
            System.out.println("Percentage :"+a.get(i)+"%");
            if(a.get(i)>=40)
            {
                System.out.println("Passed!\n");
            }
            else {
                System.out.println("Failed!\n");
            }
        }
    }
}
