import java.util.LinkedList;

//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//            if(list1!=null && list2!=null){
//                if(list1.val<list2.val){
//                    list1.next=mergeTwoLists(list1.next,list2);
//                    return list1;
//                }
//                else{
//                    list2.next=mergeTwoLists(list1,list2.next);
//                    return list2;
//                }
//            }
//            if(list1==null)
//                return list2;
//            return list1;
//        }
//    }
class  Solution2{
    public pt_255_List_Node mergeTwoLists(pt_255_List_Node list1,pt_255_List_Node list2)
    {
        if(list1==null)
            return list2;
        return list1;
    }

}
//Definition for singly-linked list:
public class pt_255_List_Node {
    int val;
    pt_255_List_Node next;
    pt_255_List_Node(int val,pt_255_List_Node next)
    {
        this.val=val;
        this.next=next;
    }
    public static void main(String[] args) {

//        int a[]={1,2,3,3,4};
//        int b[]={1,2,3,3,4};
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
       l1.add(2);
       l1.add(3);
       l1.add(5);

        Solution2 ob=new Solution2();
//        ob.mergeTwoLists(l1,l2);

    }
}
