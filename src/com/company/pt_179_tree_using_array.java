//left child ->2i+1
//right child ->2i+2
//using array!!
import java.util.*;
public class pt_179_tree_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node");
        int root = sc.nextInt();
        int a[] = new int[8];
        a[0] = root;
        int index1=0, index2=0;
        for (int i = 0; i < a.length; i++) {
            index1 = 2 * i + 1;
            index2 = 2 * i + 2;
            if (index1 >= a.length && index2 >= a.length) {
                System.out.println("\nARRAY LENGTH IS FULL!!\n");
                break;
            }
            System.out.println("Enter left child of the binary tree and -1 if no left child");
            int left_child = sc.nextInt();

            if (index1 >= a.length) {
                System.out.println("left child can't be inserted");
            } else {
                a[index1] = left_child;
            }
            System.out.println("Enter right child of the binary tree and -1 if no right child");
            int right_child = sc.nextInt();

            if (index2 >= a.length) {
                System.out.println("right child can't be inserted");
            } else {
                a[index2] = right_child;
            }
        }

        System.out.println("Binary tree:");
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}

//   for (int i = 0; i <a.length ; i++) {
//        System.out.println("Enter 1 for left child of the binary tree\n 2 for right child of the binary tree");
//        int child = sc.nextInt();
//        switch (child) {
//        case 1 -> {
//
//        index1 = 2 * i + 1;
//        if (index1 >= a.length) {
//        System.out.println("Element can't be inserted");
//        } else {
//        int left_child = sc.nextInt();
//        a[index1] = left_child;
//        }
//        }
//        case 2 -> {
//        index2 = 2 * i + 2;
//        if (index2 >= a.length) {
//        System.out.println("Element can't be inserted");
//        } else {
//        int right_child = sc.nextInt();
//        a[index2] = right_child;
//        }
//        }
//
//        }