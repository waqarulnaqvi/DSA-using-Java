/****Description 1 :Hello this is the method and this is the second most beautiful method of this class..
 *
 *
 * @author Al habibi
 * @version 0.5
 * @since 2001
 * @see <a href="file:///C:/Users/HP/com/company/package-summary.html" target="_blank"></a>package3
 *  @see <a href="file:///C:/Users/HP/com/company/pt_87_cwh_107_Advance_java_ch_2_method_tags.html" target="_blank"></a>package2.O
 *  @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Java Docs
 *   @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Oracle documentation
 * //Hello have a good day..
 */
package com.company;
/****Description 1 :Hello this is the method and this is the second most beautiful method of this class..
 *
 *
 * @author Harry (CodeWithHarry)
 * @version 0.7
 * @since 2001
 * @see <a href="file:///C:/Users/HP/com/company/package-summary.html" target="_blank"></a>package3
 *  @see <a href="file:///C:/Users/HP/com/company/pt_87_cwh_107_Advance_java_ch_2_method_tags.html" target="_blank"></a>package2.O
 *  @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Java Docs
 *   @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Oracle documentation
 * //Hello have a good day..
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**Habibi
 * 
 * hyyyy
 * 
 * 
 * Description 1 :Hello this is the method and this is the second most beautiful method of this class..
 *
 *
 *
 *Have a good day
 *
 *
 *
 *
 * @author Waqarul (Mr Naqvi)
 * @version 0.2
 * @since 2002
 * @see <a href="file:///C:/Users/HP/com/company/package-summary.html" target="_blank"></a>package3
 *  @see <a href="file:///C:/Users/HP/com/company/pt_87_cwh_107_Advance_java_ch_2_method_tags.html" target="_blank"></a>package2.O
 *  @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Java Docs
 *   @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Oracle documentation
 * //Hello have a good day..
 */
//Problem 2:
class Naqvi
{
    @Deprecated
    public int sum(int a,int b)
    {
        return a+b;
    }
}
//public static interface mydisplay{//Error..
 interface mydisplay1{
    void display1();
}
public class pt_92_cwh_112_Advance_java_ch_2_practice_set_and_cwh_java_tut_last_practice_set {
    /**
     *Description :Hello this is the method and this is the most beautiful method of this class..
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of 2 numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
       if(i==0)
        {;;;
           ; throw new Exception();
        }
       int c =i+j;;;
      ;;;return c;
    }
   ;;; public static interface mydisplay{
       ;; void display();;;;
    };;;
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    //you can only use param args method above the main method..;;;
    public static void main(String[] args) throws  IOException {
        Scanner sc = new Scanner(System.in);
      /*  Problem 1: Create a javadoc from a java program using and without using Intellij Idea..
        System.out.println("I am main method..");
        System.out.println("/* is comment /** is a javadoc comment..");
       */

        /*Problem 2:
        Naqvi obj =new Naqvi();
        obj.sum(12,2212);
        */

        /*Problem 3:
        //Use @SuppressWarnings("deprecation") any where in the program it will remove all deprecation warning..
        @SuppressWarnings("deprecation")
        Naqvi obj =new Naqvi();
        obj.sum(12,2212);
         */

        /*Problem 4:
        //lambda Expression:-
        mydisplay ob1=()->{
                System.out.println("Displaying interface 1");
        };
        //Anonymous Classes:-
        mydisplay1 ob2=new mydisplay1() {
            @Override
            public void display1() {
                System.out.println("Displaying interface 2.G");
            }
        };
        ob1.display();
        ob2.display1();
         */

         /*Problem 5:(my solution)
        FileWriter fileWriter = new FileWriter("cwh_112file.txt");
        System.out.println("Enter a number whose table you want to print");
       int n =sc.nextInt();
        for (int i = 1; i <=10; i++) {
            fileWriter.write(n+" X "+i+" = "+(i*n)+"\n");
        }
        fileWriter.close();//it is a good practice.. file ko use karne ke baad close kar dena..
          */

       /*Problem 5:(cwh solution)
        System.out.println("Enter a number whose table you want to print");
        ;;;;; int n =sc.nextInt();
        ;;;;;;String str="";
        for (int i = 1; i <=10; i++) {
            str+=n+" X "+i+" = "+(i*n)+"\n";
        };;;;;;
        FileWriter fileWriter = new FileWriter("cwh_112file.txt");
        fileWriter.write(str);
        fileWriter.close();//it is a good practice.. file ko use karne ke baad close kar dena..
        ;;;;;};;;
        */

        /*Problem 6:*/
        int n = 2;
//        String str="Multiplication Table of " + n + " is :\n";
        String str="";
        while (n <= 9) {
            for (int i = 1; i <= 10; i++) {
                if (i == 1) {
                    str += "Multiplication Table of " + n + " is :\n";
                }
                str += n + " X " + i + " = " + (i * n) + "\n";
                if (i == 10) {
                    str += "\n";
                }
            }
            n++;
        }
        System.out.println(str);
        FileWriter fileWriter = new FileWriter("cwh_112file.txt");
        fileWriter.write(str);
        fileWriter.close();//it is a good practice.. file ko use karne ke baad close kar dena..
        }
    }