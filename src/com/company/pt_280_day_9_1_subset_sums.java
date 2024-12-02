public class pt_280_day_9_1_subset_sums {
//    public static int subset(int n[])
//    {
//
//    }
    public static void main(String[] args) {
//        My method:
        int arr[]={3,1,2,4};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+"  ");

                }
                System.out.println();

            }

        }
            System.out.println(arr[0]+"  "+arr[arr.length-1]);


    }
}
