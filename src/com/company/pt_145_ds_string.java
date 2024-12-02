package com.company;

public class pt_145_ds_string {
    public static void main(String[] args) {
        String s1="Data";
        String s2="base";
        s1=s1+s2;//s1 reference will be changed but s1 won't modify..
        System.out.println(s1);
        String nonTrimmedString = "     waqarul  hasan naqvi    ";
        nonTrimmedString=nonTrimmedString.trim();
        System.out.println(nonTrimmedString);
    }
}
