package com.company;

import java.util.Scanner;

/*Finally block contains the code which is always executed whether the exception is handled or not..
It is used to execute code containing instructions to release the system resources,close a connection etc..
//finally block me hum wo code rakhte jiska execute hona zarruri hai chahe exception aaye chahe exception na aaye..
 */
class NegativeFactorialException extends Exception{
    @Override
    public String toString() {
        return "Negative factorial does not exists!";
    }
    @Override
    public String getMessage() {
        return "Negative factorial does not exists!";
    }
}
public class pt_68_cwh_85_finally_block_quick_quiz_7 {
//    public static int greet(int n) throws NegativeRadiusException {//if you use throws than greet function must be declared in try and catch either this function throw error or not..otherwise function won't run compiler will throw an error..
      public static int greet(int n) {
        try {
            int a = 500;
            int c = a / n;
            return c;
        }//return c ke hone baad bhi finally block execute hooyega..
        //This is the power of finally..
        //Or sabse pehle finally print hoga uske baad kxh print hoga..
//        catch (Exception e) {
//            System.out.println(e);
//        }
        finally {//Run : you can use try with finally block..
            //break ya return hone ke baad bhi function ya program se finally execute hoga hi hoga & either exception occur or not finally will run definately..
            System.out.println("Cleaning up resources...This is the end of this function..");
        }
//        return -1;
    }

    //quick_quiz_7:
//    public static int factorial(int n) throws NegativeFactorialException{ //if you use throws than factorial function must be declared in try and catch either this function throw error or not..otherwise function won't run compiler will throw an error..
    public static int factorial(int n) {
        int f = 1;
        if (n < 0) {
            try {
//                throw new NegativeRadiusException();//Run other package custom Exception function..
                throw new NegativeFactorialException();
            }
            catch (Exception e) {
                System.out.println(e);
//                break;//Error: when you use function type int&,float etc than you can't use break..
                return -1;//same work as break..
            }
            finally {//Run : you can use try with finally block..
                //break ya return hone ke baad bhi function ya program se finally execute hoga hi hoga & either exception occur or not finally will run definately..
                System.out.println("Cleaning up resources...2.0..");
            }
        } else {

            for (int i = 1; i <= n; i++) {
                f *= i;
            }
        }
        System.out.println("HI Hello");
        return  f;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
//        try {
//            int a=500;
//            int c=a/n;
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("This is the end of this program..");
//        }
        System.out.println("500/n = "+greet(n));
//        System.out.println("hiii");
        //quick_quiz_6:
//        System.out.println("Factorial is "+factorial(n));


    }
}
