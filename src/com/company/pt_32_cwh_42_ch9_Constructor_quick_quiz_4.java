package com.company;
import java.util.Scanner;
class MyEmployee1
{
    private int sal;//agar hum kissi variable ka data type private kar dete hai to hum us data type ko directly (.) operator se access ni kar sakte hai humme getters,setters ya constructor use karna padhega..
  private   String name;
  //Constructor:- A member function used to initialize an object while creating it..
   public  MyEmployee1(){//Constructor invoke automatically without any explicit invokation..
      sal=344;
      name="Azaan";
   }
    public  MyEmployee1(String name,int i){
        this.sal=i;
        this.name=name;
    }//Constructor Overloading..
    public  MyEmployee1(String n){
        sal=10000;//quick_quiz_4 :Overload the Employee Constructor to initialize the salary to Rs 10,000..
        name=n;
    }
  //Setter takes value Getter return...
  public String getName(){
      return name;
  }
  public void setName(String n){
      this.name=n;
  }
   public void setId(int i){
        this.sal=i;
    }
    public int getId(){
        return sal;
    }
}
public class pt_32_cwh_42_ch9_Constructor_quick_quiz_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyEmployee1 o=new MyEmployee1("Mr Naqvi");
        System.err.println("Salary is" +o.getId());
        o.setId(420);
//        System.out.println(o.setId(420));//Error type is void..
        System.err.println("Salary is" +o.getId());
        System.err.println("Enter name and Salary:");
        String str=sc.nextLine();
        int n=sc.nextInt();
//        MyEmployee1 obj=new MyEmployee1();

        MyEmployee1 ob=new MyEmployee1(str,n);
     //   ob.setName("Waqarul");
        System.err.println(ob.getId());
        System.err.println(ob.getName());
//        System.err.println(obj.getId());
//        System.err.println(obj.getName());
//        System.err.println(o.getName());
//        System.err.println(o.getId());
    }
}
