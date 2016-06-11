import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class _8_RecursiveFibonacci {
    static Map<Integer,Long> map=new TreeMap<>();

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        System.out.println(Fib(n+1));

    }

    public static long Fib(int n){
        if(n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }
        if(!map.containsKey(n))
        {
            map.put(n,Fib(n-1)+Fib(n-2));
        }
        return map.get(n);
    }
}
