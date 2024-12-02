import java.util.ArrayList;
import java.util.Scanner;
//8 13

public class pt_259_binary_tree {
    static class Binary {
        int data;
        Binary left;
        Binary right;

        Binary(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static Binary insert(Binary root,int data)
        {
            if(root==null)
            {
                root=new Binary(data);
                return root;
            }
            else if(root.data>data) {
                root.left=insert(root.left,data);
            }
            else {
                root.right=insert(root.right,data);
            }
            return root;
        }

        public static void inorder(Binary root)
        {
//            left root right
            if(root==null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");

            inorder(root.right);
        }
    public static void postorder(Binary root)
    {
//            root left right
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");

        inorder(root.left);
        inorder(root.right);
    }
    public static void preorder(Binary root)
    {
//            left right  root
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");

        preorder(root.left);
        preorder(root.right);
    }
    public static boolean search(Binary root , int key)
    {//The time complexity of search is O(height) because in worst case scenario the maximum search could be root to leaf which is equal to the height of the tree.
        //    in search of the key worst case scenario is +searching a key from the root to  leaf( total search is height of the tree).
        if(root==null)
        {
            return false;
        }

        else if(root.data>key)
        {
            root=root.left;
           return search(root,key);
        }
        else if(root.data<key)
        {

            root=root.right;
            return search(root,key);
        }
        else
        {
            return true;
        }
//        12 35
//        18 23
    }
//    public static boolean delete(Binary root,int key)
//    {
//
//        //By default in BST Inorder successor is the left most int the right subtree.
//        if(root.data==key)
//        {
//            if(root.left==null && root.right==null)
//            {
//
//                return true;
//            }
//        }
//    }

    public static Binary delete(Binary root,int key) {//if we return the node(Binary) then the changes will be reflected easily.
        if (root == null) {
            return null;
        } else if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {//root.data == value
//    case 1 :
            if (root.left == null && root.right == null) {
                return null;//root parent return null and changes will be directly reflected to the root.
            }
            //case 2 :
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

//    case 3 :
            else {
                Scanner sc = new Scanner(System.in);
                System.out.println("It is an internal node so you can replace the deleted node either its inordersuccessor or inorderpredecceso\n 1 for inorder predecessor\n 2 for inorder successor :");
                int choice = sc.nextInt();
                if (choice == 1) {
                    Binary ip = inorderpredicissor(root.left);
                    root.data = ip.data;
//           root.left=delete(root.left,ip.data);//same
                    root.left = delete(root.left, root.data);//same
                } else {
                    Binary InorderSuccess = inorderSuccessor(root.right);
                    root.data = InorderSuccess.data;
//                    root.right = delete(root.right, InorderSuccess.data);//same
                    root.right = delete(root.right, root.data);//same
                }
            }
        }
            return root;
        }
    public static Binary inorderpredicissor(Binary root)
    {
        while (root.right!=null)
        {
            root=root.right;
        }
        return root;
    }

    public static Binary inorderSuccessor(Binary root)
    {
        while (root.left!=null)
        {
            root=root.left;
        }
return root;
    }

    public static void  printInRange(Binary root,int X,int Y)
    {
        if(root==null)
        {
            return;
        }
     if(root.data>=X && root.data<=Y)
     {
       printInRange(root.left,X,Y);
         System.out.print(root.data+" ");
         printInRange(root.right,X,Y);
     }
     else if(root.data>=Y)
     {
         printInRange(root.left,X,Y);
     }
     else {
         printInRange(root.right,X,Y);
     }
    }
    public static void printPath(ArrayList<Integer> path)
    {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
        System.out.println();
    }

    public static void printRoot2Leaf(Binary root, ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
//      leaf:
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        else {//non-leaf:
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
//            int a[] = {8,5,3,6,10,11,14};
            int a[] = {8,5,3,1,4,6,10,11,14};
            Binary root=null;
            for (int i = 0; i <a.length ; i++) {
               root= insert(root,a[i]);

            }
//            inorder(root);
//            System.out.println();
//           preorder(root);
//            System.out.println();

//            tree traversal
//            root
            //left subtree
            //right subtree

            //search in a bst

//            System.out.println("Enter value that you want to search:");
//            int key = sc.nextInt();
//            if(search(root,key))
//            {
//                System.out.println("key found !!");
//            }
//            else {
//                System.out.println("key not found !!");
//            }


//            Deletion  in  Bst is very important:
            while (true) {
                preorder(root);
                System.out.println();
                System.out.println("Which node do you wish to delete:");
                int node =sc.nextInt();
                delete(root, node);
                preorder(root);
                System.out.println();
            }
//delete(root,5);
////delete(root,25);
//inorder(root);
//            System.out.println();
//            System.out.println();
//Question 1
//            X=6 & Y=10

//            System.out.println();
//            printInRange(root,4,6);

//Question 2
//            root to leaf path
//            P1 :8 ->5 -> 3
//            P2 :8 ->5 -> 6
//            P3 :8 ->10 ->11 ->14
//            we will perform backtracking here.
//            It is like a preorder traversal :Root(add),left subtree and ,right subtree.
//printRoot2Leaf(root,new ArrayList<>());
        }
    }

