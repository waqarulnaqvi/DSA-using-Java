import java.util.Scanner;

public class pt_248_american_express_sitting_arrangement_problem {

//    Question 6 : Seating Arrangement in Exam Hall
//    Problem Statement  :
//
//    Semester exams are going on for university students. Examiners noticed that a group of people are trying to cheat. They marked students of that group as ‘1’ and students of another group ( who are not cheating ) as ‘0’
//
//    We can reduce cheating by not allowing students from group 1 to sit together, means no two students from group 1 can sit together. Seatings are marked using above conditions. Your task is to give the seating placement of nth possibility Possibility order from 1 to 10 is given below
//
//[1  10  100  101  1000  1001  1010  10000  10001  10010]
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int c=0;

        for (int i = 1; i <=20 ; i++) {
//10 31
            String s=Integer.toBinaryString(i);
            String k[]=s.split("0");
            for(String st:k)
            {
//                System.out.println(st);
                if(st.equals("11") || st.equals("111") ||st.equals("1111"))
                {
                    c=1;
                }
            }
            if(c==0) {
                System.out.print(s + " ");
            }
            c=0;
        }
    }
}
