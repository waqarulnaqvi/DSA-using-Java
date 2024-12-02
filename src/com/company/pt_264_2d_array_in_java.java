import java.util.Scanner;

public class pt_264_2d_array_in_java {
    public static void main(String[] args) {
//        2D array in java
//        java is a 0 index based language

//        memory consumption =(rows*column)*data type.
        //Take a matrix as input from the user.Search for a given number x and print the indices(rows,column) at which it occurs.
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if(a[i][j]==3)
                {
                    System.out.println("3 found");
                    System.out.printf("At an index a[%d][%d]\n",i,j);
                    System.out.println();
                }

                
            }
            
        }
    }
//    19 18
}
