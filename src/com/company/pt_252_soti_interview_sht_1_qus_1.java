import java.util.Scanner;

class Matrix{
    Scanner sc;
    int a[][];
    public Matrix(int m,int n,Scanner sc)
    {
        this.sc=sc;
        this.a=new int[m][n];
    }
    public int input_matrix()
    {
        int Number=0;
        System.out.println("Input Matrix:");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {

                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j]=sc.nextInt();

            if(a[i][j]!=0 && a[i][j]!=1)
            {
                System.out.println("Enter 0 or 1 only!!");
                j=j-1;
         }
                Number=Number*10+a[i][j];
//                System.out.println(Number);
       }
       }
        return Number;
    }

    public void display()
    {
        System.out.println("Matrix is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
public class pt_252_soti_interview_sht_1_qus_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        4 00 to 5 30

        Matrix m = new Matrix(2, 3, sc);
       int binary= m.input_matrix();
        int decimal=Integer.parseInt(String.valueOf(binary),2);
        System.out.printf("Binary Maximum number : %d and in decimal form: %d\n",binary,decimal);
        System.out.println("Therefore the required solution is :"+decimal%1000000007);

    }
}
