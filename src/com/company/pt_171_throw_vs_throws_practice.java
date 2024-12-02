package com.company;
class randirona extends Exception{
    @Override
    public String toString() {
        return "Randirona exception";
    }

    @Override
    public String getMessage() {
        return "It's a randirona Exception";
    }
}
public class pt_171_throw_vs_throws_practice {
    public static int divide(int a, int b) throws ArithmeticException, randirona {
        if (a == 69) {
            throw new randirona();
        }
        return a / b;
    }

    // public static void main(String[] args) throws ArithmeticException, randirona {
    public static void main(String[] args) throws ArithmeticException {
        try {

//            int c = divide(69, 01);
//            int c = divide(690, 0);
            int c = divide(692, 011);
            System.out.println(c);
            throw new ArithmeticException("o se divide ni hui be");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}