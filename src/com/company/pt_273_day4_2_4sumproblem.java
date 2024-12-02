package com.company;

import java.util.ArrayList;

public class pt_273_day4_2_4sumproblem {
    public static ArrayList<Integer> foursum(int [] a,int target)
    {
        ArrayList <Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        long sum = a[i] + a[j];
                        sum += a[k];
                        sum += a[l];
                        if (sum == target) {
                            arrayList.add(i);
                            arrayList.add(j);
                            arrayList.add(k);
                            arrayList.add(l);

                        }

                    }

                }

            }
        }
            return arrayList;
    }
    public static void main(String[] args) {

//        Brute force solution:

    //method 1: Time complexity: O(n4)
//        Space complexity: O(N){array list size}
        int a[]={1,0,-1,0,2,-2};
        int target=0;
ArrayList <Integer> arrayList=foursum(a,target);

int var=3;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("at index a["+arrayList.get(i)+"]");
            if(i==var)
          {
              System.out.println("Target "+target+" found!!\n");
              var+=4;
          }
        }

//        method 2:Time complexity: O(n4)
//        Space complexity: O(Numbers of quads) *2

    }
}
