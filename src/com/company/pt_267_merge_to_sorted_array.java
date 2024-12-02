public class pt_267_merge_to_sorted_array {
    public static void main(String[] args) {


        /*Brute Force Technique:
        int a[]={1,3,5,7,10};
        int b[]={2,4,5,6,7,8,19,20};
        int []c=new int[a.length+b.length];
        int left=0,right=0,index=0;
        System.out.println("Array a :");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Array b :");
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        while (left<a.length&& right<b.length)
        {
            if(a[left]<=b[right])
            {
                c[index]=a[left];
                left++;
            }
            else {
                c[index]=b[right];
                right++;
            }
            index++;

        }

//        If right pointer reaches the end:
        while (left<a.length)
        {
            c[index++]=a[left++];
        }

//        If left pointer reaches the end:
        while (right<b.length)
        {
            c[index++]=b[right++];
        }

//        fill back the c to a and b
        for (int i = 0; i <a.length+b.length ; i++) {
            if (i < a.length) {
                a[i] = c[i];
            } else {
                b[i - a.length] = c[i];
            }
//
        }

        System.out.println();
        System.out.println("Array c is :");
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]+" ");

        }
        System.out.println();

        System.out.println("Array a :");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("Array b :");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
//            TC-O(min(n+m))+O(nlogn)+(mlogm)
//             SC-O(1)
         */

        }

    }
