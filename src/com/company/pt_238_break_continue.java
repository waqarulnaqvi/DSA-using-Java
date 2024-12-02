public class pt_238_break_continue {
    public static void main(String[] args) {
//        break statements:-
         int i=0;
        for( i=1;i<15;i++) {
            System.out.println(i);
            System.out.println("Java is Great");

            if (i == 4) {
                System.out.println("Ending the loop");
                continue;
            }

            System.out.println("Python  is Great");
        }

    }
    }
