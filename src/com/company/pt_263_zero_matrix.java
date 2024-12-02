import java.util.ArrayList;
import java.util.Arrays;
// 6 39
public class pt_263_zero_matrix {

//Brute Force Approach:
    //public static void Markrow(int j,int [][]a)
//{
//    for (int i = 0; i <a.length ; i++) {
//        if(a[i][j]!=0)
//        {
//            a[i][j]=-1;
//        }
//
//    }
//}
//    public static void Markcolumn(int i,int [][]a)
//    {
//        for (int j = 0; j <a.length ; j++) {
//            if(a[i][j]!=0)
//            {
//                a[i][j]=-1;
//            }
//        }
//    }

//    Brute Force Approach:
//    Array list:
//    18 36
    public static void markRow(ArrayList<ArrayList<Integer>> matrix,int n,int i)
    {
        for (int j = 0; j <n ; j++) {
if (matrix.get(i).get(j)!=0)
{

    matrix.get(i).set(j,-1);

            }

        }
    }

    public static void markColumn(ArrayList<ArrayList<Integer>> matrix,int m,int i)
    {
        for (int j = 0; j <m ; j++) {
            if (matrix.get(i).get(j)!=0)
            {

                matrix.get(j).set(i,-1);

            }

        }
    }

    public static ArrayList<ArrayList<Integer>> operation(ArrayList<ArrayList<Integer>> Matrix,int n,int m)
    {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (Matrix.get(i).get(j) == 0) {
                    markRow(Matrix, n, i);
                    markColumn(Matrix, m, j);
                }
            }
        }
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    if (Matrix.get(i).get(j) == -1) {
Matrix.get(i).set(j,0);
                    }
                }

        }
        return Matrix;
    }

    public static ArrayList<ArrayList<Integer>> betteraproach(ArrayList<ArrayList<Integer>> Matrix,int n,int m)
    {
        int row[]=new int[n];
        int colmn[]=new int[m];
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j <m ; j++) {
                if(Matrix.get(i).get(j)==0)
                {
                    row[i]=1;
                    colmn[i]=1;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
         if(row[i]==1 || colmn[j]==1)
         {
             Matrix.get(i).set(j,0);
            }
        }
            }

        return Matrix;
    }
    public static void main(String[] args) {

//   16 6


//        int a[][]={{1,2,1},{1,2,1},{1,2,0}};
//        System.out.println("Current Matrix is:");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <a[0].length ; j++) {
//                System.out.print(a[i][j]+"  ");
//            }
//            System.out.println();
//        }

//Method:1
        //Brute Force technique:
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                if (a[i][j] == 0) {
//                    Markrow(j, a);
//                    Markcolumn(i, a);
//                }
////             Time complexity of brute force technique is :O(n^3) or O((n*m)*(n*m)+(n*m))
//
//            }
//        }
//        System.out.println("New Matrix 1 is:");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <a[0].length ; j++) {
//                System.out.print(a[i][j]+"  ");
//            }
//            System.out.println();
//        }
//
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a[0].length; j++) {
//                    if (a[i][j] == -1) {
//                        a[i][j] = 0;
//                    }
//                }
//            }

// Method:2
// Better Approach:

//        int[] row =new int[a.length];//m
//        int[] column =new int[a[0].length];//n*-
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                if (a[i][j] == 0) {
//                    row[i] = 1;
//                    column[j] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                if (row[i] == 1 || column[j] == 1) {
//                    a[i][j] = 0;
//                }
//            }
//        }
////TC -O(2*n*m) O(n2)
////SC -O(n)+O(m)

//Optimal Approach:
//
//        System.out.println("Final Matrix is :");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <a[0].length ; j++) {
//                System.out.print(a[i][j]+"  ");
//            }
//            System.out.println();
//        }


//        ArrayList Approach:
        ArrayList<ArrayList <Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,2,1)));

        System.out.println("Original Matrix:");
        for (ArrayList<Integer> row: matrix) {
            for (Integer ele:row) {
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
        System.out.println();

//        Method 1:Brute Force Approach
//        int n=matrix.size();
//        int m=matrix.get(0).size();
//        ArrayList<ArrayList<Integer>> ans=operation(matrix,n,m);

// Method 2:Better Approach
        int n=matrix.size();
        int m=matrix.get(1).size();

ArrayList<ArrayList<Integer>> ans=betteraproach(matrix,n,m);

        System.out.println("new Matrix:");
        for(ArrayList<Integer> row:ans)
        {
for(int ele:row)
{
    System.out.print(ele+"  ");
            }
            System.out.println();
            }
        }

    }

