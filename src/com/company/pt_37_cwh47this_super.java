package com.company;
class doclass{
    int y;
    public doclass(int y) {
        this.y = y;//this is a reference which refer doclass(refer that class where it is used) and avilable in that class(doclass)..
        System.err.println("I am a doclass constructor:");
//        return y;//constructor can't return any value..
    }
    public void hello(){
        System.err.println("Hello! How are you:");
    }
}
class EKClass extends doclass{
    int a;
//    Note:Constructor behave Like Setter..
    public int returnone(){
        return 1;
    }
    public int getA() {
        return a;
    }
     EKClass(int a) {
        super(a);//A reference  variable which is used to refer immediate parent class object...
         /*1)can be used to refer immediate parent class instance variable.
         2)can be used to invoke parent class method.
         3)can be used to invoke parent class custom (which take arguments) constructors.
         reference meaning source
          */
        this.a = a;//clearly samjh aata hai ki iski property ko set kiya ja raha hai this keyword ki help se!!
         System.err.println("I am a ek class constructor:");
    }
}

public class pt_37_cwh47this_super{
    public static void main(String[] args) {
        EKClass e=new EKClass(6);// e is a reference which refer the object of that class..
//        doclass k=new doclass(3);
        System.err.println(e.getA());
    }
}
