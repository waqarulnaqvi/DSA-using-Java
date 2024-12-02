//
//import java.io.File;
//        import java.io.FileWriter;
//        import java.io.IOException;
//        import java.util.ArrayList;
//        import java.util.HashSet;
//        import java.util.Scanner;
//        import java.util.regex.Pattern;
//
//class Student1 {
//    String name;
//    int rollnumber;
//    char grade;
//
//    Student1(String name, int rollnumber, char grade) {
//        this.name = name;
//        this.rollnumber = rollnumber;
//        this.grade = grade;
//    }
//}
//
//class Student_Management_System1 {
//    Scanner sc;
//    int num=0;
//
//    public Student_Management_System1(Scanner sc,int num)
//    {
//        this.sc=sc;
//        this.num=num;
//    }
//
//    public static boolean containsAlphabet(String input) {
//        // Regular expression to match alphabets
//        String regex = ".*[a-zA-Z].*";
//        return Pattern.matches(regex, input);
//    }
//    public ArrayList<Student> add_student() {
//        HashSet<Integer> hs = new HashSet<>();
////         obj=new Student[obj1.length+num];
//
//
//        ArrayList<Student> alist = null;
//        for (int i = 0; i < num; i++) {
//            System.out.println("\nRoll number :");
//            int rollnumber = sc.nextInt();
//            if (hs.contains(rollnumber)) {
//                System.out.println("Roll number must be unique\n");
//                i = i - 1;
//                continue;
//            }
//
//            System.out.println("Enter Student name:");
//            String name = sc.next();
//
////            Checking name contains letters or not
//            if (!containsAlphabet(name)) {
//                System.out.println("A name cannot be a number");
//                i = i - 1;
//                continue;
//            }
//
//            System.out.println("Enter Student Grade:");
//            char grade = sc.next().charAt(0);
//
////            Storing value in a hashmap:
//            hs.add(rollnumber);
//
////            Storing value in an object array:
//
//            alist = new ArrayList<>();
//            alist.add(new Student(name, rollnumber, grade));
//
//        }
//        return alist;
//    }
//    public void file_append_mode() {
//        File myFile = new File("pt_285_STUDENT_MANAGEMENT_SYSTEM");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file\n");
//            e.printStackTrace();
//        }
//    }
//    public void file_Write_Mood() {
//        try {
//
//            FileWriter filewrite = new FileWriter("pt_285_STUDENT_MANAGEMENT_SYSTEM");
//            filewrite.write("");
//            filewrite.close();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Unable to write in a file\n");
//        }
//    }
////    public Student[] remove_student()
////    {
////        System.out.println("Enter Student roll_number:");
////        int roll_num= sc.nextInt();
////        int flag=0;
////        for (int i = 0; i <num-1 ; i++) {
////            if(obj[i].rollnumber==roll_num || flag==1)
////            {
////                flag=1;
////                obj[i].rollnumber=obj[i+1].rollnumber;
////            }
////        }
////        if(flag==1 || num==1)
////        {
////            System.out.println("Student details successfully removed\n");
////            num--;
////        }
////        else {
////            System.out.println("Student doesn't exist\n");
////        }
////        return obj;
////    }
////    public void search_student()
////    {
////        System.out.println("Enter Student roll_number:");
////        int roll_num= sc.nextInt();
////        for (int i = 0; i <num ; i++) {
////            if(obj[i].rollnumber==roll_num)
////            {
////                System.out.printf("Roll number : %d\nStudent name : %s\nStudent grade : %c\n\n",obj[i].rollnumber,obj[i].name,obj[i].grade);
////                return;
////            }
////        }
////        System.out.println("Student Not found\n");
////    }
//
////    public void display()
////    {
////        System.out.println("Student Details:");
////        for (int i = 0; i <num ; i++) {
////
////            System.out.printf("Roll number : %d\nStudent name : %s\nStudent grade : %c\n\n",obj[i].rollnumber,obj[i].name,obj[i].grade);
////        }
////    }
////    String data = "This is the data in the output file";
//
////     try {
////        // Creates a Writer using FileWriter
////        FileWriter output = new FileWriter("output.txt");
////
////        // Writes string to the file
////        output.write(data);
////        System.out.println("Data is written to the file.");
////
////        // Closes the writer
////        output.close();
////    }
////     catch (Exception e) {
////        e.getStackTrace();
//}
//public class pt_289_TASK_5_STUDENTMANAGEMENTSYSTEM {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("WELCOME TO STUDENT_MANAGEMENT_SYSTEM Database");
//        System.out.println("How many students do you wish to add:");
//        int num=sc.nextInt();
//        Student_Management_System obj=new Student_Management_System(sc);
////        Student []obj1=null;
//        boolean run=true;
//        while (run) {
//            System.out.println("1 for add student\n2 for remove student\n3 for search student\n4 for display student details\nPRESS ANY OTHER KEY TO EXIT FROM THE DATABASE");
//            int n = sc.nextInt();
////            if(obj==null&& n!=1)
////            {
////                System.out.println("Store value in a database!!\n");
////                continue;
////            }
//            switch (n) {
//                case 1 -> {
//
//                    ArrayList<Student1> alist=obj.add_student();
//                    System.out.println(alist);
//                }
//                case 2 -> {
//                    obj.remove_student();
//
//                }
//                case 3 -> obj.search_student();
//                case 4 ->obj.display();
//                default -> {
//                    run=false;
//                    System.out.println("Exiting from the database!!");
//                }
//            }
//        }
//    }
//}
////2 14
////to 49