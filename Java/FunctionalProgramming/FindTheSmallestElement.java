import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Function<List<Integer>, Integer> minNumber = num -> {
            Integer thisNum = Integer.MAX_VALUE;
            Integer pos = 0;

            for (int i = 0; i < numbers.size(); i++) {
                    if(numbers.get(i) <= thisNum){
                        thisNum = numbers.get(i);
                        pos = i;
                    }
            }

            return pos;
        };

        System.out.println(minNumber.apply(numbers));
    }
}

