//public class pt_292_Integer_to_roman {
//        public static String[] convert(int val)
//        {
//            String a[]=new String[2];
//            if(val>=1 && val<5)
//            {
//                a[0]="I";
//                a[1]="1";
//            }
//            else if(val>=5 && val<10)
//            {
//                a[0]="V";
//                a[1]="5";
//            }
//            else if(val>=10 &&val<50)
//            {
//                a[0]="X";
//                a[1]="10";
//
//            }
//            else if(val>=50 && val<100)
//            {
//                a[0]="L";
//                a[1]="50";
//
//            }
//            else if(val>=100 && val<500)
//            {
//
//                a[0]="C";
//                a[1]="100";
//            }
//            else if(val>=500 && val<1000)
//            {
//
//                a[0]="D";
//                a[1]="500";
//
//            }
//            else if(val>=1000)
//            {
//                a[0]="M";
//                a[1]="1000";
//            }
//            return a;
//
//        }
//
//
//    public static void main(String[] args) {
//
//        int num=55;
//        String newstr="";
//
//        while(num!=0)
//        {
//        String[]a=convert(num);
//        newstr=newstr+a[0];
//        num=num- Integer.parseInt(a[1]);
//
//
//        }
//
//        System.out.println("Roman :"+newstr);
//    }
//}
