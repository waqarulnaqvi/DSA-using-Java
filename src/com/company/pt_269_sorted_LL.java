import java.util.LinkedList;
import java.util.Scanner;
class Link{
LL head;
    static class LL{
        int data;
   LL next;
        LL(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public  LL insert(int ele)
    {
      LL newnode=new LL(ele);
        if(head==null)
        {
            head=newnode;
        }
        else {
            LL temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return head;
    }
    public void display()
    {
        LL t=head;
        while (t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void merge_LList(LL head1,LL head2)
    {
        LL newhead=head;


        while (head1.next!=null && head2.next!=null)
        {
            if(head1.data>head2.data)
            {
//                LL newlink=new LL(head2.data);

                newhead=head2;
                newhead=newhead.next;
                head2=head2.next;
            } else if (head1.data<head2.data){
                newhead=head1;
                newhead=newhead.next;
                head1=head1.next;
            }
            else {
                newhead=head1;
                newhead.next=head2;
                newhead=newhead.next.next;
                head1=head1.next;
                head2=head2.next;
            }
        }
//        head=newhead;
    }
}
public class pt_269_sorted_LL {


    public  static void sorted(LinkedList<Integer> l1,LinkedList<Integer> l2)
    {
        if(l1.isEmpty())
            System.out.println(l2);
        else if(l2.isEmpty())
            System.out.println(l1);
        else {
            int i=0,j=0;
        while (i< l1.size() && j < l2.size())
        {
                if (l1.get(i) <= l2.get(j)) {
                    System.out.print(l1.get(i)+"  ");
                    i++;
                }
                else {
                    System.out.print(l2.get(j)+"  ");
                j++;

                }
            }
            while (l2.size()>j)
            {
                System.out.print(l2.get(j)+"  ");
                j++;
            }
            while (l1.size()>i)
            {
                System.out.print(l1.get(i)+"  ");
                j++;
            }
        }


    }

    public static void main(String[] args) {
//        LinkedList <Integer> k1=new LinkedList<>();
//        LinkedList <Integer>  l2=new LinkedList<>();
//        k1.add(2);
//        k1.add(3);
//        k1.add(4);
//        k1.add(5);
//        k1.add(8);
//        k1.add(9);
//        l2.add(1);
//        l2.addAll(k1);
//        l2.add(10);
//        l2.add(11);
//        l2.add(12);
//        System.out.println(k1);
//        System.out.println(l2);
//
//        sorted(k1,l2);
        int a[]={5,7,9};
        int b[]={2,4,8,10};
        Link ob=new Link();
        Link.LL head1=null;
        Link.LL head2=null;
        for (int i = 0; i <a.length ; i++) {
            head1=ob.insert(a[i]);
        }
        Link obj=new Link();
        for (int i = 0; i <b.length ; i++) {
            head2= obj.insert(b[i]);
        }
        Link obj1=new Link();
        obj1.merge_LList(head1,head2);
        obj1.display();

//        System.out.println(head1.next.next.data);

//        ob.display();
//        System.out.println();
//        obj.display();

    }
}
