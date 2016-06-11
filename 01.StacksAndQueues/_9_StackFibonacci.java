import java.util.Scanner;
import java.util.Stack;

public class _9_StackFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Stack<Long> stack=new Stack<>();
        stack.push(1L);
        stack.push(1L);
        long elToAdd=0;
        long elToAddSec=0;
        for (int i = 0; i < n; i++) {

            elToAdd=stack.pop();
            elToAddSec+=stack.peek();
            stack.push(elToAdd);

            stack.push(elToAddSec);
        }
        System.out.println(stack.peek());
    }
}
