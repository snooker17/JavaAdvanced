import java.util.HashMap;
import java.util.Map;

public class _8_HandsOfCards {
    public static void main(String[] args) {
        HashMap<String,HashMap<Integer,String>> map=new HashMap<>();
        HashMap<Integer,String> nestedMap=new HashMap<>();

        nestedMap.put(1,"Awesome");
        map.put("value",nestedMap);

        System.out.println(map.get("value").get(1));
    }
}
