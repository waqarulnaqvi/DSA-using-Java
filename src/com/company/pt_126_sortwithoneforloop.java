//Method:1
//package com.company;
//
//public class selfpt_21_sortwithoneforloop {
//    public static void main(String[] args) {
//        int a[]={2,6,3,4,5,7,6,34,1};
//        int num=0;
//        for(int i=0;i<a.length;i++) {
//            System.out.print(a[i] + " ");
//            if (i != a.length - 1) {
//                if (a[i] > a[i + 1]) {
//                    num = a[i + 1];
//                }
//            }
//        }
//        System.out.println("\nSmallest number is:"+num);
//    }
//}

//Method:2
package com.company;

public class pt_126_sortwithoneforloop {
    public static void main(String[] args) {
        int a[]={2,6,3,4,5,7,6,34,1};
        int num=0;
        for(int e:a) {
            System.out.print(e+" ");
        }
        for(int i=0;i<a.length-1;i++) {
                if (a[i] > a[i + 1]) {
                    num = a[i + 1];
                }
            }
        System.out.println("\nSmallest number is:"+num);
        }

    }