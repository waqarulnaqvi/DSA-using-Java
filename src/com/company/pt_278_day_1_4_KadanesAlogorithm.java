import java.util.ArrayList;
import java.util.List;

public class pt_278_day_1_4_KadanesAlogorithm {
//    12 18
//    My Method:
    public static List<List<Integer>> subarrays(int arr[])
    {
        List<List<Integer>> main=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            List<Integer> templist=new ArrayList<>();

            for (int j = i; j <arr.length ; j++) {
                templist.add(arr[j]);
            }
            main.add(templist);
        }
        return main;
    }
    public static void main(String[] args) {
        int num[]={-2,-3,-4,-1,-2,1,5,-3};
//        My solution:
//        System.out.println(subarrays(num));
        System.out.println("Maximum possible subarrays are:");
        for (List<Integer> subarray:subarrays(num))
        {
            for (int ele:subarray )
            {
                System.out.print(ele+"  ");
            }
            System.out.println();
        }

//        Method:1
        int sum;
//        O (n3)
        int max=Integer.MIN_VALUE;
        System.out.println("Sum of all possible subarrays:");
        for (int i = 0; i <num.length ; i++) {
            sum=0;
            for (int j = i; j <num.length ; j++) {
  sum+=num[j];
//                System.out.println(num[j]);
//                for (int k = i; k <j ; k++) {
//                }
                ;
            }
            System.out.println("Array "+(i+1) +" :" +sum);
            max=Integer.max(sum,max);
        }

        System.out.println();
        System.out.println("Maximum sum of subarray is :"+max);
    }

}
