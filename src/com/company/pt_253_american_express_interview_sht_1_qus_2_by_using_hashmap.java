//
//import java.util.HashMap;
//import java.util.Scanner;
//class Solution1 {
//    Scanner sc;
//    public Solution1(Scanner sc) {
//        this.sc = sc;
//    }
//
////    15 45
//    public int solution(int A[]) {
//        int pair = 1;
//        int min = Integer.MAX_VALUE;
//        int i_index = 0;
//        HashMap<Integer,Integer> dict=new HashMap<>();
//    System.out.println("All possible pairs:");
//        for (int i = 0; i < A.length; i++) {
//            int sum = 0;
//            System.out.println("SET " + (i + 1) + " : ");
//            for (int j = 0; j < A.length; j++) {
//                if (i != j && i - 1 != j && i + 1 != j) {
//
//                    System.out.printf("Pair %d (%d,%d) = %d\n", pair, i, j, i + j);
//                    pair = pair + 1;
//                    sum += (i + j);
//                    if (sum < min) {
//
////                     HashMap=null;
//                    }
//                }
//            }
//            if (sum < min) {
//                i_index = i;
//                min = sum;
//            }
//            System.out.println();
//        }
//        return i_index;
//    }
//}
//
//public class pt_253_american_express_interview_sht_1_qus_2_by_using_hashmap {
//    public static void main(String[] args) {
//
//
//        Solution s = new Solution(new Scanner(System.in));
//        int a[] = {1, 2, 3, 4, 3};
//        int index = s.solution(a);
//        int pair=1;
//        System.out.println("Minimum pair : ");
//        for (int i = 0; i < a.length; i++) {
//            if (index != i && index - 1 != i && index + 1 != i) {
//                System.out.printf("Pair %d (%d,%d) = %d\n", pair, index, i, i + index);
//            }
//        }
//    }
//}
