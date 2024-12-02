package com.company;
import java.util.Scanner;
//question:-1
class Employee1 {
    int salary = 555;//property
    String name;//property

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String s) {
        name = s;
    }
//    void setSalary(int s)
//        {
//            salary=s;
    //   }

//public class ch8Oopps_practiceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee1 obj = new Employee1();
        System.err.println("Enter Salary");
        obj.setName("King");
      //  obj.name="aazan";
       System.err.println(obj.getName());
        //obj.salary = 4444;
        System.err.println(obj.getSalary());
      //  obj.name("Azaan Naqvi");
       // System.err.println(obj.getName());
       // obj.setSalary(2222);
      //  System.err.println(obj.getSalary());
    }
}
//question 2:
//class cellphone   {
//  void ring()
//  {
//      System.err.println("Cellphone is Ringing:");
//    }
//    int vibrate()
//    {
//        System.err.println("Cellphone is Virbrating ");
//return 1;
//    }
//    void callFriend()
//    {
//        System.err.println("Calling Azaan");
//    }
////public class ch8Oopps_practiceset {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        cellphone obj = new cellphone();
//     //  System.err.println(obj.vibrate());
//   //     System.err.println(obj.ring());
//    //    System.err.println(obj.callFriend());
//        obj.ring();
//    obj.vibrate();
//    obj.callFriend();
//    }
//}
//auestion:-3
//class square {
//    static float area(float side) {
//        float area = side * side;
//        return area;
//    }
//
//     float peri(float side) {
//        float peri = 4 * side;
//        return peri;
//    }
////public class ch8Oopps_practiceset {
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//        square obj=new square();
//        System.err.println("Enter unit :-");
//        String str=sc.nextLine();
//        System.err.println("Enter a side of Square :");
//float side =sc.nextFloat();
//       // int side =sc.nextInt();
////        System.err.println("Enter unit :-");
////        String sr=sc.nextLine();
//        // String sr=sc.next();
//        System.err.println("AREA of Square is :"+obj.area(side)+"("+str+")"+"2");
//        System.err.println("PERIMETER of Square is :"+obj.peri(side)+str);
//    }
//    }
//question:-3(cwh logic)
//class square {
// float side;
//     float area() {
//        return side*side;
//    }
//
//    float peri() {
//        return 4*side;
//    }
//    //public class ch8Oopps_practiceset {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        square obj=new square();
//        System.err.println("Enter unit :-");
//        String str=sc.nextLine();
//        System.err.println("Enter a side of Square :");
//        float side =sc.nextFloat();
//        obj.side=side;
//        // int side =sc.nextInt();
////        System.err.println("Enter unit :-");
////        String sr=sc.nextLine();
//        // String sr=sc.next();
//        System.err.println("AREA of Square is :"+obj.area()+"("+str+")"+"2");
//        System.err.println("PERIMETER of Square is :"+obj.peri()+str);
//    }
//}
// question:-4
//class rectangle {
//    static float area(float l ,float b) {
//        float area = l*b;
//        return area;
//    }
//
//    float peri(float l,float b) {
//        float peri = 2*(l*b);
//        return peri;
//    }
////}
////public class ch8Oopps_practiceset {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        rectangle obj=new rectangle();
//        System.err.println("Enter unit :-");
//        String str=sc.nextLine();
//        System.err.println("Enter a length and breath of Rectangle  :");
//        float l =sc.nextFloat();
//        float b =sc.nextFloat();
//        // int side =sc.nextInt();
////        System.err.println("Enter unit :-");
////        String sr=sc.nextLine();
//        // String sr=sc.next();
//        System.err.println("AREA of Square is :"+obj.area(l,b)+"("+str+")"+"2");
//        System.err.println("PERIMETER of Square is :"+obj.peri(l,b)+str);
//    }
//}
//question:5
//      public class pt_30_ch8_OOpps_practiceset {
//     static class TommyVecetti {
//        void hit() {
//            System.err.println("Hitting the enemy");
//        }
//
//        int run() {
//            System.err.println("Running from the enemy");
//            return 1;
//        }
//
//        void fire() {
//            System.err.println("Firing the enemy");
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            TommyVecetti obj = new TommyVecetti();
//            obj.hit();
//            obj.run();
//            obj.fire();
//        }
//    }
//}
//question:6
//class circle {
//    static float area(float r) {
//        float area =  (3.14f* r * r);
//        return area;
//    }
//
//     float peri(float r) {
//        float peri = 2*3.14f*r;
//        return peri;
//    }
////}
////class ch8Oopps_practiceset {
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//        circle obj=new circle();
//        System.err.println("Enter unit :-");
//        String str=sc.nextLine();
//        System.err.println("Enter a radius of Circle  :");
//float r =sc.nextFloat();
//       // int side =sc.nextInt();
//     // System.err.println("Enter unit :-");
//   //  String sr=sc.nextLine();
//      // String sre=sc.next();
//        System.err.println("AREA of Circle is :"+obj.area(r)+"("+str+")"+"2");
//        System.err.println("PERIMETER of Circle is :"+obj.peri(r)+str);
//    }
//    }