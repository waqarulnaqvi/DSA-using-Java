import java.util.ArrayList;
import java.util.Arrays;

public class pt_275_day_12_2_matrix_median {
    public static void main(String[] args) {
//        Naven approach:
        //Time complexity:(nXm)log(NXm)
//        Space complexity:
        int matrix[][]={{1,3,8},{2,5,9},{3,7,9}};
//        Arrays.sort(matrix); O(nxm)
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arrayList.add(matrix[j][i]);
            }

        }
        System.out.println(arrayList);
        int result=0;
        int n=arrayList.size();
        if(arrayList.size()%2==0)
        {
            result= (arrayList.get(n/2-1)+arrayList.get(n/2+1-1))/2;
        }
        else {
            result= arrayList.get(((arrayList.size() + 1) / 2)-1);
        }

        System.out.println("Middle element is :"+result);
////
//        System.out.println(arrayList);
    }
//    12 55
}
