import java.util.Scanner;
import java.util.Stack;

public class _1_ReverseNumbersInStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String s : inputLine) {
            stack.add(Integer.parseInt(s));
        }
        for (int i = 0; i < inputLine.length; i++) {
            System.out.printf(stack.pop()+" ");
        }
    }
}
