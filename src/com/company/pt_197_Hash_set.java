package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Hashing{

}
public class pt_197_Hash_set {
    public static void main(String[] args) {
//        Hashset in java is very important ds because of time efficiency.
//        It's insertion deletion and access the element time complexity is same. O(1)
//        Array - insetion O(1) ,Search/ Contains -O(n) Delete/Remove -O(n)
//        Sorted Array - insetion O(1) ,Search/ Contains -O(logn) Delete/Remove -O(n)
// 13 32 - 15 03
//        Bst - insetion O(h)O(n) ,Search/ Contains -O(h)O(n) or O(logn) Delete/Remove -O(h)O(n)

        HashSet <Integer> set =new HashSet<>();
//        ArrayList<Integer> set =new ArrayList<>();
//All function is almost same as ArrayList
//      Insert:
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
//      Search:
        System.out.println(set.contains(1));
        System.out.println(set.contains(6));

//        Delete
       if(!set.contains(1))
       {
      System.out.println("Does not contain 1");
       }
       else {
           System.out.println("Contain 1");
       }
        System.out.println("size of set is :"+set.size());
        set.remove(1);

        if(!set.contains(1))
        {
            System.out.println("Does not contain 1");
        }
        else {
            System.out.println("Contain 1");
        }

        System.out.println("size of set is :"+set.size());


//        Iterator
        Iterator it=set.iterator();
//        In starting iterator pointing to a null value.
//        hasNext funciton
//        Next function

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}