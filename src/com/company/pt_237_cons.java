public class pt_237_cons {
    int i;
    int j;
//    Default constructor:
    pt_237_cons()
    {
        this.i=123;
        this.j=1212;
    }
//    Parameterized constructor:
    pt_237_cons(int i)

    {
         i=i;
          j=i;
    }
    public void display()
    {
        System.out.println("Value of i is :"+i+"Value of j is :"+j);
    }
    public static void main(String[] args) {
        pt_237_cons ob=new pt_237_cons();
        ob.display();

        pt_237_cons obj=new pt_237_cons(230);
        obj.display();
    }
}
