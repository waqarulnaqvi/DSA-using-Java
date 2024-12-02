/*Exercise_6:
Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition.
        2. - -> Subtraction.
        3. * -> Multiplication.
        4. / -> Division.
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9.
        2. Cannot divide by 0 Exception.
        3. Max Input Exception if any of the inputs is greater than 100000.
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000..*/
package com.company;
import java.util.Scanner;
//class InvalidinputException extends Exception  throw InvalidinputExpection{//Error..
class InvalidinputException extends Exception{
    @Override
//    public String toString() throw InvalidinputExpection{//Error..
    public String toString() {
//        super.toString();//do nothing..
        return "InvalidInputException Input must be +,-,*,/..\n";
    }
    @Override
    public String getMessage() {
//        super.getMessage();//do nothing..
        return "InvalidInputException Input must be +,-,*,/..\n";
    }
}
class InputMultiplicationLessthan7000Exception extends InvalidinputException
{
    @Override
    public String toString() {
//        super.toString();//do nothing..
        return "InputMultiplicationLessthan7000Exception..\n";
    }
    @Override
    public String getMessage() {
//        super.getMessage();//do nothing..
        return "InputMultiplicationLessthan7000Exception..\n";
    }
}
class MaxInputException extends InputMultiplicationLessthan7000Exception
{
    @Override
    public String toString() {
//        super.toString();//do nothing..
        return "MaxInputException input must less than 100000..\n";
    }
    @Override
    public String getMessage() {
//        super.getMessage();//do nothing..
        return "MaxInputException input must less than 100000..\n";
    }
}
public class pt_70_cwh_87_Exercise_6 {
    public static void main(String[] args) throws InvalidinputException ,MaxInputException ,InputMultiplicationLessthan7000Exception,Exception,ArithmeticException,NullPointerException{
//    public static void main(String[] args) throws InvalidinputException ,MaxInputException ,InputMultiplicationLessthan7000Exception,ArithmeticException,NullPointerException{
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        System.out.println("WELCOME TO MASALLEDAR CALCULATOR..");
        while (loop) {
            System.out.println("PLEASE ENTER ..\n1. + -> Addition.\n2. - -> Subtraction.\n3. * -> Multiplication. \n4. / -> Division.\n5. b or B -> Breaking the loop..");
            char ch = sc.next().charAt(0);// 0 index ki value ko print karega chahe jitte input de de..

//       char ch=sc.next().charAt(1);//1 index ki value ko print karega chahe jitte input de de but 1 index se kam input denge to error dega..
//       char ch=sc.next().charAt(5);//5 index ki value ko print karega chahe jitte input de de but 5 index se kam input denge to error dega..
//        System.out.println("value is "+ch);

            if (ch == 'b'||ch=='B') {
                System.out.println("Breaking from the loop..");
//                loop=false;
                break;
            }
            System.out.println("Enter number 1:");
            float a = sc.nextFloat();
            System.out.println("Enter number 2:");
            float b = sc.nextFloat();
            if (a >= 100000 || b >= 100000) {
                try {
                    throw new MaxInputException();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
//                    System.out.println(e.toString());
//                    System.out.println(e);
                }
            } else {
                // Inhance Switch:-
                switch (ch)
                {
                    case '-' -> {
                        System.out.printf("Substraction of:\n %f - %f =%f\n", a, b, a - b);
                        System.out.printf("Substraction of:\n %f - %f =%f\n\n", b, a, b - a);
                    }
                    case '+' -> {
                        if (a == 8 && b == 9 || a == 9 && b == 8) {
                            try {
                                throw new InvalidinputException();
                            } catch (Exception e) {
                                System.out.println("InvalidinputException Cannot add 8 and 9..\n");
//                                System.out.println(e.getMessage());
//                           System.out.println(e.toString());
//                            System.out.println(e);
                            }
                        } else {
                            System.out.printf("Addition of:\n %f + %f =%f\n\n", a, b, a + b);
                        }
                    }
                    case '*' -> {
                        if (a >= 7000 && b!=0 || a!=0 && b >= 7000) {
                            try {
                                throw new InputMultiplicationLessthan7000Exception();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
//                                System.out.println(e.toString());
//                                System.out.println(e);
                            }
                        } else {
                            System.out.printf("Multiplication of:\n %f * %f =%f\n\n", a, b, a * b);
                        }
                    }

                    case '/' -> {
                        if (b == 0) {
                            try {
                                throw new ArithmeticException("Can not divide by 0 Exception..\n");
//                            throw new ArithmeticException();
                            } catch (Exception e) {
                              System.out.println(e.getMessage());
//                            System.out.println(e.toString());
//                            System.out.println(e);
                            }
                        } else {
                            System.out.printf("Multiplication of:\n %f / %f =%f\n\n", a, b, a / b);
                        }
                    }

//                case 'b' -> {
////                    System.out.println("Breaking the loop..");
////                    break;//break statement is redundant in Inhance Switch..
//                    loop=false;
//                }

                    default -> {
                        try {
                            throw new InvalidinputException();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
//                           System.out.println(e.toString());
//                            System.out.println(e);
                        }
                    }
                }
            }
        }
    }
}