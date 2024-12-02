//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//class Student {
//    String name;
//    int rollnumber;
//    char grade;
//
//    Student(String name, int rollnumber, char grade) {
//        this.name = name;
//        this.rollnumber = rollnumber;
//        this.grade = grade;
//    }
//}
//class Student_Management_System {
//    Scanner sc;
//    int limit = 0;
//    Student obj[];
//    HashSet<Integer> hs;
//
//    public Student_Management_System(Scanner sc) {
//        this.sc = sc;
//        this.obj = new Student[100];
//        this.hs = new HashSet<>();
//    }
//
//    public static boolean containsAlphabet(String input) {
//        // Regular expression to match alphabets
//        String regex = ".*[a-zA-Z].*";
//        return Pattern.matches(regex, input);
//    }
//
//    public int add_student(int num) {
//        for (int i = limit; i < limit + num; i++) {
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
//            System.out.println("Enter Student Grade:");
//            char grade = sc.next().charAt(0);
//
////            Storing value in a hashmap:
//            hs.add(rollnumber);
//
////            Storing value in an object array:
//            obj[i] = new Student(name, rollnumber, grade);
//        }
//        limit+=num;
//        Storing_value_in_file(obj,limit);
//        return limit;
//    }
//
//
//    public int remove_student() {
//
//        if (limit==1) {
//            System.out.println("Student details successfully removed\n");
//            limit--;
//            hs.remove(obj[0].rollnumber);
//            Storing_value_in_file(obj,limit);
//            return limit;
//        }
//        System.out.println("Enter Student roll_number:");
//        int roll_num = sc.nextInt();
//        hs.remove(roll_num);
//        int flag = 0;
//        for (int i = 0; i < limit; i++) {
//            if (obj[i].rollnumber == roll_num || flag == 1) {
//                flag = 1;
//               if( i==limit-1)
//                {
//                    System.out.println("Student details successfully removed\n");
//                    limit--;
//                    Storing_value_in_file(obj,limit);
//                    return limit;
//                }
//
//                obj[i].rollnumber = obj[i + 1].rollnumber;
//            }
//        }
//        if(flag==1){
//            System.out.println("Student details successfully removed\n");
//            limit--;
//            Storing_value_in_file(obj,limit);
//        }
//        else {
//            System.out.println("Student doesn't exist\n");
//        }
//        return limit;
//    }
//
//    public void search_student() {
//        System.out.println("Enter Student roll_number:");
//        int roll_num = sc.nextInt();
//        for (int i = 0; i < limit; i++) {
//            if (obj[i].rollnumber == roll_num) {
//                System.out.printf("Roll number : %d\nStudent name : %s\nStudent grade : %c\n\n", obj[i].rollnumber, obj[i].name, obj[i].grade);
//                return;
//            }
//        }
//        System.out.println("Student Not found\n");
//    }
//
//    public void display() {
//        System.out.println("Student Details:\n");
//        for (int i = 0; i < limit; i++) {
//
//            System.out.printf("Roll number : %d\nStudent name : %s\nStudent grade : %c\n\n", obj[i].rollnumber, obj[i].name, obj[i].grade);
//        }
//    }
//
///*DATABASE*/
////Storing values in a file
//    public void Storing_value_in_file(Student []obj,int limit) {
//        File myFile = new File("pt_285_STUDENT_MANAGEMENT_SYSTEM.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file\n");
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter filewrite = new FileWriter("pt_285_STUDENT_MANAGEMENT_SYSTEM.txt");
//            filewrite.write("Student Details:\n");
//            for (int i = 0; i <limit ; i++) {
//                filewrite.write("\nRoll number :"+obj[i].rollnumber+ "\nStudent name :" +obj[i].name+"\nStudent grade :"+ obj[i].grade+"\n");
//            }
//
//            filewrite.close();
//        } catch (Exception e) {
//            System.out.println("Unable to write in a file\n");
//        }
//    }
//
////    Deleting a File
//    public  void Deleting_file()
//    {
//        File myfile = new File("pt_285_STUDENT_MANAGEMENT_SYSTEM.txt");
//
//        if(myfile.delete())
//        {
//            System.out.println("I have deleted: "+myfile.getName()+"\n");
//        }
//        else {
//            System.out.println("file not found!!\n");
//        }
//    }
//
//
//    //Reading a File
//    public void Reading_a_file()
//    {
//        File myfile=new File("pt_285_STUDENT_MANAGEMENT_SYSTEM.txt") ;
//        try{
//            Scanner sc = new Scanner(myfile);
//            while (sc.hasNextLine())
//            {
//                String line =sc.nextLine();
//                System.out.println(line);
//            }
//            System.out.println();
//            sc.close();
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println("file not found!!\n");
////            e.printStackTrace();
//        }
//    }
//}
//public class pt_285_STUDENTMANAGEMENTSYSTEM {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//        System.out.println("WELCOME TO STUDENT_MANAGEMENT_SYSTEM Database");
//        Student_Management_System obj=new Student_Management_System(sc);
//        boolean run=true;
//        while (run) {
//            System.out.println("1 for add student\n2 for remove student\n3 for search student\n4 for display student details\n5 for reading file\n6 for deleting file\nPRESS ANY OTHER KEY TO EXIT FROM THE DATABASE");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//                    System.out.println("You cannot store more than 100 students in a database");
//                    System.out.println("Enter number of Students you want to store in a database:");
//                    int num=sc.nextInt();
//                    System.out.println("Database limit left : "+(100-obj.add_student(num))+"\n");
//                }
//                case 2 ->    System.out.println("Database limit left : "+(100-obj.remove_student()));
//                case 3 -> obj.search_student();
//                case 4 ->obj.display();
//                case 5 ->obj.Reading_a_file();
//                case 6 ->obj.Deleting_file();
//                default -> {
//                    run=false;
//                    System.out.println("Exiting from the database!!");
//                }
//            }
//        }
//    }
//}
