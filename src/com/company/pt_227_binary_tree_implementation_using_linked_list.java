//import java.util.Scanner;
//public class pt_227_binary_tree_implementation_using_linked_list {
//    class node{
//        node left,right;
//        int data;
//        public node(int data)
//        {
//            this.data=data;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    static node create()
//    {
//        Scanner sc=new Scanner(System.in);
//        node root=null;
//        System.out.print("Enter value:");
//         int data=sc.nextInt();
//         if (data==-1) {
//             return null;
//         }
//         root =new node (data);
//        System.out.println("Enter left child of"+root);
//        root.left=create();
//        System.out.println("Enter left child of"+root);
//        root.right=create();
//        return root;
//    }
//
////    static node create() {
////
////    }
////    static node create()
////    {
////        Scanner sc=new Scanner(System.in);
////        node root=null;
////        System.out.println("Enter value:");
////        int data=sc.nextInt();
////        if(data==-1)
////        {
////            return null;
////        }
////        root =new node(data);
////        System.out.println("Enter left child of "+root);
////        root.left_child=create();
////        System.out.println("Enter right child of "+root);
////        root.right_child=create();
////        return root;
////    }
////    static class node{
////        int data;
////        node left_child;
////        node right_child;
////
////        public node(int data) {
////            this.data = data;
////            this.left_child=null;
////            this.right_child=null;
////
////        }
////    }
////    static void in_order(node root)
////    {
////        if(root ==null)
////        {
////            return;
////        }
////        in_order(root.left_child);
////        System.out.println(root.data);
////        in_order(root.right_child);
////    }
////    static void post_order(node root)
////    {
////        if(root ==null)
////        {
////            return;
////        }
////        post_order(root.left_child);
////        post_order(root.right_child);
////        System.out.println(root.data);
////    }
////    static void pre_order(node root)
////    {
////        if(root ==null)
////        {
////            return;
////        }
////        System.out.println(root.data);
////        pre_order(root.left_child);
////        pre_order(root.right_child);
////    }
//    public static void main(String[] args) {
//        node root=create();
////        pre_order(root);
////        in_order(root);
////        post_order(root);
//    }
//}
