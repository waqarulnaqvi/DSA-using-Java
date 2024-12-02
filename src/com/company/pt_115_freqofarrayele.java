//package com.company;
//public class selfpt_10_freqofarrayele {
//    static void frequency(int  []a) {
//        int c = 1, j, f = 0, s = 0, t = 0, fo = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (j = 0; j < a.length; j++) {
//                if (a[i] == a[j] && i != j) {
//                    if (a[i] == s && a[j] == f) {
//                        continue;
////                        System.out.printf("the element index a[%d] is same as index a[%d] element =%d",j,i,a[i]);
//                    }
//                    c++;
//                    f = j;
//                    s = i;
//                    t = f;
//                    fo = s;
//                }
//            }
//            if (a[i] != s && a[j] != f && a[i] == a[j]) {
//                System.out.printf("\nElement =%d ,its index =[%d] and freq %d", a[i], i, c);
////            }
////            else{
//
////            }
//                c = 1;
//                f = 0;
//                s = 0;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int a[]={1,2,3,2,1,2,2};
//        frequency(a);
//    }
//}
package com.company;
public class pt_115_freqofarrayele {
    static void frequency(int  ...a) {
        int c = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    c++;
                }
            }
            System.out.printf("\nElement =%d ,its index =[%d] and freq %d", a[i], i, c);
            c=1;
        }
    }
    public static void main(String[] args) {
        frequency(2,3,4,5,6,2,2);
    }
}
