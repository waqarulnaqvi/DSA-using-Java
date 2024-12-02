import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Definition for singly-linked list.


public class pt_249_practice_question {





    public static void main(String[] args) {
//        20 57
//Roman number to integer:
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Roman number:");
//        String rmn=sc.nextLine();
//        int integernumber=0;
//        for (int i = 0; i <rmn.length() ; i++) {
//            if(rmn.contains("I"))
//            {
//                integernumber+=1;
//            }
//            else if (rmn.contains("IV")) {
//                integernumber+=4;
//            }
//            else if (rmn.contains("V")) {
//                integernumber+=5;
//            }
//            else if (rmn.contains("IX")) {
//                integernumber+=9;
//            }
//            else if (rmn.contains("X")) {
//                integernumber+=10;
//            }
//
//        }
//        System.out.printf("Roman number is %s and integer number is %d\n",rmn,integernumber);
// 14 2
//Merge to sorted list:
//        int a[]={2,3,5,8};
//        int b[]={1,2,7,9,8};
//
//        int c[]=new int[a.length+b.length];
//
//
//        for (int i = 0; i <a.length ; i++) {
//            System.out.print(a[i]+"  ");
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i <b.length ; i++) {
//            System.out.print(b[i]+"  ");
//        }
//        System.out.println();
//
//        int i=0,j=0;
//
//        while(i<c.length) {
//            if (i < a.length) {
//                c[i] = a[i];
//            } else {
//              c[i]=b[j];
//              j++;
//            }
//            i = i + 1;
//        }
//
//        for (int k = 0; k < c.length; k++) {
//            System.out.print(c[k]+"  ");
//        }

//        Remove duplicate from the sorted array:
//        int i=0;
//        int c=1;
//        int a[]={1,2,2,44,44,55,56,67,67,78,90,102,104};
//        System.out.println("Original Array:");
//        for (int j = 0; j < a.length; j++)
//        {
//            System.out.print(a[j]+"  ");
//        }
//        System.out.println();
//
//        for (int j = 1; j < a.length; j++) {
//            if(a[i]!=a[j])
//            {
//                i++;
//                a[i]=a[j];
//                c++;
//            }
//        }
//
//        System.out.println("New Array:");
//        for (int j = 0; j < c; j++)
//        {
//            System.out.print(a[j]+"  ");
//        }
//        System.out.println();

//        8 18 19

//        Remove duplicate element from the array:
//        Method 1:
//        int a[]={1,2,2,3,3,22,1,5,8,22,3};
//        ArrayList<Integer> b=new ArrayList<>();
//        HashMap<Integer,Integer> Dict= new HashMap<>();
//        for (int i = 0; i <a.length ; i++) {
//            if(!Dict.containsKey(a[i]))
//            {
//                Dict.put(a[i],1);
//                b.add(a[i]);
//            }
//        }
//        System.out.println(b);

//Method:2
//        int a[]={1,2,2,3,3,22,1,5,8,22,3};
//        ArrayList<Integer> b=new ArrayList<>();
//        for (int i = 0; i <a.length ; i++) {
//
//            if(!b.contains(a[i]))
//            {
//                b.add(a[i]);
//            }
//        }
//        System.out.println(b);

//   Find longest chain:
HashMap<Integer,Integer> dict=new HashMap<>();
HashMap<Integer,Integer> dict1=new HashMap<>();
dict.put(1,1);
int i=1,j=1;
while(i!=0)
{
    System.out.println("Enter pair "+j+" :");
    int key= sc.nextInt();
    int value2= sc.nextInt();
j++;
if(key>value2)
{
    System.out.println("First value must be lesser or equal as compare to second!!" );
}
    else if(!dict.containsKey(key) || dict.get(key)>value2)
    {
        dict.put(key,value2);
    }

    System.out.println();
    System.out.println("Enter 0 to stop the loop:");
    i=sc.nextInt();

}
        System.out.println("Total pairs:");
        System.out.println(dict);

        System.out.println("Choosen pair:");

    }
}

