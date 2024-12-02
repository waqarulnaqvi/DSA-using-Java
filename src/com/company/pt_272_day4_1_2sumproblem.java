import java.util.*;

//13 9
//14 39
public class pt_272_day4_1_2sumproblem {


    //Better approach
    public static String twosum(int arr[],int target)
    {
        HashMap <Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int moreneeded=target-arr[i];
            if(mpp.containsKey(moreneeded))
            {
                return "Yes";
            }
            mpp.put(arr[i],i);
        }
        return "No";
    }
    public static void twosum2(int arr[],int target)
    {
        HashMap <Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int moreneeded=target-arr[i];
            if(mpp.containsKey(moreneeded))
            {
                System.out.println("Found at index "+mpp.get(moreneeded) + " and "+i);
                break;
            }
            mpp.put(arr[i],i);
        }
    }

    public static int[] twosum1(int arr[],int target)
    {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        HashMap <Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int moreneeded=target-arr[i];
            if(mpp.containsKey(moreneeded))
            {
ans[0]=mpp.get(moreneeded);
ans[1]=i;
                return ans;
            }
            mpp.put(arr[i],i);
        }
        return ans;
    }





    //Optimal Solution:
    public static int[] twosumoptimalsolution(int [] arr,int target)
    {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        Arrays.sort(arr);
        int left=0,right= arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==target)
            {
                ans[0]=left;
                ans[1]=right;
                return ans;
            }
            else if(arr[left]+arr[right]<target)
            {
                left++;
            }
            else {
                right--;
            }
        }

        return ans;
    }





    public static void main(String[] args) {

        int a[]={2,6,5,11,8};
        int target=14;
//        for (int e:
//            a ) {
//            System.out.print(e+"  ");
//
//        }
//        System.out.println();
//       Arrays.sort(a);
//        for (int e:
//                a ) {
//            System.out.print(e+"  ");
//
//        }


        //Brute force problem:
//method 1:TC- O(N*N)
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if(i==j )
//                    continue;
//                if(a[i]+a[j]==target)
//                {
//                    System.out.println("Possible at index "+i+" and  "+j);
//                    break;
//                }
//            }
//        }

//method 2:TC- O(N*N) Its slightly better than N2 but still almost equal to the N2.
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//
//                if(a[i]+a[j]==target)
//                {
//                    System.out.println("Possible at index "+i+" and  "+j);
//                    break;
//                }
//            }
//
//        }



//  Better approach(Hashing):
//        Time complexity ->O(N * log N)
//        worst case ->O(N*N)
//        SC -> O(N)

////    String ans=twosum(a,target);
////        System.out.println("This is the answer for variant 1 :" +ans);

//    twosum2(a,target);

//        int[] ans=twosum1(a,target);
//        System.out.println("This is the answer for variant 2 : [" + ans[0]+ ","+ans[1]+"]");




//Optimal Solution:
//        Tc->O(N) +O(N Log N)
//       Sx->O(1)

        //No need to print the index because you destroy the index by sorting the array.

//                int[] ans=twosumoptimalsolution(a,target);
//        System.out.println("This is the answer for variant 2 : [" + ans[0]+ ","+ans[1]+"]");


    }
}
