////METHOD 1:
////package com.company;
////public class selfpt_19_returnvalue {
////static String value()
////{
////
////    int a[]={1,2,43,5,5,6};
////    int k=0,l=0;
////    for(int i=0;i<a.length;i++)
////    {
////        for (int j=0;j<a.length;j++)
////        {
////            if(i==1&&j==2){
////            k=a[i];
////            l=a[j];
////            }
////        }
////    }
////    String kk=k+"\n"+l;
////    return kk;
////}
////    public static void main(String[] args) {
////        System.out.println(value());
////    }
////}
////METHOD 2:
////package com.company;
////public class selfpt_19_returnvalue {
////    static int l,k;//static variable value by default 0
////    static int value(int ...a)
////    {
////        for(int i=0;i<a.length;i++)
////        {
////            for (int j=0;j<a.length;j++)
////            {
////                if(i==1&&j==2){
////                    k=a[i];
//////                    System.out.println(k);
////                    l=a[j];
////                }
////            }
////        }
////       return 0;
////    }
////    public static void main(String[] args) {
////        System.out.println("Before Calling function:");
////        System.out.println(k+"\n"+l);
////        value(2,4,564,3,2,4,3,4);
////        System.out.println("After Calling function:");
////        System.out.println(k+"\n"+l);
////    }
////}
////METHOD 3:
//package com.company;
//class value {
//    int value1(int a, int b) {
//
//        int c= a + b;
//
//        return c;
//    }
//}
//public class selfpt_19_returnvalue {
//    public static void main(String[] args) {
//     value a[]=new value[2];
//     a[0]=new value();
//     a[1]=new value();
//        System.out.println(a[0].value1(2,34));
//        System.out.println( a[1].value1(2,5));
//    }
//}
////METHOD:4
////package com.company;
////public class selfpt_19_returnvalue {
////static int []value(int a1,int b1)
////{
////    int a[]=new int[3];
////    a[0]=a1+b1;
////    a[1]=a1-b1;
////        return a;
////    }
////
////    public static void main(String[] args) {
////        int ans[]=value(100,33);
////        System.out.println("sum="+ans[0] );
////        System.out.println("sum="+ans[1] );
////        System.out.println("sum="+ans[2] );
//////        System.out.println("sum="+ans[3] );//error above than array length ( Index 3 out of bounds for length 3)
////    }
////}
