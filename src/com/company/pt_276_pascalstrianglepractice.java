import java.util.ArrayList;
import java.util.List;

public class pt_276_pascalstrianglepractice {
    public static long nCr(int n,int r){
        long res=1;
        for (int i = 0; i <r ; i++) {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void pascalTriangle(int n)
    {
//      Approach 1:
//        for (int r = 1; r <=n; r++) {
//            System.out.print(nCr(n-1,r-1)+" ");
//        }

//       Approach 2:
        for (int i = 0; i <n ; i++) {
            System.out.print(nCr(n-1,i)+"  ");

        }
        System.out.println();
    }

//  Method :1
    public static void completepascalstriangle(int n)
    {

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i,j)+" ");

            }
            System.out.println();
        }

    }
//    Method :2
    public static List<List<Integer>> completepascaltriangle(int n)
    {
        List<List<Integer>> arlist=new ArrayList<>();
//        List<Integer>ar =new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            List<Integer>ar =new ArrayList<>();//Temporary arraylist
            for (int j = 0; j <=i ; j++) {
                ar.add((int)nCr(i,j));
            }
//            System.out.println(ar);
            arlist.add(ar);
//            System.out.println(arlist);
        }
        return arlist;
    }

//    Optimised solution
//    Variant 2
    public static void pascaltriangle1(int n)
    {
        int res=1;
        System.out.print(res+"  ");
        for (int i = 1; i < n; i++) {
            res=(n-i)*res;
            res=res/i;
            System.out.print(res +"  ");
        }
        System.out.println();
    }
    //    Variant 3
    public static List<Integer> generaterow(int n)
    {
        List<Integer> ar=new ArrayList<>();
        int res=1;
     ar.add(res);
        for (int i = 1; i < n; i++) {
            res=(n-i)*res;
            res=res/i;
      ar.add(res);
        }
     return ar;
    }

    public static List<List<Integer>> pascalsTriangle(int n)
    {
        List<List<Integer>> mainlst=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            mainlst.add(generaterow(i));
        }
        return mainlst;
    }

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
//variant 1:
//        System.out.println(nCr(6,2));

//Variant 2:
//        pascalTriangle(3);

//Variant 3
// Method:1
//        completepascalstriangle(5);
//        System.out.println(completepascaltriangle(5));

// Method:2
//List<List<Integer>> arlist=completepascaltriangle(5);
//        for (List<Integer> ar: arlist) {
//            for (int ele: ar) {
//                System.out.print(ele+"  ");
//
//            }
//            System.out.println();
//
//        }
//

//        Optimised solution:
//        Variant 2:
//        pascaltriangle1(3);

//        Variant 3:
//        System.out.println(generaterow(5));
        List<List<Integer>> alist=pascalsTriangle(5);
        for(List<Integer> arl:alist)
        {
            for (int ele:arl)
            {
                System.out.print(ele+"  ");
            }
            System.out.println();
        }


//        11 20 to 12

    }
}
