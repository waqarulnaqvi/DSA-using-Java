package com.company;

import java.util.HashSet;

public class pt_76_cwh_95_Advance_java_ch1_hash_set_in_java {
    public static void main(String[] args) {
    HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
    myHashSet.add(4);
    myHashSet.add(14);
    myHashSet.add(45);
    myHashSet.add(46);
    myHashSet.add(48);
    myHashSet.add(49);
    myHashSet.add(50);
    myHashSet.add(51);
    myHashSet.add(52);
    myHashSet.add(4);
    myHashSet.add(45);
    myHashSet.add(3);
    System.out.println(myHashSet);
    }
}
