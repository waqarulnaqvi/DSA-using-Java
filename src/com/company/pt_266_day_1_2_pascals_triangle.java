import java.util.ArrayList;
import java.util.List;

public class pt_266_day_1_2_pascals_triangle {
//
    public static long nCr(int n,int r)
    {
        long res=1;
        for (int i = 0; i < r; i++) {
    res*=(n-i);
    res=res/(1+i);
        }
        return res;
    }

    public static void pascalTriangle(int n)
    {
        for (int r = 1; r <=n; r++) {
            System.out.print(nCr(n-1,r-1)+" ");
        }
        System.out.println();
    }
    public static void completepascalstriangle(int n)
    {

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i,j)+" ");

            }
            System.out.println();
        }

    }

//    Optimal Solution(variant 2):
    public static void pascalTriangle1(int n)
    {
        long ans =1;
        System.out.print (ans+" ");
        for (int i = 1; i <n ; i++) {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }

        System.out.println();
    }

    //Optimal Solution(variant 3);
    public static List<Integer> generaterrow(int row)
    {
        long ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        for (int i = 1; i <row ; i++) {
            ans=ans* (row-i);
            ans=ans/i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pastri(int n)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for (int row=1;row<=n;row++) {
            ans.add(generaterrow(row));
        }
        return ans;
    }

    public static List<List<Integer>> pascalTriangle3(int n)
    {
        List<List<Integer>> ans=new ArrayList<>();//Storing the Arraylist inside a list.\

        for (int row = 1; row <=n ;row++) {
            List<Integer> templst=new ArrayList<>(); //temporary list
            for (int column = 1; column <= row; column++) {
                templst.add((int) nCr(row-1,column-1));
            }
            ans.add(templst);
        }
return ans;

    }
//    4 11
    public static void main(String[] args) {



////     k-1
////       C
////         c-1

        /*
//        Pascal's Triangle:
           1
          1  1
        1  2   1
      1   3  3   1
    1  4   6   4   1
  1  5   10  10  5   1
         */

//Naive Approach:
//Variant 1:
//        long result=nCr(5,4);
//        System.out.println(result);

//Variant 2:
//        pascalTriangle(6);

//Variant 3:
//        completepascalstriangle(5);
//int n=6;
//List<List<Integer>> ans=pascalTriangle3(n);
//        System.out.println(ans);
//for(List<Integer> it :ans){
//    for(int ele:it)
//    {
//        System.out.print(ele+ " ");
//    }
//    System.out.println();
//}



//        Optimal solution:
//        Variant 2:
        pascalTriangle1(4);

//        Variant 3:
//        int n=6;
//        List<List<Integer>> ans=pastri(n);
////List<List<Integer>> ans=pascalTriangle3(n);
////        System.out.println(ans);
//        for(List<Integer> it :ans){
//            for(int ele:it)
//            {
//                System.out.print(ele+ " ");
//            }
//            System.out.println();
//        }

//        18 58
    }
}
