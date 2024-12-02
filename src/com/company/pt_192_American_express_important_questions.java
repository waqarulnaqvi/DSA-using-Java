package com.company;

import java.util.Scanner;
//Round 1:
//        Round 1 had 2 sections, One was a coding round having 2 problems.
//        1: Given a list of Students and Subjects along with credits of each, a student can select only those subjects whose credits are less than equal to his/her credits.
//        Return the number of pairs of students and subjects.
//        e.g:
//        Subjects:{3,4,1,2}
//        students:{5,3}
//
//        So there can be 7 pairs as The Student having 5 credits can select all the subjects and the student having credits 3 can select subjects with credits 1,2,3.
//        Easy Binary search and sort question.
public class pt_192_American_express_important_questions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//2h
//        3 4
        //12 32
//        14 8
//        for (int i = 1; i <=5 ; i++) {
//            System.out.println("Student Credit :"+i);
//            System.out.println("Subjects he/she can able to choose:");
//            for (int j = 1; j <=i ; j++) {
//                System.out.println("Subject credit Score :"+j);
//            }
//            System.out.println();
//
//        }

//17 58
//        Question2 :
//        Given two arrays numerator and denomainator, find the most frequent fraction where
//                fraction = numerator[i]/denominotor[i]

float a[]={43,23,43,34,34,3,43};
float b[]={22,232,22,23,22,21,22};
 float frac[]=new float[a.length];
 boolean visited[]=new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            frac[i]=a[i]/b[i];
        }

        for (int i = 0; i <a.length; i++) {
            int count=1;
            if(visited[i]==true)
            {
                continue;
            }
            for (int j =i+1; j < a.length; j++) {


                if(a[i]==a[j] )
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(frac[i]);
            System.out.println(count);
            System.out.println();
        }
//        int dealership = sc.nextInt();
//        while (dealership--> 0) {
//
//            System.out.println("Enter cars:");
//            int cars = sc.nextInt();
//            System.out.println("Enter bikes:");
//            int bikes = sc.nextInt();
//            System.out.println(cars * 4 + bikes * 2);

//       (Selection sort):
//        int sort=0;
//        int a[]={6,5,4,3,1,343,7};

//        for (int i = 0; i <a.length-2 ; i++) {
//            int min=i;
//            for (int j = i+1; j < a.length-1; j++) {
//                if(a[i]>a[j])
//                {
//                    min=j;
//            }
//        }
//            int t=a[i];
//            a[i]=a[min];
//            a[min]=t;
//            sort++;
//        }
//        for (int i = 0; i <a.length-1 ; i++) {
//            System.out.print(a[i]+"  ");
//        }
//        System.out.println("\nTotal number of sorts:"+sort);
//    }
/*
        Question 4 : Simple problem
        Problem Statement :

        Mr X is a teacher of maths. He came across a very simple problem. In the problem you have to arrange the numbers in an ascending
        order and calculate the total number of swaps required. The number of swaps must be minimum.
       But Mr X is busy with some other tasks and you being his favourite student , so he asks you to solve this problem.
//Minimum sorting technique(Cycle sort):
        int a[]={6,5,4,3,2,1};
        int sort=0;
int i=0;
        while (i<a.length)
        {
            if(i+1!=a[i])
            {
            while (i+1!=a[i])
            {
                int t=a[a[i]-1];
                a[a[i]-1]=a[i];
                a[i]=t;
                sort++;
            }
            }

            i++;
        }
        for (int j = 0; j <a.length-1 ; j++) {
            System.out.print(a[j]+"  ");
        }
        System.out.println("\nTotal number of sorts:"+sort);
 */
//15 4

        /*
//      Question 6 : Seating Arrangement in Exam Hall
//Problem Statement  :
//
//Semester exams are going on for university students. Examiners noticed that a group of people are trying to cheat. They marked students of that group as ‘1’ and students of another group ( who are not cheating ) as ‘0’
//
//We can reduce cheating by not allowing students from group 1 to sit together, means no two students from group 1 can sit together. Seatings are marked using above conditions. Your task is to give the seating placement of nth possibility Possibility order from 1 to 10 is given below
//
//[1  10  100  101  1000  1001  1010  10000  10001  10010]
//
//Sample input :
//
//3 → number of test cases
//
//4
//
//6
//
//9
//
//Sample output :
//
//101
//
//1001
//
//10001
//
//Explanation :
//
//4th possibility is 101
//
//6th possibility is 1001
//
//9th possibility is 10001

        int n=10,c=0;
        for (int i = 1; n!=c; i++) {
//            String s = Integer.toString(i, 2);
            String s=Integer.toBinaryString(i);
            if (!s.contains("11")) {
                System.out.print(s + "  ");
                c++;
            }
//        String s = Integer.toString(11, 8);
//        String s = Integer.toString(15, 2);
//        String s1=Integer.toBinaryString(15);
//        System.out.println(s);
//        System.out.println(s1);
        }
         */
//int a[]={1,2,44,-3,34};
//        System.out.println("Enter a number");
//        int n= sc.nextInt();
//        int sum=0,ans=0;
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//            if(sum<1)
//            {
//                sum=-sum;
//                ans=ans+sum+1;
//                sum=1;
//            }
//            System.out.println(ans);
//
//        }
    }

}

