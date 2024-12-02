package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class pt_74_cwh_93_Advance_java_ch_1_Array_Dequeue {
    public static void main(String[] args) {
        //array dequeue me humlog first index se or last index se  insertion or deletion dono kar sakte hai..
        //array dequeue built internally array and it automatically resize the array internally when you are inserting or deletion element from first index or last index..
        //queue uses fifo technique..
        //arraydequeue implement dequeue interface..
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();//ArrayList is a modified array..
        //add function adding element in the last index of the array..
        ad1.add(34);
        ad1.add(33);
        ad1.addLast(419);
        ad1.add(36);
        ad1.add(36);
//        ad1.addLast(420);
        ad1.addFirst(22);
        //arraylist me jo jo cheeze kar sakte hai,arraydequeue me bhi wo wo cheeze kar sakte hai..
        System.out.println(ad1);//complete arraydequeue list..
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getClass());
    }

}
