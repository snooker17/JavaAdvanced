import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String[] options=scanner.nextLine().split(" ");

        int elementsToAdd=Integer.parseInt(options[0]);
        int elementsToPop=Integer.parseInt(options[1]);
        int checkIfPresent=Integer.parseInt(options[2]);

        Queue<Integer> queue=new LinkedList<>();
        String[] input=scanner.nextLine().split(" ");
        int[] nums=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i]=Integer.parseInt(input[i]);
        }



        for (int i = 0; i <elementsToAdd ; i++) {
         queue.add(nums[i]);
        }
        for (int i = 0; i < elementsToPop ; i++) {
            queue.remove();
        }

        int minElement=Integer.MAX_VALUE;
        for (int num : queue) {
            if(minElement>=num){
                minElement=num;
            }
        }


        if (queue.contains(checkIfPresent)){
            System.out.println("true");
        }else if(queue.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(minElement);
        }






    }
}
