import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String[] numbers = scanner.nextLine().split("\\s+");

        Predicate<String> checkLength = n -> n.length() <= num;

        for (String word : numbers){
            if(checkLength.test(word)) System.out.println(word);
        }
    }
}
