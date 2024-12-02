//Math.PI is a function which holds PI value in java..
package com.company;
import java .util.Scanner;
//question:1
//class Cylinder {
    //private float radius ,height;
//   void setradius(float r)
//   {
//       radius=r;
//   }
//   float getradius()
//   {
//       return radius;
//   }
//   void setHeight(float h)
//   {
//       height=h;
//   }
//   float getheight()
//   {
//       return height;
//   }
//    private float radius ,height;
//}
//public class cwh_44Practicesetch9 {
//    public static void main(String[] args) {
//  Scanner sc =new Scanner(System.in);
//     Cylinder ob=new Cylinder();
//        System.err.println("Enter radius of Cylinder:");
//     float r=sc.nextFloat();
//        System.err.println("Enter height of Cylinder:");
//    float h = sc.nextFloat();
//    ob.setHeight(h);
//    ob.setradius(r);
//        System.err.println("Height of Cylinder is :"+ob.getheight());
//        System.err.println("Radius of Cylinder is:"+ob.getradius());
//    }
//}
//question:2
//    class Cylinder {
//        private float radius, height, sa, v;
//        void setradius(float r) {
//            radius = r;
//        }
//
//        float getradius() {
//            return radius;
//        }
//        void setHeight(float h) {
//            height = h;
//        }
//        float getheight() {
//            return height;
//        }
//        float surfacearea() {
//            sa = (float)(2 * (Math.PI) * radius * height+ 2 * (Math.PI) * radius * radius);
//            return sa;
//        }
//        double volume() {
//            v = (float) (Math.PI * radius * radius * height);
//            return v;
//        }
//    }
//    public class cwh_44Practicesetch9 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            Cylinder ob = new Cylinder();
//            System.err.println("Enter radius of Cylinder:");
//            float r = sc.nextFloat();
//            ob.setradius(r);
//            System.err.println("Enter height of Cylinder:");
//            float h = sc.nextFloat();
//            ob.setHeight(h);
//            System.err.println("Height of Cylinder is :" + ob.getheight());
//            System.err.println("Radius of Cylinder is :" + ob.getradius());
//            System.err.println("Volume of Cylinder is :" + ob.volume());
//            System.err.println("Surface are of Cylinder is :" + ob.surfacearea());
//        }
//    }
//question:3
//class Cylinder
//{
//    private float radius ,height,sa,v;
//    Cylinder(float r,float h)
//    {
//        radius=r;
//        height=h;
//    }
////    void setradius(float r)
////    {
////        radius=r;
////    }
//    float getradius()
//    {
//        return radius;
//    }
////    void setHeight(float h)
////    {
////        height=h;
////    }
//    float getheight()
//    {
//        return height;
//    }
//    float surfacearea()
//    {
//        sa=(2f*(float)Math.PI*radius*height)+(2f*(float)Math.PI*radius*radius);
//        return sa;
//    }
//    float volume()
//    {
//        v=(float)Math.PI*radius*radius*height;
//        return v;
//    }
//}
//public class cwh_44Practicesetch9 {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        Cylinder ob=new Cylinder(6,34);
////        System.err.println("Enter radius of Cylinder:");
////        float r=sc.nextFloat();
////        System.err.println("Enter height of Cylinder:");
////        float h = sc.nextFloat();
////        ob.setHeight(h);
////        ob.setradius(r);
//        System.err.println("Height of Cylinder is :"+ob.getheight());
//        System.err.println("Radius of Cylinder is :"+ob.getradius());
//        System.err.println("Volume of Cylinder is :"+ob.volume());
//        System.err.println("Surface are of Cylinder is :"+ob.surfacearea());
//    }
//}
//question:4
//class rectangle {
//
//    private float length, breadth, a, p;
//    rectangle() {
//        this.length = 34;
//        this.breadth = 11;
//    }
//    rectangle(float l, float b) {
//        this.breadth = b;
//        this.length = l;
//    }
//    float getLength()
//    {
//        return length;
//}
//float getBreadth()
//{
//    return breadth;
//}
//    float area()
//    {
//       this. a=this.length*this.breadth;
//        return this.a;
//    }
//    float perimeter()
//    {
//       this.p= 2*(this.length+this.breadth);
//        return this.p;
//    }
//}
//public class pt_34_cwh_44Practicesetch9 {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.err.println("Enter length of rectangle:");
//        float l=sc.nextFloat();
//        System.err.println("Enter breadth of rectangle:");
//        float b = sc.nextFloat();
//        rectangle ob=new rectangle(l,b);
//        rectangle obj =new rectangle();
//        System.err.println("length is rectangle 1 :"+ob.getLength());
//        System.err.println("breadth of rectangle 1 :"+ob.getBreadth());
//        System.err.println("Area of rectangle  is :"+ob.area());
//        System.err.println("perimeter of rectangle  is :"+ob.perimeter());
//        System.err.println("length is rectangle 2 :"+obj.getLength());
//        System.err.println("breadth of rectangle 2 :"+obj.getBreadth());
//        System.err.println("Area of rectangle  is :"+obj.area());
//        System.err.println("perimeter of rectangle  is :"+obj.perimeter());
//    }
//}
//question:5
class Sphere
{
    private float radius ,sa,v;
    public Sphere()
    {
       v=23;
    }

//    public Sphere(float radius) {//Constructor can be public or protected it can not be private..
//    private Sphere(float radius) {//Constructor can be public or protected it can not be private..
    protected Sphere(float radius) {//Constructor can be public or protected it can not be private..
        this.radius = radius;
    }

    void setradius(float r)
    {
        radius=r;
    }
    float getradius()
    {
        return radius;
    }
    float surfacearea()
    {
//        sa =4*3.14f*radius*radius;
//        return sa;
        return 4*3.14f*radius*radius;
    }
    float volume()
    {
//        v= ((4/3f)*3.14f*radius*radius*radius);
//        v= ((4f/3)*3.14f*radius*radius*radius);
//        v= ((4f/3f)*3.14f*radius*radius*radius);
//        return v;
      return ((4f/3f)*3.14f*radius*radius*radius);
    }
}
public class pt_34_cwh_44Practicesetch9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Sphere ob=new Sphere();
        Sphere obj=new Sphere(23);
        System.err.println("Enter radius of Sphere:");
        float r=sc.nextFloat();
        ob.setradius(r);
        System.err.println("\nNon-Parameterized Constructor value:");
        System.err.println("Radius of Sphere is :"+ob.getradius());
        System.err.println("Volume of Sphere is :"+ob.volume());
        System.err.println("Surface are of Sphere is :"+ob.surfacearea());

        System.err.println("\nParameterized Constructor value:");
        System.err.println("Radius of Sphere is :"+obj.getradius());
        System.err.println("Volume of Sphere is :"+obj.volume());
        System.err.println("Surface are of Sphere is :"+obj.surfacearea());
    }
}
