package com.company;
import java.util.*;
class Person{
    String firstname,lastnuame;
    int idnumber;

    public Person(String firstname, String lastnuame, int idnumber) {
        this.firstname = firstname;
        this.lastnuame = lastnuame;
        this.idnumber = idnumber;
    }

    void printPerson()
    {
        System.out.println(idnumber+") "+firstname+" "+lastnuame);
    }
}

class Student extends Person{
    float testScores[];


    public Student(String firstname, String lastname, int idnumber, int n) {
        super(firstname, lastname, idnumber);
         testScores=new float[n];
    }

    void calculate(int id,int i,float percentage)
    {
    testScores[i]=percentage;
        }
    }

public class pt_152_Student_Person {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Student");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter Student id_number:");
            int id = sc.nextInt();
            System.out.println("Enter Student first_name:");
            String fn = sc.next();
            System.out.println("Enter Student last_name:");
            String ln = sc.next();
            System.out.println("Enter Student Percentage:");
            float per = sc.nextFloat();
            Student obj = new Student(fn, ln, id, n);
//            obj.testScores[0]=per;
            obj.printPerson();
            obj.calculate(id,i,per);
            System.out.printf("Percentage of id_number %d = %f %% \n\n", id,obj.testScores[i]);
        }
    }
}
