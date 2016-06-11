import java.util.*;

public class _6_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String material=scanner.nextLine();

        Long quantity=0L;


        Map<String,Long> map=new LinkedHashMap<>();
        while (!(material.equals("stop"))){
            quantity=Long.parseLong(scanner.nextLine());
            if (map.containsKey(material)){
                map.put(material,map.get(material)+quantity);
            }else {
                map.put(material, quantity);
            }
            material=scanner.nextLine();
        }

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
