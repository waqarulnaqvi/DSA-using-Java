//import java.util.*;//Error..
package com.company;
import java.util.*;//Run..
import java.util.*;//Run..
public class pt_162_linked_list_using_collection_framework {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<String>();
        list.addFirst("a");
       list.addFirst("is");
        System.out.println(list);

        list.addLast("this");
        list.add("list");//by default "list.add" adds elements in the last..
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)=="a")
            {
                System.out.println("Got it!");
            }
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        System.out.println(list);
        list.removeFirst();//delete first element from the list..
        System.out.println(list);
        list.removeLast();//delete last element from the list..
        System.out.println(list);

        list.add("hello");
        list.add("have a good day");
        list.remove(1);//removing 1st index from the list..
        System.out.println(list);
//       list.remove(7);//Error/Exception..(java.lang.IndexOutOfBoundsException: Index: 7, Size: 3)
    }
}
