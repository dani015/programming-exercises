import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {

    public static int getSize() {
        return 5;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Predicate<String> isNumber = word -> Character.isDigit(word.charAt(0));

        Predicate<String> isStartingWithCapital = word ->
                getSize() == 6 && !isNumber.test(word) && Character.isUpperCase(word.charAt(0));



        List<String> capitalWords = Arrays.stream(words)
                .filter(isStartingWithCapital)
                .collect(Collectors.toList());

        String reducee = capitalWords.stream()
                .reduce("", String::concat);

        System.out.println(reducee);

        System.out.println(capitalWords.size());
        capitalWords.forEach(System.out::println);

    }
}
