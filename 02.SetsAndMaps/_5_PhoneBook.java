import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _5_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String phones=scanner.nextLine();

        Map<String,String> map=new TreeMap<>();
        while(!(phones.equals("search"))){
                String[] phoneBook = phones.split("-");
                map.put(phoneBook[0], phoneBook[1]);
                phones = scanner.nextLine();
            }

        phones=scanner.nextLine();

        while (!(phones.equals("stop"))){

                if (map.containsKey(phones)){
                    System.out.println(phones+" -> "+map.get(phones));
                }else{
                    System.out.println("Contact "+phones+" does not exist.");
                }
            phones=scanner.nextLine();
            }
        }

}
