package com.company;

import java.util.Scanner;
class Mythread extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<23232)
        {
            System.out.println("11 is running");
            System.out.println("I am the alpha");
        i++;
        }
    }
}
class Mythread3 extends Thread{
    @Override

    public void run() {
        int i=0;
        while (i < 23232) {
            System.out.println("12 is running");
            System.out.println("I am a bad boy");
            i++;
        }
    }
}
public class pt_172_Multithreading_practice {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Mythread t1=new Mythread();
    Mythread3 t2=new Mythread3();
    t1.start();
    t2.start();

    }
}
