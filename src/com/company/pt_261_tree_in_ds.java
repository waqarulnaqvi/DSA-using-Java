import java.util.LinkedList;
import java.util.Queue;

//15 30 to 17
public class pt_261_tree_in_ds {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }

        //time complexity of inorder,preorder and postorder is O(n).
        public static void preorder(node root) {
            if (root == null) {

//                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(node root) {
            if (root == null) {

//                System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(node root) {
            if (root == null) {

//                System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        //        4th type of traversal is level order traversal and we use iterative method to solve the level order traversal and we use queue ds to solve it.
        public static void LevelOrderTraversal(node root) {
            if (root == null) {
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                node currnode = q.remove();
                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
// 1 4
                }
            }

//           1
//           2 3
//           4 5 6
//           we  use breadth first search in level order(matlab siblings ko pehle print karayenge baccho ko print karane se pehle.
//           what is the bfs traversal of tree i.e. level order traversal.
//           time complexity of level order traversal is O(n)
        }

        static int count = 0;

        public static void countofnodes(node root) {
            if (root == null) {
                return;
            }
            count++;
            countofnodes(root.left);
            countofnodes(root.right);
//    count++;


        }

        //Counts of nodes
        public static int countOfNodes(node root) {//time complexity is O(n).
            if (root == null) {
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        //Sum of nodes:
        public static int sumOfNodes(node root) {//time complexity : O(n).
            if (root == null) {
                return 0;
            }
            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.right);
            return leftsum + rightsum + root.data;
        }

        public static int heightOfTree(node root) {//It is not optimised function.
//            Time complexity of the height of the tree is O(n).
            if (root == null) {
                return 0;
            }
            int leftheight = heightOfTree(root.left);
            int rightheight = heightOfTree(root.right);
            int myHeight = Math.max(leftheight, rightheight) + 1;
            return myHeight;
        }

        public static int diameterOfTree(node root) {//Time complexity is O(n^2)
//            Case 1: through the root.
//            Case 2:Does not pass through the root.
//            Question asked in adoby and snapdeal type of companies.
//            Diameter of a Tree is defined as Number of Nodes in the Longest path between any two nodes.
//     Approach 1 : O(N^2)
//            Diameter 1->Ls
//            Diameter 2->rs
//            Diameter 3->ls+rs
            if (root == null) {
                return 0;
            }
            int diam1 = diameterOfTree(root.left);
            int diam2 = diameterOfTree(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;//because of this step time complexity of this function is O(n^n).
            return Math.max(diam3, Math.max(diam1, diam2));

        }

        public static boolean isIdentical(node root, node subroot) {
            if (root == null && subroot == null) {
                return true;
            }
            if (root == null || subroot == null) {
                return false;
            }
//            if(subroot.left==root.left &&subroot.right ==root.right)
//            {
//                return true;
//            }
//                return false;
            if (root.data == subroot.data) {
                return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
            }
            return false;
        }

        public static boolean subtreeOfAnotherTree(node root, node subroot) {
            if (subroot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return subtreeOfAnotherTree(root.left, subroot) || subtreeOfAnotherTree(root.right, subroot);
        }
//        Subtree of another tree.
//        ASked in google and microsoft.


    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

    }

    public static TreeInfo diameter2(node root) {
//        Time complexity is linear i.e. O(n)
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    //    Homework sum of Nodes at Kth level hint :track the level in the queue.
//    tree is hierarical ds
    public static void main(String[] args) {
//    tree contain leaf ,branch and root etc
//    the first node of the tree is root node.
//    those node who have same parents are considered as a siblings
//    ancestors are important in tree.
//    level and depth of tree is important.
//  tree contain lot of subtree.
//    subtree is a tree in a tree.
    /*
    Questions:
   a.Children of 2. 4 5
   b.No. of leaves. 4
   c.parents of 3.1
   d.Level of 5. 3
   e.Subtree of 2(4 5) & 6(null 9).
   f.Ancestors of 4.(2 and 1 )(parent and grantd parent)

//   -1 represent null node in a tree.
     */
        int a[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int b[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
//  BinaryTree tree1=new BinaryTree();
        node root = tree.buildTree(a);
//  node subroot=tree1.buildTree(b);


//    System.out.println(root.right.right.data);

        System.out.println("\npreorder sequence is (root left right) :");
        tree.preorder(root);

        System.out.println("\n\ninorder sequence is (left root right) :");
        tree.inorder(root);
        System.out.println("\nInorder sequence always give the sorted array!!");

        System.out.println("\n\npostorder sequence is ( left right root) :");
        tree.postorder(root);

        System.out.println("\n\nlevel order tree traversal using linkedlist :");
        tree.LevelOrderTraversal(root);

        System.out.println("\n\ntotal numbers of nodes :");
//    System.out.println(tree.count);
//    tree.countofnodes(root);
//    System.out.println(tree.count);
        System.out.println(tree.countOfNodes(root));

        System.out.println("\n\ntotal sum of all nodes :");
        System.out.println(tree.sumOfNodes(root));

        System.out.println("\n\nHeigt of the tree :");
        System.out.println(tree.heightOfTree(root));
        System.out.println(diameter2(root).ht);

        System.out.println("\n\nDiameter of the tree :");
        System.out.println(tree.diameterOfTree(root));
        System.out.println(diameter2(root).diam);

//    System.out.println(tree.subtreeOfAnotherTree(root,subroot));
//    16 5
//        17 15
    }
}
