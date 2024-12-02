//Method:1
//package com.company;
//public class selfpt_1_array {
//    public static void main(String[] args) {
//        int a[] = {44, 7, 53, 4, 3, 212,7};
//        int i, j, l=0,m=0;
//        for (i = 0; i < a.length; i++) {
//            for (j = 0; j < a.length - 1; j++) {
//                if (a[i] != a[j + 1] && a[i] + a[j + 1] == 11  ) {
//                    if(a[i]==m&&a[j+1]==l)
//                    {
//                        continue;
//                   }
//                    System.err.printf("(a[%d]=%d)+(a[%d]=%d)==11 \n",i,a[i],j+1,a[j+1]);
//                     l=a[i];
//                     m=a[j+1];
//
//                }
//            }
//        }
//    }
//}
//                  System.err.print(k);
//                  System.err.print("+"+(a[j+1]));
//                  System.err.println("="+(k+a[j+1]));
//              }
//          }
//        while (true){
//                  int t = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = t;
//                    if(a[j]+a[j+1]==11) {
//
//                        System.err.println("got it");
//                        break;
//                    }
//                    if(j!=a.length-1) {
//                        j++;
//                    }
//        }
//        for (i = 0; i < a.length; i++) {
//            System.err.print("\t" + a[i]);;
//        }
//    }
//}

//        for (i = 1; i < a.length - 1; i++) {
//            k = a[i];
//            j = i - 1;
//            while (j >= 0 && a[j] > k) {
//                a[j + 1] = a[j];
//                j = j - 1;
//
//            }
//            a[j + 1] = k;
//            if (a[j] + a[j +1] == 11) {
//                System.err.println("got it");
//            }
//        }
//  for (i = 0; i < a.length; i++) {
//            for (j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] > a[j + 1]) {
//                    int t = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = t;
//                }
//                if (a[j] + a[j + 1] == 11) {
//                    System.err.println("got it");
//                }
//            }
//            for (i = 0; i < a.length; i++) {
//                System.err.print("\t" + a[i]);
//            }
//        }
//    }
//}
//    }
//    }
//Method:2
package com.company;
 import java.util.Random;

public class pt_105_array {
    public static void main(String[] args) {
        int a[]={44,5,53,3,3,212};
        int i,c1,c2,k=0;
        Random ch =new Random();
         c1=ch.nextInt(a.length);
         c2=ch.nextInt(a.length);
            if (a[c1]+a[c2]==11) {

                System.err.printf("a[%d] & a[%d]= 11", c1, c2);
            }
                else
                k= a[c1] + a[c2];
                System.err.printf("Sum of a[%d]=%d & a[%d]=%d is not 11 its %d",c1,a[c1],c2,a[c2],k);
        }
    }
