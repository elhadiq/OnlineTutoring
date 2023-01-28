import java.util.Scanner;

public class TheMain {
    @Override
    public String toString() {
        return "TheMain{}";
    }

    public TheMain() {
    }

    public static void main(String[] args) {
        int test=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=in.nextLine();
        System.out.println(name);

    }
}
