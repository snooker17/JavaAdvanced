import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] input=scanner.nextLine().toCharArray();

        Map<Character,Integer> map=new TreeMap<>();
        int counter=1;
        for (char c : input) {
            if (map.containsKey(c)) {
            map.put(c,map.get(c)+1);
            }
            map.putIfAbsent(c,counter);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue()+" time/s");
        }

    }
}
