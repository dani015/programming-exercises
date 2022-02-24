import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        int div = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> divide = num -> num % div != 0;
        Function<Integer, Boolean> filterNums = divide::test;


        Collections.reverse(numbers);

        numbers.stream().filter(filterNums::apply).forEach(s -> System.out.printf("%d ", s));
        }
    }

