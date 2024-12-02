public class pt_262_tr_in_ds {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
//    11 28
    static class Binary
    {
        static  int index=-1;
//        9 57
        public Node  buildTree(int nodes[]) {

            //Method :1

            index++;
            Node newnode = new Node(nodes[index]);
            if (nodes[index] == -1) {
                return null;
            } else {

                newnode.left = buildTree(nodes);
                newnode.right = buildTree(nodes);
            }
            return newnode;

//          Method:2
//            index++;
//        if(nodes[index]==-1)
//        {
//         return null;
//        }
//        else {
//            Node newnode=new Node(nodes[index]);
//            newnode.left=buildTree(nodes);
//            newnode.right=buildTree(nodes);
//        return newnode;
//        }

        }

//        public Node  buildTree(int nodes[]) {
//
////Method :2
////            index++;
////            if(nodes[index]==-1)
////            {
////                return null;
////            }
////      Node newnode=new Node(nodes[index]);
////            newnode.left=buildTree(nodes);
////            newnode.right=buildTree(nodes);
////            return newnode;
////        }
////    }
//
//        }
        public int countOfNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            else {
                return countOfNodes(root.left)+countOfNodes(root.right)+1;
            }
        }
        public  int sumOfNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            else {
                return sumOfNodes(root.left)+ sumOfNodes(root.right)+root.data ;
            }
        }

public void postorder(Node root)
{
    if(root==null)
    {

//                System.out.print(-1+" ");
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
    }



    public static void main(String[] args) {
        int a[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Binary obj=new Binary();
     Node root=obj.buildTree(a);
     obj.postorder(root);



        }
    }
//}
