import java.util.Scanner;

public class pt_236_shorts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int arr[][]={{},{}};
//                      0 1

//        int ar[][]={{1,2,3},{2,3,4}};
//                   {00 01 02} {10 11 12}


        int arr[][]=new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }








//Tribonnaci series
//        System.out.println("Enter a number:");
//        int n =sc.nextInt();
//        int a=0,b=1;int c=2;
//        System.out.print(a+" "+b+" "+c+" ");
//        for (int i = 3; i <=n ; i++) {
//            int d=a+b+c;
//            System.out.print(d+" ");
//            a=b;
//            b=c;
//            c=d;
//        }


        //Fibonnaci series
//        int a=0,b=1;
//        System.out.print(a+" "+b+" ");
//        for (int i = 2; i <=n ; i++) {
//            int c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }
    }
    }
//        int arr[]={1,2,3,4,5,6};
//        System.out.println("\n");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+"\n");
//
//        }
//
//        System.out.println("\n");
//        int []ar={1,2,3,44};
//        for (int ele :ar) {
//            System.out.print(ele+"\n");
//
//        }

//        int arr[]=new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter value at index "+i+": ");
//            arr[i]=sc.nextInt();
//
//
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+"\t");
//
//        }
//
//        System.out.println("\n");
//        for (int ele :arr) {
//            System.out.print(ele+"\t");
//
//        }