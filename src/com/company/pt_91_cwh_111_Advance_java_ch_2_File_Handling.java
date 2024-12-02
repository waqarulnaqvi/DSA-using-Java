package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pt_91_cwh_111_Advance_java_ch_2_File_Handling {
    public static void main(String[] args) throws IOException {//Method 1 to throws an exception
     /*
        //Code to create a new file..
        File myFile = new File("cwh111_file.txt");

//        myFile.createNewFile();//If i comment the Method 1 throw an Compile time Exception..

        //Method 2:catch an exception with try catch..
        try {
            myFile.createNewFile();//If i comment the Method 1 //run.. does not throw an Compile time Exception..
        } catch (IOException e) {
            System.out.println("Unable to create this file");
//            throw new RuntimeException(e);//Same..Use Anyone..
        e.printStackTrace();//Same..Use Anyone..
        }
*/

/*
        //Code to Write to a file
       //Method 2:catch an exception with try catch..
        try {
            FileWriter fileWriter = new FileWriter("cwh111_file.txt");//If i comment the Method 1 //run.. does not throw an Compile time Exception..
            fileWriter.write("This is our first file from this java course\n Okay now bye hehe..");
            fileWriter.close();//it is a good practice.. file ko use karne ke baad close kar dena..
        } catch (IOException e) {
//            throw new RuntimeException(e);//Same..Use Anyone..
            e.printStackTrace();//Same..Use Anyone..
        }
        FileWriter fileWriter = new FileWriter("cwh111file.txt");//If i comment the Method 1 //run.. does not throw an Compile time Exception..
        fileWriter.write("This is our first file from this java course\n Okay now bye hehe..");
        fileWriter.close();//it is a good practice.. file ko use karne ke baad close kar dena..
 */

        /*
        //Reading a file
        //Method 2:catch an exception with try catch..
        File myFile = new File("cwh111_file.txt");
        try {
            Scanner sc=new Scanner(myFile);//If i comment the Method 1 //run.. does not throw an Compile time
            // Exception..
         while (sc.hasNext())//hrr word next line me print hoga..
         {
             String line = sc.next();
             System.out.println(line);//hrr word next line me print hoga..
         }
         sc.close();//it is a good practice.. file ko use karne ke baad close kar dena..
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println('\n');
        File myFile1 = new File("this.txt");
        Scanner sc=new Scanner(myFile1);
        while (sc.hasNextLine())//Next line se hrr sentence next line me print hoga..
        {
            String line = sc.nextLine();
            System.out.println(line);//Next line se hrr sentence next line me print hoga..
        }
        sc.close();//it is a good practice.. file ko use karne ke baad close kar dena..
         */

        //Deleting a file
//        File myFile = new File("hi.java");this method can't able to access,read,write and,delete a java file
        File myFile = new File("hi.txt");
        if(myFile.delete())
        {
            System.out.println("I have deleted: "+myFile.getName());
        }
        else {
            System.out.println("Some problem Occured While deleting the file..");
        }
    }
}
