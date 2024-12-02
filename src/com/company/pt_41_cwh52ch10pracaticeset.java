package com.company;
//problem 1&3
class cylinder2 extends circle2{
    public double he;
    cylinder2()
    {
        System.err.println("I am non parametrized cylinder");
    }
    public cylinder2(double r,double h) {
//        super.ra=r;
     super(r);
        System.err.println("I am parameterized cylinder:");
        this.he = h;
    }
    public double volume(){
        return Math.PI*this.ra*this.ra*this.he;
    }
}
class circle2{
    public double ra;
    circle2()
    {
        System.err.println("I am non parametrized circle");
    }
    public circle2(double r) {
        System.err.println("I am parameterized circle:");
        this.ra = r;
    }
    public double area(){
        return Math.PI*this.ra*this.ra;
    }
}

//problem 2&4
class cuboid extends rectangle2{
    public double la;
    public double ba;
    public double he;
    cuboid()
    {
        System.err.println("I am non parametrized cylinder");
    }
    public cuboid(double l,double b,double h) {
        super(l,b);
        System.err.println("I am parameterized cylinder:");
        this.he = h;
        this.la=l;
        this.ba=b;
    }
    public double volume(){
        //return this.la*this.ba*this.he/2;
        return (this.la*this.ba*this.he/2.0);
    }
    public double getLa() {
        return la;
    }
    public void setLa(double la) {
        this.la = la;
    }
    public double getBa() {
        return ba;
    }
    public void setBa(double ba) {
        this.ba = ba;
    }
    public double getHe() {
        return he;
    }
    public void setHe(double he) {
        this.he = he;
    }
}
class rectangle2{
    public double l;
     public double b;
    rectangle2( )
    {
        System.err.println("I am non parametrized circle");
    }
    public rectangle2(double la,double ba) {
        System.err.println("I am parameterized circle:");
         this.l=la;
        this.b=ba;
    }
    public double area(){
        return this.l*this.b;
    }
    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
}
public class pt_41_cwh52ch10pracaticeset {
    public static void main(String[] args) {

        //problem 1&3:
        System.err.println("\nBase class constructor:");
        circle2 ob=new circle2(34);
        System.err.println(ob.area());

        circle2 obk=new circle2();
        System.err.println(obk.area());

        System.err.println("\nDerived class constructor");
        cylinder2 obj=new cylinder2(57,7);
        System.err.println( obj.area());
        //        System.err.println(ob.area());
//        System.err.println(obj.area());
//        System.err.println(obj.volume());

        //problem 2&4:
//cuboid c=new cuboid(3,33,3);
//c.setBa(4);
//c.setHe(33);
//c.setLa(3);
//rectangle2 r =new rectangle2(3,33);
//       r.setB(333);
//       r.setL(322);
//        System.err.println(r.area());
//        System.err.println(c.area());//it will take only superclass constructor value
//        System.err.println(c.volume());
    }
}