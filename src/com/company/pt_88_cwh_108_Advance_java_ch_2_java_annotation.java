package com.company;
//Annotation class ko meta data provide karti hai..
//meta data means information about some information..
//compiler the way it behaves change kar leta hai agar annotation laggi hoti hai..
//Annotation in Java:-Used to provide extra information about a program annotation provides metadata to class/methods..
@FunctionalInterface
//functional interface me sirf ek hi method hota hai or wo method abstract hota hai..
interface myfunctionalInterface{
//    void thisMethod();//Error if you use function interface annotation and uncomment this..
//functional interface me sirf ek hi method hota hai or wo method abstract hota hai..
    void thisMethod1();
}

//class newphone extends Phone//pt 39 cwh 49 dynamic method dispatch class which i extended..
//class newphone extends SmartPhone//pt 39 cwh 49 dynamic method dispatch class which i extended..
//        {
//            @Override
//            public void greet()
//            {
//                super.greet();
//                System.out.println("Marr ja saale!");
//            }
//            @Deprecated
//            public int sum(int a,int b)
//            {
//                return a+b;
//            }
//        }
public class pt_88_cwh_108_Advance_java_ch_2_java_annotation {
    @SuppressWarnings("deprecation") //Use @SuppressWarnings("deprecation") any where in the program it will remove all deprecation warning..
//    @SuppressWarnings hum use karke compiler ki awaaz ko dabaate hai means (build me) jo warning aa rhi hoti hai (deprecated anotation lagga ke jo humne user defined function depricate) kiya usko use karne ki wajhe se phir wo warning aana band ho jaati hai..
    public static void main(String[] args) {
//        newphone ob=new newphone();
//        ob.greet();

//        System.out.println(ob.sum(4,23));
//       ob.sum(4,23);
    }
}
/*
Annotation in Java:
Used to provide exta information about a program annotation provides metadata to class/methods..
Following are some common annotation built into java:-
1)@Override ->Used to mark Overriden elements in the child classes.
2)@SuppressWarnings ->Used to suppress the generated warnings by the compiler.
3)@depricated ->Used to mark deprecated methods.
4)@Functional Interface ->Used to ensure an interface is a functional interface..
//functional interface me sirf ek hi method hota hai or wo method abstract hota hai..
 */
