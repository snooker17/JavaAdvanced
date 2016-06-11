import java.util.Scanner;
import java.util.Stack;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] numbers=scanner.nextLine().split(" ");
        int pushNumbers=Integer.parseInt(numbers[0]);
        int popNumbers=Integer.parseInt(numbers[1]);
        int checkifPresent=Integer.parseInt(numbers[2]);

        String[] inputNums=scanner.nextLine().split(" ");

        Stack<Integer> stack=new Stack<>();
        Stack<Integer> minStack=new Stack<>();

        int element=0;

        for (int i = 0; i < pushNumbers; i++) {
            element=Integer.parseInt(inputNums[i]);
            stack.push(element);
            if (minStack.isEmpty()){
                minStack.push(element);
            }else if (element<=minStack.peek()){
             minStack.push(element);
            }
        }


        for (int i = 0; i < popNumbers; i++) {
            element=stack.pop();
            if(element==minStack.peek()){
                minStack.pop();
            }
        }

        if (stack.size()==0){
            System.out.println(0);
        }else if(stack.contains(checkifPresent)){
            System.out.println(true);
        }else{
            System.out.println(minStack.pop());
        }



    }
}
