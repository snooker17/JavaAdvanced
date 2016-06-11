import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_CalculateSequence {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        ArrayDeque<Long> deque=new ArrayDeque<>();
        deque.addFirst(n);
        for (int i = 1;i<=50 ; i++) {
            if (deque.size()==50){
                break;
            }
            System.out.printf("%d ",deque.peekFirst());
          deque.add(deque.peekFirst()+1);
            deque.add(deque.peekFirst()*2+1);
            deque.add(deque.peekFirst()+2);
            deque.pollFirst();


        }
    }
}
