import java.util.Scanner;
//21 13
public class pt_268reversell {
static LL head;
 static class LL{
     int data;
     LL next;
     LL(int data)
     {
         this.data=data;
         this.next=null;
     }
 }
 public static void insert()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter data:");
     int ele=sc.nextInt();
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
 }
 static LL newhead=null;

 public static void reverse()
 {

     while (head.next!=null)
     {
         LL temp=head.next;
         head.next=newhead;
         newhead=head;
         head=temp;
     }
head=newhead;
     newhead=null;
 }
// 22 55

 public static void display()
 {
     LL temp=head;
     while (temp!=null)
     {
         System.out.print(temp.data+"  ");
         temp=temp.next;
     }
     System.out.println();
     System.out.println();
 }

 public static void removeelement()
 {
//     Time complexity: O(N)+O(N)
     System.out.println("Enter element nth index:");
     int n=new Scanner(System.in).nextInt();
//     System.out.println(n);

     int n1=0;
     LL temp=head;
     while (temp!=null)
     {

         n1++;
         temp=temp.next;
     }
//12 12
    temp=head;
     int t=1,f=0;
     while (temp!=null)
     {
       if(n1-n==t ||n1-n==0) {//Error
//           if (n1 >= 3) {
               temp.next = temp.next.next;
//           }
//           else {
//               temp=temp.next;
//           }
           f=1;
       }
       t++;
         temp=temp.next;
     }
     if(f==1)
     {
         System.out.println("Element Deleted!!\n");
     }
     else {
         System.out.println("Element does not exist!!\n");
     }
 }
 public static void middle()
 {
     int n=0;
     LL temp=head;
     while (temp!=null)
     {
        n++;
         temp=temp.next;
     }

     temp=head;
     for (int i = 0; i <n/2; i++) {
         temp=temp.next;
//         System.out.println("ohk"+i);
     }
     System.out.println("Middle element is : "+temp.data);
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STACK OPERATIONS");
        boolean run = true;
        while (run) {
            System.out.println("1 for insert\n2 for  reverse\n3 for display\n4  for middle element\n5 for remove the element\nPRESS ANY KEY TO BREAKING FROM THE LOOP!! ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> insert();
                case 2 -> reverse();
                case 3 -> display();
                case 4-> middle();
                case 5 ->removeelement();
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run = false;
                }
            }
        }
    }
}
