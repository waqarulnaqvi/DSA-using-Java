package com.company;
//you can extend one interface to the another interface but you can't extend interface to the class but you can only implement interface to the class..
//inheritance based on DRY principle (Don't repeat yourself)..
interface sample{
    void meth1();
    void meth2();
}
interface sample1 extends sample {//you can use Inheritance in the interface through extends keyword..
    void meth3();
    void meth4();
    @Override
  void meth2();
    @Override
    default void meth1()
    {
        System.out.println("default meth1");
    }
}
class Sample2 implements sample1{
    @Override
    public void meth1() {//It override the default meth1 without this default meth1 will be printed..
        System.out.println("I am a Meth 1");
    }
    @Override
    public void meth2() {
        System.out.println("I am a Meth 2");
    }
    @Override
    public void meth3() {
        System.out.println("I am a Meth 3");
    }
    @Override
    public void meth4() {
        System.out.println("I am a Meth 4");
    }
    void meth5(){
        System.out.println("I am a Math 5");
    }
}
public class pt_47_cwh_58_Inheritance_in_interfaces {
    public static void main(String[] args) {
        sample obj =new Sample2();//Dynamic Method dispatch..
        obj.meth1();
        obj.meth2();
//        obj.meth3(); --Throws an error
//        obj.meth4();   --Throws an error
//        obj.meth5();   --Throws an error

        System.out.println();
        sample1 ob =new Sample2();//Dynamic Method dispatch..
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
//        ob.meth5();   --Throws an error

        System.out.println();
        Sample2 o=new Sample2();
        o.meth1();
        o.meth2();
        o.meth3();
        o.meth4();
        o.meth5();

    }
}
