import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _7_BalancedParanthesis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Stack<Character> stack=new Stack<>();
        boolean isItBalanced=true;
        for (int i = 0; i < input.length(); i++) {
            char check=input.charAt(i);
            if (check=='('||check=='{'||check=='['){
                stack.push(check);
            }else if(check==')'){
                if(stack.isEmpty()||stack.pop()!='('){
                    isItBalanced=false;
                }
            }else if(check=='}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    isItBalanced = false;
                }
            }else if(check==']'){
                if (stack.isEmpty() || stack.pop() != '[') {
                    isItBalanced = false;
                }
            }
        }

        if (isItBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
