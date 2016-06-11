import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String input=null;
        Set<String> set=new TreeSet<>();

        for (int i = 0; i < n; i++) {
            input=scanner.nextLine();
            String[] elements=input.split(" ");
            for (String s : elements) {
                set.add(s);
            }

        }

        for (String s : set) {
            System.out.printf(s+" ");
        }
    }
}
