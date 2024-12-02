import java.util.Vector;

public class pt_250_vectors_in_java {
    public static void main(String[] args) {
        Vector lst=new Vector();
        lst.addElement("Ram");
        lst.addElement("Shyam");
        lst.addElement("Sita");
        System.out.println("Vectors Elements are:"+lst);
        lst.insertElementAt("Ravi",1);
        System.out.println("Vectors Elements are:"+lst);
    }
}
