
public class pt_287_array_copy {
    public static void main(String[] args) {
//        To create a Gui we have 3 option in java AWT,swing,java Fx
//        AWT is currently obsolete


/*Swing*/


        int a[]={1,2,3,4,4,5,6,};
        int b[]=new int[a.length+1];

        System.arraycopy(a,0,b,0,a.length);
//        System.arraycopy(a,0,b,2,a.length-1);

        for (int ele: b) {
            System.out.println(ele);
        }
    }
//    18 29
}
