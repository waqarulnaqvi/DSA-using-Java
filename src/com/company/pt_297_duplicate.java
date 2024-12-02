package com.company;

import java.util.ArrayList;

public class pt_297_duplicate {
    public static ArrayList<Integer> duplicates(int[] arr) {
    arr=new int[]{2,3,1,2,3};
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(list1.contains(arr[i]) )
            {
                list2.add(arr[i]);
            }
            else{

                list1.add(arr[i]);

            }



        }
        if(list2.isEmpty())
        {
            list2.add(-1);
        }
        return list2;

    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{0,3,1,2}));
    }
}
