import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _11_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());


        String[] input=scanner.nextLine().split(" ");

        boolean stackEmpty=true;
        List<Long> list=new ArrayList<>();
        int counter=0;
        for (int i = 0; i <input.length ; i++) {
            list.add(Long.parseLong(input[i]));
        }
        for (int j = 0;; j++) {
            Stack<Integer> stack = new Stack<>();
            long cycles=list.size();
            stackEmpty=true;
            for (int i = 1; i < cycles; i++) {
                if (list.get(i - 1) < list.get(i)) {
                    stack.push(list.get(Long.parseLong(i));

                }
            }
            while(!(stack.isEmpty())){
                stackEmpty=false;
                list.remove(stack.pop());
            }
            counter++;
            if(stackEmpty){
                System.out.println(counter-1);
                break;
            }
        }
    }
}
