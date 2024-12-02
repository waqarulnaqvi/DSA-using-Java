//package com.company;
//import java.util.Scanner;
//class Emp {
//    int id, salary;
//    String name;
//}
//    public class selfpt_5_employee_OOPS {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many Employee is in your company:");
//            int n = sc.nextInt(), c = 0, k = 0;
//            Emp e[] = new Emp[n];
//            for (int i = 0; i < n; i++) {
//                e[i]=new Emp();
//                System.out.printf("Enter Id of Employee %d: ", i + 1);
//                e[i].id = sc.nextInt();
//                System.out.printf("Enter name of Employee %d: ", i + 1);
//                e[i].name = sc.next();
//                System.out.printf("Enter salary of Employee %d: ", i + 1);
//                e[i].salary = sc.nextInt();
//            }
//            for (int i = 0; i < n; i++) {
////                if ((e[i].id == 123) && (e[i].name).equals("xyz")) {
//                if ((e[i].id == 123) && ("xyz").equals(e[i].name)) {
//                    e[i].salary += 15000;
//                    c = i;
//                    k = 1;
//                }
//            }
//            if (k == 1)
//                System.out.println("The new Salary of Employee whose Name = " + e[c].name + " and id  =" + e[c].id  + " is " + e[c].salary);
//            else
//                System.out.println("Employee with ID=123  And Name=xyz  is NOT FOUND");
//        }
//    }
////  "IGNORE BELOW WRITTEN CODE"
////METHOD :1
////            String str=sc.next();
////            String k=sc.next();
////            int a=sc.nextInt();
////            int v= 75;
////            if(v==a&&k.equals(str))
////                System.out.println("yes");
////            else
////                System.out.println("no");
////METHOD:2
////            String k=sc.next();
////            int a=sc.nextInt();
//////            if(a==33&&k.equals("abc"))
////                if(a==33&&"abc".equals(k))
////                System.out.println("yes");
////            else
////                System.out.println("no");
////        }
////        }
////class student{
////    int id;
////    String name;
////    void data(int id,String name){
////        this.id=id;
////        this.name=name;
////    }
////    void display(){
////        System.out.println("Student Name is "+name+" & ID is "+id);
////    }
////}
////public class selfpt_5_employee_OOPS {
////    public static void main(String[] args) {
////        student[] arr=new student[2];
////        arr[0]=new student();
////        arr[1]=new student();
////        arr[0].id=11;
////        arr[0].name="xyz";
////        System.out.println(arr[0].id+arr[0].name);
////        arr[0].data(45,"DEfF");
////        arr[1].data(456,"DEF");
////        arr[0].display();
////        arr[1].display();
////    }
////}