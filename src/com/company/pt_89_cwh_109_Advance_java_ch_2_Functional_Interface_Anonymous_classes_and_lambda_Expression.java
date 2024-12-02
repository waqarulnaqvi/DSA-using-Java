package com.company;
@FunctionalInterface
//functional interface me sirf ek hi method hota hai or wo method abstract hota hai..
interface HornBicycle1 {
    void blowhorn(int a);
//    void blowhorn1();
}

//class HarryCoder implements HornBicycle1{
//        @Override
//    public   void blowhorn() {; System.err.println("Blow Horn Harry");//Run..
//    }
//}

//class Avencycle4 implements HornBicycle1 {
//    int a=435;
//    public void a(){
//        System.err.println("ok the value of a is "+a);
//    }
//
//    @Override
//    public   void blowhorn() {; System.err.println("Blow Horn");//Run..
//    }
//
//    @Override
//    public void blowhorn1(){;//run
//        System.err.println("stop Horn");
//    };
//};//run

//    class Avencycle implements com.company.HornBicycle { //Run..
//        int speed =7;
//        public void a(){
//            System.err.println("ok the value of a is "+a);
//        }
//        @Override
//        public void applyBrake(int d){
//            System.err.println(speed=speed-d);
//        }
//        @Override
//        public void speedup(int increment) {
//            System.err.println(speed = speed - increment);
//        }
//        @Override
//        public   void blowhorn()
//        {
//            System.err.println("Blow Horn");
//        }
//        @Override
//        public void blowhorn1(){
//            System.err.println("stop Horn");
//        }
//    }
public class pt_89_cwh_109_Advance_java_ch_2_Functional_Interface_Anonymous_classes_and_lambda_Expression {;//run..
    public static void main(String[] args) {;//run,,
//        Avencycle4 ob=new Avencycle4();
//        HornBicycle1 ob1=new Avencycle4();//Run..//Dynamic Method Dispatch..

//        @FunctionalInterface//Error..
        //Anonymous classes:-
//        HornBicycle1 ob2 = new HornBicycle1() {
////            @FunctionalInterface//Error..
//
//            //that's how we can create a anonymous class who's name does'nt exists..
//            //anonymous class use hoti hai ek expression bannane ke liye or app ko us expression ko ek baar se zyada use ni karna hota hai tab aap anonymous class banate hai...
//            //local class agar aapko sirf ek baar chahiye use karne ko tab aap anonymous classes ka istemaal kar sakte ho..
//            @Override
//            public void blowhorn() {
//                System.err.println("Blow Horn");
//            }
//
////            @Override
//            public void blowhorn1() {//you can' run this function but calling it with its object because you create a functional interface and this is a extra function which does not belong to the interface..
//                System.err.println("stop Horn");
//            }
//        };//Without semicolon Error..
//        ob.blowhorn();
//        ob.blowhorn1();
//
//        ob1.blowhorn();
//        ob1.blowhorn1();
//
//        ob2.blowhorn();
//        ob2.blowhorn1();

        //Lambda Expressions:-
//        @Override//Error..
        HornBicycle1 ob3=(a)->{//a ka data type batane ki zarrurat ni hai java is smart enough wo khud se samajh lega a ka datatype..
//            @Override//Error..
            System.err.println("Blow Horn Harry Returns :"+a);//Run..
        };//lambda expression aapke code ko chootta banata hai or code ki readability badhata hai..
        //lambda expression aapke code ko compact and concise banata hai..
     ob3.blowhorn(45);
    }
}
