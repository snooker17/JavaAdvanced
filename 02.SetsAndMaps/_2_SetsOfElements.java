import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] elements=scanner.nextLine().split(" ");

        int firstSet=Integer.parseInt(elements[0]);
        int secondSet=Integer.parseInt(elements[1]);

        Set<Integer> setOne=new HashSet<>();
        Set<Integer> setTwo=new HashSet<>();

        int elementsToadd=0;
        for (int i = 1; i <= firstSet+secondSet; i++) {
            elementsToadd=Integer.parseInt(scanner.nextLine());
            if(i>firstSet){
             setTwo.add(elementsToadd);
            }else{
                setOne.add(elementsToadd);
            }
        }

        for (Integer integer : setOne) {
            if(setTwo.contains(integer)){
                System.out.printf(integer+" ");
            }
        }
    }
}
