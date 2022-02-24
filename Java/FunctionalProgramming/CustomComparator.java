import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Comparator<Integer> compare = (a, b) -> {
            boolean firstEven = a % 2 == 0;
            boolean secondEven = b % 2 == 0;
            if(firstEven && !secondEven){
                return -1;
            } else if(!firstEven && secondEven){
                return 1;
            } else {
                return a - b;
            }
        };

        Collections.sort(numbers, compare);
        numbers.forEach(x -> System.out.printf("%d ", x));
    }
}
