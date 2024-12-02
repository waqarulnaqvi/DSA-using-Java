////Apna school channel Arraylist video help can be taken to make this program..
//package com.company;
//import java.util.ArrayList;
//import java.util.Collections;
////import java.util.*;//don't use it when you are using professional program because it increase the size of the program by importing unused packages which is not a good practice..
//
//public class ds_java_pt_1_array_list {
//    public static void main(String[] args) {
//        ArrayList<Integer> list =new ArrayList<Integer>();
//        ArrayList<Integer> list3 =new ArrayList<Integer>();
//        ArrayList<String> list1 =new ArrayList<String>();
//        ArrayList<Boolean> list2 =new ArrayList<Boolean>();
//
//        //add elements
//        list.add(0);
//        list.add(2);
//        list.add(44);
//
//        list3.add(0);
//        list3.add(2);
//        list3.add(44);
//        System.out.println(list);
//
//        //get elements
//        int k=list.get(0);
//        System.out.println(k);
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//
//        //add el in between
//        list.add(1,12323);
//        System.out.println(list);
//
//        //set element
//        list.set(0,5);//0 index ke element ko hum kar denge 5..
//        System.out.println(list);
//
//        //delete element
//        list.remove(0);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//
//        //size
//        int size=list.size();
//        System.out.println(size);
//
//        //loops and addAll
//        list.addAll(list3);
//        list.addAll(0,list3);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+"\t");
//        }
//        System.out.println();
//
//        //sorting
//        Collections.sort(list);//collection framework ke jitte bhi function hai
//        //like arraylist,maps and sets etc inko sort karne ke liye hum collections.sort function ka use karte hai..
//        System.out.println(list);
//    }
//}