public class pt_274_day_7_1_rotate_a_linkedlist {
//    12 52
    static class ll{
        ll next;
        int data;
        ll(int data)
        {
            this.data=data;
        }
    }
    static ll head=null;
    public static ll insert(int data)
    {
        ll newll=new ll(data);
        if(head==null)
        {
           head=newll;
        }
        else {
            ll temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newll;
        }
return head;
    }
    static ll nhead=null;
    public static void reverse(ll root)
    {

            while (head != null) {
                ll temp = head.next;
                head.next = nhead;
                nhead = head;
                head = temp;
            }

        head=nhead;
        nhead=null;

    }

    public static void display()
    {
        if(head.next==null)
        {
            head=null;
            return;
        }
        System.out.println("Linkded list is:");
        ll temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void delete()
    {
        head=head.next;
    }

    public static void deleteend()
    {
        ll temp=head;
        if(temp.next==null)
        {
           head=null;
            return;
        }
        while (temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }


    public static void main(String[] args) {
int arr[]={1,2,3,4,5};
ll root=null;
        for (int i = 0; i <arr.length ; i++) {
            root=insert(arr[i]);
        }
        display();
        reverse(root);
        display();
        reverse(root);
        display();
        delete();
        display();
        deleteend();
        display();
        deleteend();
        display();
//        deleteend();
//        display();
//        deleteend();
//        display();    deleteend();
//        display();
//        deleteend();
//        display();

    }
}
//23 47