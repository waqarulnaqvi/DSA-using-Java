//More detail about javadocs go to the javadocs oracle official documentation..
package com.company;
//run....
// /* is comment /** is a javadoc comment..
//Description can be added at the start of java doc comment..
/****Description 1 :Hello this is the method and this is the second most beautiful method of this class..
 * This is the good class..
 * //run..
 * @author Harry (CodeWithHarry)
 * @version 0.1
 * @since 2001
 * @see <a href="file:///C:/Users/HP/com/company/package-summary.html" target="_blank"></a>package3
 *  @see <a href="file:///C:/Users/HP/com/company/pt_87_cwh_107_Advance_java_ch_2_method_tags.html" target="_blank"></a>package2.O
 *  @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Java Docs
 *   @see <a href="https://docs.oracle.com/en/java/" target="_blank"></a>Oracle documentation
 * //Hello have a good day..
*///run..
public class pt_87_cwh_107_Advance_java_ch_2_method_tags {
    // /* is comment /** is a javadoc comment..
    //Description can be added at the start of java doc comment..
    /**
     *
     * @param args These are arguments supplied to the command line
     *///you can only use param args method above the main method..
    public static void main(String[] args) {
        System.out.println("I am main method..");
        System.out.println("/* is comment /** is a javadoc comment..");
    }
    // /* is comment /** is a javadoc comment..
    //Description can be added at the start of java doc comment..
    /**
     *Description :Hello this is the method and this is the most beautiful method of this class..
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of 2 numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0)
        {
             throw new Exception();
        }
        int c =i+j;
        return c;
    }
}
