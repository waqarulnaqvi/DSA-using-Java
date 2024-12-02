package com.company;
import java.util.*;
public class pt_73_cwh_92_Advance_java_ch1_ArrayList_vs_LinkList_quick_quiz_9 {
    public static void main(String[] args) {
//Array biggest feature is a faster access of element it's speed..
   //Inserting/Deleting a value anywhere in the list from top to bottom is a biggest feature of linklist..
//Array list and linklist both have almost similar method..
    //arraylist uses array..
        //linklist uses independent object..
        // linklist implement from queue or dequeue interface whereas arraylist implement from abstractlist or abstract collection interface..
        LinkedList<Integer> l1 =new LinkedList<>();//ArrayList is a modified array..
        LinkedList<Integer> l2 =new LinkedList<>();//ArrayList is a modified array..
        //Linklist does not have initial capacity constructor..
        System.out.println(l2);//Empty l2 set..
        l1.addLast(111111224);//special method only is in the linklist not in the array list..
        l1.addFirst(7946);//special method only is in the linklist not in the array list..
        l1.addLast(115454224);//special method only is in the linklist not in the array list..
        l1.addFirst(454541112);//special method only is in the linklist not in the array list..
        System.out.println("Size of Arraylist l1 : "+l1.size());
        System.out.println("Size of Arraylist l2 : "+l2.size());
        //ArrayList does have initial capacity constructor..
//        System.out.println(l2.get(0));//Error because no element in the array list..
        //add function adding element in the last index of the array..
        l1.add(6);
        l1.add(5);
        l1.add(5);
        l1.add(0,7);
        l1.add(0,6);
        l1.add(4);

        l2.add(46);
        System.out.println("Size of Arraylist l1 : "+l1.size());
        System.out.println("Size of Arraylist l2 : "+l2.size());
        l2.add(34);
        l2.add(432);
        l2.add(422);
        l1.addLast(333333224);//special method only is in the linklist not in the array list..
        System.out.println("Size of Arraylist l1 : "+l1.size());
        System.out.println("Size of Arraylist l2 : "+l2.size());
        l2.add(412);
        l2.add(842);
        l2.add(8423);

//    l1.addAll(0,l2);//l2 whole list can be concatinated from the starting 0 index of the list l1..
        l1.addAll(1,l2);//l2 whole list can be concatinated from the starting 1 index of the list l1..
        l1.addAll(l2);//l2 whole list can be or appended(concatinated from the end of the list l1)..
//end me list ko add karne ko append bolte hai..


//        System.out.println(l1.contains(43));//false not in the array list..
//        System.out.println(l1.contains(42));//true it is in the array list..
//        l1.clear();//Removes all of the elements from this list..//Now l1 size() will be 0..
//        System.out.println(l1.indexOf(424));//-1 when index not exists..
//        System.out.println(l1.indexOf(6));//0 yeah is element ki first index batayega..
//        System.out.println(l1.indexOf(5));//5 yeah is element ki first index batayega..
//         System.out.println(l1.lastIndexOf(424));//-1 when index not exists..
//        System.out.println(l1.lastIndexOf(6));//5 yeah is element ki last index batayega..
//        System.out.println(l1.lastIndexOf(5));//7 yeah is element ki last index batayega..
        System.out.println("Size of Arraylist l2 : "+l2.size());
        System.out.println("Size of Arraylist l1: "+l1.size());
        l1.addLast(244424);//special method only is in the linklist not in the array list..

        System.out.println("Array list:");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+"\t");
        }

        //quick_quiz_8: write 2 extra method which was not taught by cwh in cwh_91:
        //I write get() &,isEmpty() methods..
        System.out.println("\nIndex 2 contain : "+l1.get(2));//Returns the element at the specified position in this list..
        System.out.println(l1.isEmpty());//false.. when list is empty return true else false..
        System.out.println(l1);
        System.out.println(l2);

        //quick_quiz_9: write 2 extra method which was not taught by cwh in cwh_92:
        //I write removeFirst() &,removeLast() methods..
        l1.removeFirst();//Removes and returns the first element from the list..
        l1.removeFirst();//Removes and returns the first element from the list..
        l1.removeLast();//Removes and returns the last element from the list..
        l1.removeLast();//Removes and returns the last element from the list..

        System.out.println(l1);
        System.out.println(l2);
        System.out.println("\nAnother Array list:");
        l1.set(2,472);//remove 34 and write 472 instead of it..
//        l1.set(25,72);//Error :Index out of bound..
        l1.set(4,72);//remove 7 and write 472 instead of it..

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+"\t");
        }

        //quick_quiz_8: write 2 extra method which was not taught by cwh in cwh_91:
        //I write get() &,isEmpty() methods..
        System.out.println("\nIndex 2 contain : "+l1.get(2));//Returns the element at the specified position in this list..
        l1.clear();
//        System.out.println(l1.get(2));//Error because no element in the array list..
        System.out.println(l1.isEmpty());//true..//when list is empty return true else false..

    }
}
