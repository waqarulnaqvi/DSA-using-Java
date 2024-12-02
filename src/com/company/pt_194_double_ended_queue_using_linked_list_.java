import java.util.Scanner;
public class pt_194_double_ended_queue_using_linked_list_ {
    Node front=null;
    Node rear=null;
    private int size=0;
    class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }
    public void enqueue_rear(Scanner sc)
    {
        System.out.println("Enter data:");
        int data=sc.nextInt();
        System.out.println("Element Inserted!!\n");
        Node new_node=new Node(data);

        if(front==null)
        {
            front=new_node;
            rear=front;
        }
        else {
            new_node.prev=rear;
            rear.next=new_node;
            rear=new_node;
        }
    }

    public void enqueue_front(Scanner sc)
    {
        System.out.println("Enter data:");
        int data=sc.nextInt();
        System.out.println("Element Inserted!!\n");
        Node new_node=new Node(data);

        if(front==null)
        {
            front=new_node;
            rear=front;
        }
        else {
            new_node.next=front;
            front.prev=new_node;
            front=new_node;
        }
    }
    public void dequeue_front()
    {
        if(front==null )
        {
            System.out.println("Underflow!!\n");
        }
        else {
            size--;

            //method:1
//            front.prev = null;
            front=front.next;

            //method:2
//            front=front.next;
//            if(front !=null) {
//             front.prev = null;
//            }

            System.out.println("Element Deleted!!\n");
        }
    }
    public void dequeue_rear()
    {
        if(front==null )
        {
            System.out.println("Underflow!!\n");
        }
        else {
            size--;
            //method:1
            rear.next=null;
            rear=rear.prev;
            if(rear==null) {
                front=null;
            }
            System.out.println("Element Deleted!!\n");
        }
    }
    public void display()
    {

        if(front==null )
        {
            System.out.println("NO ELEMENT IN THE QUEUE!!\n");
            return;
        }

        System.out.println("DOUBLE ENDED QUEUE ELEMENTS:");
        Node temp=front;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pt_194_double_ended_queue_using_linked_list_ s=new pt_194_double_ended_queue_using_linked_list_();
        int ex;
        do {
            System.out.println("Which operation do you wish to perform:");
            System.out.println("1)enqueue_front\n2)enqueue_rear\n3)dequeue_front\n4)dequeue_rear\n5)display\n6)size of queue ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.enqueue_front(sc);
                case 2 -> s.enqueue_rear(sc);
                case 3 ->s.dequeue_front();
                case 4 ->s.dequeue_rear();
                case 5 -> s.display();
                case 6 -> System.out.println("QUEUE SIZE :"+s.getSize()+"\n");
                default -> {
                    System.out.println("WRONG CHOICE!!");
                }
            }
            System.out.println("If you wish to exit press 0");
            ex = sc.nextInt();
        }
        while (ex != 0);
        {
            System.out.println("EXIT SUCCESSFULLY!!");
        }
    }
}