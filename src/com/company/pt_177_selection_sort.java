
public class pt_177_selection_sort {
    public static void ascending(int []a)
    {

        for (int i = 0; i <a.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("\n\nArray in ascending order");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void descending(int []a)
    {
        for (int i = 0; i <a.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]>a[min])
                {
                    min=j;
                }
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("\n\nArray in descending order");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={2,33,22,1,5};
        System.out.println("Original Array:");
        for(int ele:a)
        {
            System.out.print(ele+" ");
        }
        ascending(a);
        descending(a);

    }
}
