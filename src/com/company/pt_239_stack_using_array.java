//17 19
//17 42
import java.util.Scanner;
class stack2{
    int top=-1;
    int a[]=new int[6];

    public void push(Scanner sc){
        if (top==a.length-1)
        {
            System.out.println("Stack overflow!!\n");
        }
        else {
            System.out.println("Enter a Element:");
            int ele = sc.nextInt();
            top++;
            a[top] = ele;
            System.out.println("Element Inserted in the stack!!\n");
        }
    }
    public void poppy(){
        if(top==-1){
            System.out.println("Stack Underflow!!\n");
        }
        else {
            top--;
            System.out.println("Element Deleted from the  stack!!\n");
        }
    }
    public void display() {
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public int peek() {

        if (top == -1) {

            return -1;
        }
        else {
            return a[top];
        }
    }
}

public class pt_239_stack_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STACK OPERATIONS");
        stack2 s = new stack2();
        boolean run = true;
        while (run) {
            System.out.println("1 for push\n2 for pop \n3 for display\n4 for peek \nPRESS ANY KEY TO BREAKING FROM THE LOOP!! ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> s.push(sc);
                case 2 -> s.poppy();
                case 3 -> s.display();
                case 4 -> {
                    System.out.println("STACK TOP :" + s.peek() + "\n");
                }
                default -> {
                    System.out.println("Breaking from the loop!!");
                    run = false;
                }
            }
        }
    }
}
