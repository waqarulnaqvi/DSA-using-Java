package com.company;
class A1{//parent class A1 is type..
    public int a;

    public int waqarul(){
        return 4;
    }

    protected void meth2(){//this
        System.err.println("I am method 2 of class A");
    }

      protected int meth2(int k){//this
        System.err.println("I am overloaded method 2 of class A");
        return k;
    }
}
class B extends A1{//child class B is a subtype of parent class A1..
//Inside of Method & Constructor run outside of method error:-
//a =43;//error
//this.a =43;//error
//super.a =43;//error

//  B(){//Constructor
//      a =43;//run
//this.a =43;//run
//super.a =43;//run
//}

    public void meth3() {
//  Inside of Method & Constructor run outside of method error:-
//a =43;//run
//this.a =43;//run
//super.a =43;//run
// All there types is possible to invoke parent class parameter if it is public..
        System.err.println("I am method 3 of class b");
    }

    @Override//override shows that this method has been overriden..
    // if you want to write override method or not it's all your choice..
    public void  meth2(){//and this is called a method overriding..
        super.meth2();//Run..
//        super.meth2(23);//Run..
        //Rules of Overriding:
        //1)In overriding subclass function and superclass function must have name type...
        //ex: int subclass int superclass fuction run and,
        // if void subclass int superclass fuction error
        //2)access level must be same of super and subclass means both are public and protected or either 1 is public and other is protected..
        //3)static method and final method can not be overridden
        /*Method overriden(Redefining method of super class(in subclass)):
        if the child class implements the same method present in the parent class again, it is known as method overriding..
       */
        System.err.println("I am method 2 of class B");
    }

    @Override//Redefining Method of super class is called Overriding..
        public int meth2(int a){
//        super.meth2(5);//Run..
//        super.meth2();//Run..
        super.meth2(23);//Run..
            System.err.println("I am overloaded method 2 of class B");
            return a;
        }
}
class pt_38_cwh48Methodoverriding {
    public static void main(String[] args) {
        A1 a=new A1();
//        a.meth2();
//        System.err.println(a.meth2(3));

        System.err.println("\nOverriden Method:");
        B b=new B();
        b.meth2();
        b.meth2(3);
        System.err.println(b.meth2(3));

//        b.meth3();//meth3 is not overridden..
    }
}
