import java.util.*;

public class _1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Set<String> set=new LinkedHashSet<>();
        String input=null;
        for (int i = 0; i < n; i++) {
            input=scanner.nextLine();
            set.add(input);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
