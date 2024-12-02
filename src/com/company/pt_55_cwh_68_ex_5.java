/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
 */
package com.codeWithharry.shape;
//package com.company;
// interface shape
// {
//     void volume();
//     void Surfacearea();
// }
import java.util.*;
class Circle {
    private float r;
    Circle(float r)
    {
        this.r=r;
    }
    public void perimeter()
    {
        System.out.println("perimeter of Circle is "+(2*Math.PI*r));
    }
    public void area()
    {
        // perimeter();
        System.out.println("\nArea of Circle is "+(Math.PI*r*r));
    }
}
class Sphere extends Circle{
    private float r;
    Sphere(float r)
    {
        super(r);
        this.r=r;
    }
    public void volume()
    {
        super.perimeter();
        System.out.println("Volume of Sphere is "+(4/3*Math.PI*r*r*r));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Sphere is "+(4*Math.PI*r*r));
    }
}
class square extends Sphere {
    private float l;
    square(float l)
    {
        super(l);
        this.l=l;
    }
    @Override
    public void volume()
    {
        super.volume();
        System.out.println("Volume of Square is "+(l*l*l));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Square is "+(l*l));
    }
}
class Cylinder extends square{
    private float r,h;
    Cylinder(float r,float h)
    {
        super(r);
        this.r=r;
        this.h=h;
    }
    @Override
    public void volume()
    {super.volume();
        System.out.println("Volume of Cylinder is "+(Math.PI*r*r*h));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Cylinder is "+(2*Math.PI*r*(r+h)));
    }
}
class Rectangle extends Cylinder{
    private float l,b,h;
    Rectangle(float l,float b,float h)
    {
        super(l, h);
        this.l=l;
        this.b=b;
        this.h=h;
    }
    @Override
    public void volume()
    {
        super.volume();
        System.out.println("Volume of Rectangle is "+(l*b*h));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Rectangle is "+(l*b));
    }
}
public class  pt_55_cwh_68_ex_5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number length or radius or side:");
        float l=sc.nextFloat();
        System.out.println("Enter a number breadth:");
        float b=sc.nextFloat();
        System.out.println("Enter a number height:");
        float h=sc.nextFloat();
        Rectangle obj=new Rectangle(l,b,h);
        obj.volume();
        obj.area();
    }
}
