package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pt_1_Bufferfirstpro {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a number:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(n);

    }
}
