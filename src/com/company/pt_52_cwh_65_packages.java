 package com.company;//User defined package..
/*  A package is used to group related classes Packages help in avoiding name conflicts..
There are 2 types of packages:-
1)Built in Packages ->Java API..
2)User defined Packages ->Custom packages..
*/
//import java.util.Scanner;//Method 1 to import Scanner class Built_in_package..
 import java.util.*;//Method 2 to import Scanner class Built_in_package..
public class pt_52_cwh_65_packages {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        java.util.Scanner sc =new java.util.Scanner(System.in);//Method 3 to import Scanner class Built_in_package..
        int n=sc.nextInt();
        System.out.println("This is my Scanner takin input as :"+n);
    }
}
/*
// package waqarul_naqvi.bye.kahallo.challo.ihi;//User defined package..
// the package file will be created in the ihi which is in the challo which is in the kahalllo which is in the bye which is in the waqarul_naqvi..
// package waqarul naqvi;//Giving space between the package name throws an error..
package waqarul_naqvi;//User defined package..
// package waqarul9naqvi;//User defined package..
/*  A package is used to group related classes Packages help in avoiding name conflicts..
There are 2 types of packages:-
1)Built in Packages ->Java API..
2)User defined Packages ->Custom packages..
*/
/*In command prompt/vs code command prompt to run java program
javac labpt_14_insertionsort.java //make byte code of the corresponding java program..
java labpt_14_insertionsort //run that java program..
javac -d . *.java//merge the package of the corresponding java files/programs..
javac -d . labpt_14_insertionsort.java//merge the package of labpt_14_insertionsort file..
javac -d abc *.java//merge the package of the corresponding java files/programs and put all files in the abc folder..
//if you place . instead of abc than package will be and no abc file will be created..
*/
/*
//Another program..
//how to import custom package..
import azan_naqvi.Matrix_Mul;
// import abc.azan_naqvi.Matrix_Mul;//if you create abc folder instead of . operater this package throws an error..
// import azan_naqvi.*;//Using * in the custom file throws an error..
// import abc.waqarul_naqvi.Del_Dub_Element;//if you create abc folder instead of . operater this package throws an error..
// import waqarul_naqvi.bye.kahallo.challo.ihi.*;//Using * in the custom file throws an error..
        import waqarul_naqvi.bye.kahallo.challo.ihi.Del_Dub_Element;
// import abc.waqarul_naqvi.*;

 public class using_package {
     public static void main(String[] args) {
         Matrix_Mul g =new Matrix_Mul();
         Del_Dub_Element sc =new Del_Dub_Element();
         System.out.println("I am using custom package..");

     }

 }
 */
