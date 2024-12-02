public class pt_279_day_4_4_largest_subarray_with_k_sum {
    public static void main(String[] args) {

        int arr[]={1,2,3,1,1,1,1,4,2,3};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                System.out.print(arr[j]+"  ");
int s=0;
                for (int k = i; k <=j ; k++) {
                    s+=k;
                }
                System.out.print("Submission of array is "+s);
            }
            System.out.println();

        }
    }
}

//12 50