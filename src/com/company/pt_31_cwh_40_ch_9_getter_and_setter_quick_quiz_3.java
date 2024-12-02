package com.company;
import java.util.Scanner;
//class MyEmployee
//{
//    private int id;//To implement data hiding we use private acess modifier with the help of Method..
//  protected   String name;
//  //Setter takes value Getter return...
//  public String getName(){
//      return name;
//  }
//  public void setName(String n){
//      this.name=n;
//  }
//    public void setId(int id){
//        this.id=id;
//    }
//    public int getId(){
//        return id;
//    }
//}
//public class pt_31_cwh_40_ch_9_getter_and_setter {
//    public static void main(String[] args) {
//        MyEmployee obj=new MyEmployee();
////        obj.id=45;
//        obj.name="Syed Waqarul";
//        //Throws an error due to private access Modifier...
////       obj.setName("WaqarulHasan");
//        System.err.println(obj.getName());
//        obj.setId(2232);
//        int k=obj.getId();
//        System.err.println(k);
//    }
//}
//Practice Quiz (when i was beginner):-
//class Circle
//{
//    private float area;
//    private float  perimeter;
//    //private int guess;
//   // private int guess1;
//    //Setter takes value Getter return...
//
//    public void setArea(int n) {
//        this.area = 3.14f * n * n;
//    }
//          public float getArea()
//        {
//            return  area;
//        }
//    public void setperimeter(int i){
//        perimeter= (2*3.14f*i);
//    }
//    public float getprimeter(){
//        return perimeter;
//    }
////    public int setgua(int k)
////    {
////        if((k==getArea()+1)||(k==getArea())||(k==getArea()-1)) {
////            guess =k;
////        }
////        public int getgua()
////        {
////            return guess;
////
////        }
////        public int setgup(int s)
////        {
////            if((s==getprimeter()+1)||(s==getprimeter())||(s==getprimeter()-1)) {
////                guess =s;
////            }
////            public int getgup()
////            {
////                return guess;
////
////            }
//
//    }
//
//public class pt_31_cwh_40_ch_9_getter_and_setter {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.err.println("Enter a Radius  of Circle :");
//        int r=sc.nextInt();
//        Circle obj=new Circle();
//        obj.setArea(r);
//        System.err.println("AREA of circle is :"+obj.getArea());
//        obj.setperimeter(r);
//        System.err.println("Perimeter of circle is :"+obj.getprimeter());
//        System.err.println("GUESS THE AREA :");
//        float a=sc.nextFloat();
//      float l=obj.getArea();
//      float m=obj.getprimeter();
//// for(float i=l;i<=l+2;i=i+0.1f) {
////     if (a==i)
//    if(a==l+2||a==l-2||a==l+1||a==l-1)
//     {
//      //   a=obj.getArea();
//         System.err.println("Almost correct");
//     }
//    else  if(a== obj.getArea())
//     {
//         System.err.println("SUPERB");
//     }
//     else
//     {
//         System.err.println("WRONG");
//     }
//
//        System.err.println("GUESS THE PERIMETER");
//        float p=sc.nextFloat();
//        if (p== obj.getprimeter()+2||p==obj.getprimeter()-2||p==m+1||p==m-1)
//        {
//            System.err.println("ALMOST CORRECT");
//        }
//
//        else if(p== obj.getprimeter())
//    {
//        System.err.println("SUPERB");
//    }
//        else
//    {
//        System.err.println("WRONG");
//    }
//
////        obj.id=45;
////        obj.name="Syed Waqarul";
////        Throws an error due to private access Modifier...
//
//    }
//}
//quick_quiz_3 (When I am an intermediate programmer (nov 6 2021)):-
class Circle {
    private float area;//agar hum kissi variable ka data type private kar dete hai to hum us data type ko directly (.) operator se access ni kar sakte hai humme getters,setters ya constructor use karna padhega..
    private float perimeter;//agar hum kissi variable ka data type private kar dete hai to hum us data type ko directly (.) operator se access ni kar sakte hai humme getters,setters ya constructor use karna padhega..
    //private int guess;
    //Setter takes value Getter return...

    public void setArea(int n) {
        this.area = 3.14f * n * n;
    }

    public float getArea() {
        return area;
    }

    public void setperimeter(int i) {
        perimeter = (2 * 3.14f * i);
    }

    public float getprimeter() {
        return perimeter;
    }
 public void guessarea(){
     Scanner sc = new Scanner(System.in);
     System.out.println("do you want to try again:\n press 1 for yes \n press 2 for no");
     int n=sc.nextInt();
     if (n==1){
         guess1();
     }
//     else{
//         guess2();
//     }
 }
 public void guessper(){
     Scanner sc = new Scanner(System.in);
     System.out.println("do you want to try again:\n press 1 for yes \n press 2 for no");
     int n=sc.nextInt();
     if (n==1){
         guess2();}
 }
    public void guess1() {
        Scanner sc = new Scanner(System.in);
        System.err.println("GUESS THE AREA :");
        float a = sc.nextFloat();
        float l = getArea();
        if (a<=l+2&&a>=l-2&&a!=l) {
            System.err.println("Almost correct");
            guessarea();
        } else if (a == getArea()) {
            System.err.println("SUPERB");
//            guess2();
        } else {
            System.err.println("WRONG");
            guessarea();
        }
    }public void guess2() {
        Scanner sc = new Scanner(System.in);
        float m = getprimeter();
        System.err.println("GUESS THE PERIMETER");
        float p = sc.nextFloat();
        if (p<=m+2&&p>=m-2&&p!=m) {
            System.err.println("ALMOST CORRECT");
            guessper();
        } else if (p == getprimeter()) {
            System.err.println("SUPERB");
        } else {
            System.err.println("WRONG");
            guessper();
        }
    }
}
public class pt_31_cwh_40_ch_9_getter_and_setter_quick_quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a Radius  of Circle :");
        int r=sc.nextInt();
        Circle obj=new Circle();
        obj.setArea(r);
        System.err.println("AREA of circle is :"+obj.getArea());
        obj.setperimeter(r);
        System.err.println("Perimeter of circle is :"+obj.getprimeter());
        obj.guess1();
        obj.guess2();
    }
}

