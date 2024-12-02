package com.company;

import java.util.Scanner;

//Exception class which I extend is in the java.lang package..
//Custom Exception class..
class MyException extends Exception{
//    @Override
//    public String toString() {
////        return super.toString()+"I am toString";
//        return "I am toString";
//    }
////
//    @Override
//    public String getMessage() {
////        return super.getMessage()+"I am getMessage";
//        return "I am getMessage";
//    }
}
//class ArithmeticException extends Exception{//Run: yes we can overrite built_in Exception methods/function ..
//    @Override
//    public String toString() {
//        return "I am toString Exception";
//    }
////
//    @Override
//    public String getMessage() {
//        return "I am getMessage";
//    }
//}
public class pt_66_cwh_83_Exception_class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value:");
        int n =sc.nextInt();
        if(n<9)
        {
            try {
//                throw new MyException();
//                throw new ArithmeticException("This is an exception..");//in message block it will print "This is an exception.."
                //"This is an exception" is a Message..
                throw new ArithmeticException();//in message block it will print null..
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);//toString method will run..
//                e.printStackTrace();//this exception is very useful when you write a complex program..
                System.out.println("Finished..");
            }
        }
//        System.out.println("Yes Finished..");

        /*
        //if(n==1)//Exception occur when you enter 1..
        if(n==0)
        {
            throw new ArithmeticException("divided by o..");//agar hum throw keyword ka use karke throw karenge exception to wahi pe program ruk jaayega aage ka line of code execute ni hoga isiliye humme surrounded by try and catch block karna hoga exception ko..
           //The Throw keyword is used to throw an exception explicitly by the programmer..
           //Throw keyword se aap keh sakte ho ki is program ko yhi pe khatam kiya jaaye..
        }
        else {
            System.out.println("120/n ="+120/n);
        }
        System.out.println("No Finished..");//Won't Execute..
    */

//       if( n==1 || n==0) {
//            {
//                try {
//                    throw new ArithmeticException("Either divided by 1 or 0 Exception..");//agar hum throw keyword ka use karke throw karenge exception to wahi pe program ruk jaayega aage ka line of code execute ni hoga isiliye humme surrounded by try and catch block karna hoga exception ko..
//                    //The Throw keyword is used to throw an exception explicitly by the programmer..
//                    //Throw keyword se aap keh sakte ho ki is program ko yhi pe khatam kiya jaaye..
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }
//            }
//        }
//        else {
//            System.out.println("120/n ="+120/n);
//        }
//        System.out.println("No Finished..");//Execute..
    }
}
