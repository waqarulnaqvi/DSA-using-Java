package com.company;
//variable name is a camel case convention in java,c etc..
public class pt_11_cwh14stringmethodsinjava {
//Note :String is case sensitive in java.
    public static void main(String[] args) {
      //  String a1=new String("waqarul");

        String name = "  WaqaRul  ";
        //Original String is immutable it can not be changed..
//        System.out.println(name);
//        Method 1:
//        System.out.println(name.length());
//        Method 2:
//        int value =name.length();
//        System.out.println(value);
     String n=new String("Azaan Naqvi");
//        int k=n.length();
//        System.out.println(k);

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//        System.out.println(n.toLowerCase());

//        String ustring = name.toUpperCase();//Original string reference ab new string pe point karega..
//        System.out.println(ustring);
//        System.out.println(n.toUpperCase());
////
       String nonTrimmedString = "     waqarul  hasan naqvi    ";
//                System.out.println(.trim());
        String kk=nonTrimmedString;
////        System.out.println(kk.nonTrimmedString);
////        System.out.println(kk+nonTrimmedString);
//        System.out.println(nonTrimmedString);//Original String..
//        System.out.println(nonTrimmedString.trim());//Trimming the String..
//        System.out.println(kk.trim());//Trimming the reference of Original String..
//        System.out.println(nonTrimmedString());//Error..

//
//   String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(nonTrimmedString.substring(-3));//-Error
//        System.out.println(nonTrimmedString.substring(19));//-Error
//        System.out.println(name.substring(5));
//        System.out.println(name.substring(0));//Substring 0 call is redundant because you are just printing the original String..
//        System.out.println(name.substring(1));//Substring 1 call is not redundant..
//        System.out.println(name.substring(0,41));//Error..
//        System.out.println(name.substring(0,4));
//        System.out.println(name.substring(2,6));
//        System.out.println(name.substring(0,4)+name.substring(1,6));
//        System.out.println(name.substring(0,4)+name.substring(2,6));
        //Start index is included but end index is excluded, end-1 is included..

//        System.out.println(name.replace("a","Azan Naqvi"));
//        System.out.println(name.replace('R','g'));
//        System.out.println(name.replace("R","g"));
//        System.out.println(name.replace("a", "rtrtytrhg"));
//        System.out.println(name.replace("r", "ier"));

//        The character should be either lower case or upper case same as main string otherwise startsWith and endsWith return false.
       //startsWith,endsWith Boolean return karta hai true ya false..
//        System.out.println(name.startsWith("Har"));
//        System.out.println(name.startsWith("  W"));
//        System.out.println(name.startsWith("  w"));
//        System.out.println(name.startsWith(" W"));
//        System.out.println(name.endsWith("dd"));
//        System.out.println(name.endsWith("l  "));
//        System.out.println(name.endsWith("l "));
//        System.out.println(name.endsWith("L "));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(7));

        String modifiedName = "Waqkrrrarrrlrl";
        //Index of aage se khojta hua chalta hai but last index of peeche se khojta hua chalta hai..
//        System.out.println(modifiedName.indexOf("a7678678"));//-1 return when substring does not exists//when index not found..
        System.out.println("Index of :"+modifiedName.indexOf("aqk"));
        System.out.println("Index of 2 :"+modifiedName.indexOf("azr"));
//        System.out.println(modifiedName.indexOf("rrr"));
//        System.out.println(modifiedName.indexOf("a", 10));
//        System.out.println(modifiedName.indexOf("l", -200));//Run properly
//        System.out.println(modifiedName.indexOf("l", 200));//-1 return when substring does not exists//when index not found..
//        System.out.println(modifiedName.indexOf("l", 3));
//        System.out.println(modifiedName.indexOf("l", 12));
        //Index of aage se khojta hua chalta hai but last index of peeche se khojta hua chalta hai..
//       System.out.println(modifiedName.lastIndexOf("krrra"));
//       System.out.println(modifiedName.lastIndexOf("a"));
//       System.out.println(modifiedName.lastIndexOf("rl", 400));//Run properly
//       System.out.println(modifiedName.lastIndexOf("rl", 11));//Run properly
//       System.out.println(modifiedName.lastIndexOf("rl",-400)); //-1 return when substring does not exists//when index not found..

        //koi bhi do string ko agar aapko match karna hai ki inki value same hai ki ni to hamesha .equals operator ka use karre equalsto operator ka na use karre by cwh(code with harry)..
//        System.out.println(name.equals("Waqarul"));
//        System.out.println(name.equals("  WaqaRul  "));
//        System.out.println(name.equals("  waqaRul  "));
        //String is case sensitive in java..
//      String str=name.equalsIgnoreCase("  WAQARUL  ");// this code is wrong because equalsIgnoreCase return booolean..
//      boolean str=name.equalsIgnoreCase("  WAQARUL  ");
//        System.out.println(str+" correct");
//       System.out.println(name.equalsIgnoreCase("waqarul"));
//    System.out.println(name.equalsIgnoreCase(" wAQARUL  "));//equals amd equalsIgnore Case do include spaces..
//    System.out.println(name.equalsIgnoreCase("  wAQARUL  "));//equals amd equalsIgnore Case do include spaces..
//     Escape Sequence Character for more details about it search on google "java oracle escape sequences"..
        System.out.println("hel\"lo\b i\tam\"");
        System.out.println("I am escape sequence\tdouble quote");
        System.out.println("Syed\fWaqarul\"hasan\\\\Naqvi\'");
        System.out.println("\ran\rNaq\rvi");
        String n1=new String("hiiii");
        System.out.println("String is "+n1);
      //\f :-give special character
    //\b;-remove last one letter
//  \r:-remove all from where it applied
}
}