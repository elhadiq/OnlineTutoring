import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        System.out.println( al);
        al.forEach((n)->System.out.print(n+" "));
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
        System.out.print("\n");
        // Let us print the sorted list
        al.forEach((n)->System.out.print(n+", "));
    }
}