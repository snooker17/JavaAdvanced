import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _7_Emails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name=scanner.nextLine();
        String email=null;
        Map<String,String> map=new LinkedHashMap<>();
        while(!(name.equals("stop"))){
            email=scanner.nextLine();
            if(!((email.contains(".us")||email.contains(".uk")))){
                map.put(name,email);
            }
            name=scanner.nextLine();

        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
