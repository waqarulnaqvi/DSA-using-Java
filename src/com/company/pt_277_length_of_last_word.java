public class pt_277_length_of_last_word {
    public static void main(String[] args) {
//        int arr[]={3,1,2};
//        Possible permutation:
//        3! =6 possible ways/permutation

//        int arr[]={2,1,5,4,3,0,0};

       String s="  y4";
        s=s.trim();

        int num=0;

        for(int i=s.length()-1;(s.charAt(i)!=' ')&& i<=0;i--)
        {
            num++;
        }

        System.out.println(num);
    }
}
