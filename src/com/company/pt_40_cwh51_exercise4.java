package com.company;
import java.util.Scanner;
class Library {
    public int n;
    public int k;
   public String[] a;
    public String[] b;
    Scanner sc = new Scanner(System.in);
    public void addBook() {
        System.err.println("How many book do you want to store in Library");
        n = sc.nextInt();
        a = new String[n];
        b = new String[a.length];
        int i,j;
        for ( i = 0; i < n; i++) {
            System.err.format("Enter %d book name : ", i + 1);
            a[i] = sc.next();
        }
        for ( i = 0; i < n; i++) {
            b[i]=a[i];
        }
    }
    public void issueBook() {
        System.err.println("How many book do you want to issue 2 or 1");
        int b= sc.nextInt();
        if(b==1) {
            System.err.println("Which book do you u want to issue:-");
            System.err.println("Available book is:-");
            for (int i = 0; i < n; i++) {
                System.err.format("%d book is : ", (i + 1));
                System.err.println(a[i]);
            }
            System.err.println("Press 1 for book 1 , Press 2 for book 2 and so on");
            int k = sc.nextInt();
            if(k>n){
                System.err.println("book not available in Waqaruls Library");}
            System.err.println("Now Available book is:-");
            for (int i = 0; i < n; i++) {
                System.err.format("%d book is : ", (i + 1));
                if (k - 1 == i) {
                    a[i] = null;
                }
                System.err.println(a[i]);
            }
        }
        else if (b==2) {
            System.err.println("Which book do you u want to issue:-");
            System.err.println("Available book is:-");
            for (int i = 0; i < n; i++) {
                System.err.format("%d book is : ", (i + 1));
                System.err.println(a[i]);
            }
            System.err.println("Press 1 for book 1 , Press 2 for book 2 and so on");
            int k = sc.nextInt();
            if(k>n){
                System.err.println("book not available in Waqaruls Library");}
            System.err.println("Enter second book number");
          int  k1= sc.nextInt();
            if(k1>n){
                System.err.println("book not available in Waqaruls Library");}
            System.err.println("Now Available book is:-");
            for (int i = 0; i < n; i++) {
                System.err.format("%d book is : ", (i + 1));
                if ((k - 1 == i) || (k1 - 1 == i)) {
                    a[i] = null;
                }
                System.err.println(a[i]);
            }
        }
        else {
            System.err.println("You can't take more then 2 books from waqaruls library");
        }
    }
    public void returnBook() {
        if (n != 0) {
            System.err.println("How many days you take books");
            int d = sc.nextInt();
            if (d >= 0 && d < 16) {
                System.err.println("NO FINE");
            } else if (d >= 16 && d < 31) {
                System.err.println("200 rupees Fine");
                System.err.println("Enter the fine Money:");
                int f = sc.nextInt();
                if (f > 200) {
                    System.err.println("You give us more fine take your " + (f - 200) + " Rupees Sir");
                }
                if (f < 200) {
                    System.err.println("Enter the fine money 200 correctly:");
                    f = sc.nextInt();
                    if (f < 200) {
                        System.err.println("We forgive your fine:)");
                    } else
                        System.err.println("You give us more fine take your " + (f - 200) + " Rupees Sir");
                }
            } else {
                System.err.println("500 ruppes Fine");
                System.err.println("Enter the fine Money:");
                int f = sc.nextInt();
                if (f > 500) {
                    System.err.println("You give us more fine take your " + (f - 500) + " Rupees Sir");
                }
                if (f < 500) {
                    System.err.println("Enter the fine money 500 correctly:");
                    f = sc.nextInt();
                    if (f < 500) {
                        System.err.println("BIKHARI JA MAAF KIYA TU BHI KYA YAAD KAREGA");
                    } else
                        System.err.println("You give us more fine take your " + (f - 500) + " Rupees Sir");
                }
            }
            System.err.println("Now Available Books is:-");
            for (int i = 0; i < n; i++) {
                System.err.format(" %d book is : ", (i + 1));
                if (a[i] == null) {
                    a[i] = b[i];
                }
                System.err.println(a[i]);
            }
            System.err.println("THANKS FOR TAKING BOOK IN WAQARULS LIBRARY");
        } else {
            System.err.println("You didn't issue any book from waqarul library:");
        }
    }
    public void showAvailableBook() {
        System.err.println("Available book is:-");
        for (int i = 0; i < n; i++) {
            System.err.format("%d book is : ",(i + 1));
            System.err.println(a[i]);
        }
    }
}
    public class pt_40_cwh51_exercise4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Library ob = new Library();
            System.err.println("Welcome to Syed Waqarul home Library");
            System.err.print("Enter your details:-\n name:-");
            String name = sc.nextLine();
            System.err.print("phone Number:-");
            double n = sc.nextFloat();
            System.err.println("HOW MANY TIMES DO YOU WANT THIS LOOP WILL EXECUTE:");
            int n1=sc.nextInt();
            for (int i = 0; i < n1; i++) {
                System.err.println(" press 1 for addbook \n press 2 for issuebookpress  \n press 3 for returnbookpress  \n press 4 for showAvailableBook");
                int k = sc.nextInt();
                switch (k) {
                    case 1 -> ob.addBook();
                    case 2 -> ob.issueBook();
                    case 3 -> ob.returnBook();
                    case 4 -> ob.showAvailableBook();
                    default -> System.err.println("Wrong Choice");
                }
            }
        }
    }