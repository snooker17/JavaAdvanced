import java.util.Scanner;
import java.util.Stack;

public class _3_MaximumElement {
    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        String[] input=null;

        Stack<Integer> stack=new Stack<>();
        Stack<Integer> maxStack=new Stack<>();
         int elementToPush=0;

        for (int i = 1; i <= n; i++) {

            input = scanner.nextLine().split(" ");
            String option = input[0];

            if (option.equals("1")) {
                elementToPush = Integer.parseInt(input[1]);
                stack.push(elementToPush);
                if(maxStack.isEmpty()){
                    maxStack.push(elementToPush);
                }else if (elementToPush >= maxStack.peek()) {
                    maxStack.push(elementToPush);
                }
            }

            if (option.equals("2")) {
                int element = stack.pop();
                if (element == maxStack.peek()) {
                    maxStack.pop();
                }
            }
            if (option.equals("3")) {
                System.out.println(maxStack.peek());
            }

        }
    }
}
