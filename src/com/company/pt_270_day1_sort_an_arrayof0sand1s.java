import java.util.ArrayList;
import java.util.Arrays;

public class pt_270_day1_sort_an_arrayof0sand1s {
    //    12 59
    public static void main(String[] args) {
        // Brute force approach:

        //Time complexity:o(N+N)
        //Space Complexity:O(1)
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 2, 0, 1, 1, 1, 0, 0, 0, 0, 1, 2}));
        for (int ele : ar) {
            System.out.print(ele + " ");
        }
        System.out.println();

        //System.out.println(ar);
        int a = 0, b = 0, c = 0;
        for (int ele : ar) {
            if (ele == 1) {
                a++;
            } else if (ele == 2) {
                b++;
            } else {
                c++;
            }
        }
//    15 30
        // System.out.println(a+b+c);
        System.out.println();
        for (int i = 0; i < c; i++) {
            ar.set(i, 0);
        }
        for (int i = c; i < a+c; i++) {
            ar.set(i, 1);
        }
        for (int i = a+c; i < a+b+c; i++) {
            ar.set(i, 2);
        }
//    for(int i=0;i<ar.size();i++)
//    {
//        if(c!=0)
//        {
//            ar.set(i,0);
//            c--;
//        }
//        else if(a!=0)
//        {
//            ar.set(i,1);
//            a--;
//        }
//        else if(b!=0)
//        {
//            ar.set(i,2);
//            b--;
//        }
//    }

            for (int ele : ar) {
                System.out.print(ele + " ");
            }


//Optimal Solution
//    Dutch National Flag Algorithm:
            //        Time complexity is O(N)
//        Space complexity is O(1)
//{0....low-1}-> 0 extreme left
// {low...mid-1} ->1
// {high+1 ,n-1} ->2  extreme right
/*
0     low-1 low   mid-1 mid    high      high+1   n-1

00000000  111111111     random(1,2,3)      222222222
 */
//    By using arraylist:
//    ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,0,1,2,1,2,0,0,0}));
//int low=0,mid=0,high=arrayList.size() -1;
//    System.out.println(arrayList);
//    while(mid<=high)
//    {
//        if(arrayList.get(mid)==0)
//        {
//int t=arrayList.get(low);
//          arrayList.set(low,arrayList.get(mid));
//          arrayList.set(mid,t);
//
//low++;
//mid++;
//        }
//        else if (arrayList.get(mid)==1) {
//mid++;
//        }
//        else {
//            int t=arrayList.get(mid);
//            arrayList.set(mid,arrayList.get(high));
//            arrayList.set(high,t);
//high--;
//        }
//
//    }
//    System.out.println(arrayList);
/*
//    By using array:
    int a[]={0,1,1,0,1,2,1,2,0,0,0};

    System.out.println("Original Array:");
    for(int ele:a)
    {
        System.out.print(ele+"  ");
    }
    System.out.println();
    int low=0,mid=0,high=a.length-1;
    while(mid<=high)
    {
        if(a[mid]==0)
        {
            int t=a[low];
            a[low]=a[mid];
            a[mid]=t;
            low++;
            mid++;
        }
        else if(a[mid]==2)
        {
            int t=a[mid];
            a[mid]=a[high];
            a[high]=t;
            high--;
        }
        else {
            mid++;
        }
    }
    System.out.println("Sorted Array:");
    for(int ele:a)
    {
        System.out.print(ele+"  ");
    }
    System.out.println();
*/
    }
}