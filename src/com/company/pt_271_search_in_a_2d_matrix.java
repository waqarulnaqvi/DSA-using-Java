package com.company;

public class pt_271_search_in_a_2d_matrix {
//    Better Approach:
    public static boolean binarysearch(int a[],int target)
    {
        int low=0;
        int high=a.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==target)
            {
                return true;
            }
            else if(target>a[mid])
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int a[][],int target)
    {
        int m=a[0].length-1;
        for (int i = 0; i <a.length ; i++) {
            if(a[i][0]<=target && a[i][a[0].length-1]>=target)
            {
             return binarysearch(a[i],target);
            }
        }
        return false;
    }
    //Optimised Solution:
    public static boolean optimisedsearch(int a[][],int target)
    {
int n=a.length;
int m=a[0].length;

//apply binary search:
        int low=0,high=n*m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=mid/m;
            int column=mid%m;
            if (a[row][column]==target){
                return true;
            } else if (a[row][column]<target)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//  Standard Method(Brute force approach):
int mat[][]={{3,4,7,9},
          {12,13,16,18},
          {20,21,23,29}};

/*
for(int ele:mat[2])
{
    System.out.println(ele);
}


        for (int i = 0; i <mat[1].length ; i++) {
            System.out.println(mat[1][i]);
        }

 */

//int target=23;
//        for (int i = 0; i < mat.length ; i++) {
//            for (int j = 0; j <mat[i].length ; j++) {
//                if(target==mat[i][j])
//                {
//                    System.out.println("Found!!");
//                    break;
//                }
//            }
//        }

//Better approach:
        //(It is as good as O(N)) Time complexity :-O(n) +O(log2 m)(Time complexity of binary search).
//        boolean result=searchMatrix(mat,23);
////        System.out.println(result? "true" :"false");
//        System.out.println(result? "Element found!!" :"Element not found!!");
//17 48
// Optimal approach:
//Time Complexity:O(log2(nXm))
//Space Complexity:O(1)

        boolean result2=optimisedsearch(mat,23);
        System.out.println(result2 ? "Element exists!!" :"Element does not exists!!");
    }
}
