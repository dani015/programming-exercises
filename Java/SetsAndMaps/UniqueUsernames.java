import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> words = new LinkedHashSet<>();

        int count = Integer.parseInt(sc.nextLine());

        String line;

        while(count-- != 0){
            line = sc.nextLine();

            words.add(line);
        }

        words.forEach(System.out::println);


    }
}
