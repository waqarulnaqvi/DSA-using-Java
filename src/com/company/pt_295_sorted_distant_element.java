package com.company;

import java.util.Arrays;

public class pt_295_sorted_distant_element {
    public static void main(String[] args) {
        int[]arr ={40,10,20,10,30};
        int []sorted= Arrays.stream(arr).toArray();
        for (int i : sorted)
        {
            System.out.print(" "+i);
        }
        System.out.println("\n");
        int []sorted2=Arrays.stream(arr).distinct().toArray();
        for (int i : sorted2)
        {
            System.out.print(" "+i);
        }
        System.out.println("\n");
        int []sorted3=Arrays.stream(arr).distinct().sorted().toArray();
        for (int i : sorted3)
        {
            System.out.print(" "+i);
        }
        System.out.println("\n");



    }
}
