/*Exercise 7:
Create a library management system which is capable of issuing books to the students.
Book should have info like:
1. Book name
2. Book Author
3. Issued to
4. Issued on
User should be able to add books, return issued books, issue books
Assume that all the users are registered with their names in the central database
 */
package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
class LibraryManagementSystem {
    int index = 0;
    int no_of_books = 6;
    ArrayList<String> l1 = new ArrayList<>();
    ArrayList<String> l2 = new ArrayList<>();
    LibraryManagementSystem() {
        l1.add(0,"Rich dad poor dad");
        l1.add(1,"\t-by robin sharma");
        l1.add(2,"Atomic Habits");
        l1.add(3,"\t-by ali zaffar");
        l1.add(4,"power of subconscious Mind");
        l1.add(5,"\t-by Murtaza Ali");
        l2.addAll(l1);
    }
    void addBook(String book, String author) {
            l1.add(book);
            l1.add("\t-by " + author);
            l2.add(book);
            l2.add("\t-by " + author);
        if(l1.size()==l2.size()) {
            System.out.println(l1.get(no_of_books) + "\n" + l1.get(no_of_books + 1) + "\n HAS BEEN ADDED!\n");
            no_of_books = no_of_books + 2;
        }
        else {
            System.out.println(l1.get(no_of_books-2) + "\n" + l1.get(no_of_books - 1) + "\n HAS BEEN ADDED!\n");
            no_of_books = no_of_books + 2;
        }
    }
    void showAvailableBook() {
        System.out.println("\nAvailable books are:-");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+"\n");
        }
        System.out.println();
    }
    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy h:m:s a");//h means 12 h & H means 24 H clock..
        String myDate = dt.format(df);
        if(l1.size()!=l2.size())
        {
            System.out.println("More than 1 book can't be issued first return the book!\n");
            return;
        }
        showAvailableBook();
        System.out.println("Enter book name:-");
        String book = sc.nextLine();
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i).equalsIgnoreCase(book)) {
                index = i;
                System.out.println( l1.get(index)+"\n"+l1.get(index+1)+"\nHAS BEEN SUCCESSFULLY ISSUED!");
                System.out.println("Issued to: WAQARUL NAQVI");
                System.out.println("Issued on:"+myDate);
                System.out.println("The book has been sent to you email Id!");
                l1.remove(l1.get(index));
                l1.remove(l1.get(index));
                showAvailableBook();
                return;
            }
        }
        System.out.println("Book name Mismatched!\n");
    }
    public void returnBook() {
        if(l2.size()==l1.size())
        {
            System.out.println("book has not been issued yet!\n");
            return;
        }
        for (int i = 0; i < l2.size(); i++) {
           if(l1.get(index)!=l2.get(index)) {
               l1.add(index, l2.get(index));
               l1.add((index + 1), l2.get(index + 1));
           }
        }
        System.out.println("The book has been returned succesfully!");
        showAvailableBook();
    }
}
public class pt_84_cwh_104_Exercise_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     LibraryManagementSystem ob =new LibraryManagementSystem();
        System.out.println("WELCOME TO SYED WAQARUL'S HOME LIBRARY");
        boolean loop=true;int k=0;
       while (loop){
            System.out.println(" press 1 for addbook \n press 2 for issuebookpress  \n press 3 for returnbookpress  \n press 4 for showAvailableBook \n press key for breaking the loop..");
            try {
              k = sc.nextInt();
            }
       catch (Exception e)
       {
           k=0;
           System.out.print("");
       }
            switch (k) {
                case 1 -> {
                    System.out.println("How many book do you want to store in Library:");
                    int n=0;
                    try {
                         n = sc.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println(e);
                        System.out.println("EXCEPTION OCCURED!");
                        System.out.println("BREAKING THE LOOP..");
                        loop = false;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.format(" book %d : ", i + 1);
                        String k1=sc.next();
                        System.out.println("Author name:");
                        String k2=sc.next();
                        ob.addBook(k1,k2);
                    }
                }
                case 2 -> ob.issueBook();
                case 3 -> ob.returnBook();
                case 4 -> ob.showAvailableBook();
                default -> {
                    loop = false;
                    System.out.println("BREAKING THE LOOP..");
                }
            }
        }
    }
}