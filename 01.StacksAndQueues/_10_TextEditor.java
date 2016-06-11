import java.util.Scanner;
import java.util.Stack;

public class _10_TextEditor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cycles=Integer.parseInt(scanner.nextLine());

        int option=0;
        StringBuilder sb=new StringBuilder();
        Stack<String> stack=new Stack<>();
        String input=scanner.nextLine();
        for (int i = 0; i < cycles; i++) {
            String[] commands=input.split(" ");
           option=Integer.parseInt(commands[0]);
           switch(option){
               case 1:sb.append(commands[1]);
                   stack.push(sb.toString());
                   break;
               case 2:
                   int startIndex=Integer.parseInt(commands[1]);
                   sb.delete(sb.length()-startIndex,sb.length());
                   stack.push(sb.toString());
                   break;
               case 3:
                   System.out.println(sb.charAt(Integer.parseInt(commands[1])-1));
                   break;
               case 4:
                   stack.pop();
                   sb.delete(0,sb.length());
                   sb.append(stack.peek());

                   break;
           }
              input=scanner.nextLine();
        }
    }
}
