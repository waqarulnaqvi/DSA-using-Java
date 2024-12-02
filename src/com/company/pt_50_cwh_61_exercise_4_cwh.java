package com.company;

import java.util.Scanner;

class Library1{
    String[] books;
    int no_of_books=0;
    Library1()
    {
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book)
    {
        this.books[no_of_books] =book;
        no_of_books++;
//        System.out.println(book+" has been added!");
    }
    void showAvailableBooks()
    {
        System.out.println("Available Books are:");
        for (String book:this.books) {
            if(book==null)
            {
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book)
    {
        for (int i = 0; i <this.books.length ; i++) {
//            if(this.books[i].equals(book)){
            if(this.books[i]!=null) {
                if (this.books[i].equalsIgnoreCase(book)) {
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
        }
        System.out.println("This book does not have been exists");
    }
    void returnbook(String book)
    {
        addBook(book);
    }
}
public class pt_50_cwh_61_exercise_4_cwh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library1 CentralLibrary =new Library1();
        CentralLibrary.addBook("Think and grow rich");
        CentralLibrary.addBook("Algorithms");
        CentralLibrary.addBook("C++");
        CentralLibrary.showAvailableBooks();
        System.out.println("Enter book you want to issue:");
        String n=sc.nextLine();
        CentralLibrary.issueBook(n);
        CentralLibrary.showAvailableBooks();
        System.out.println("Enter Book that you want to return:");
        String returnb =sc.nextLine();
        CentralLibrary.returnbook(returnb);
        CentralLibrary.showAvailableBooks();

    }
}
